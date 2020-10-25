package com.toman.gardenmonitoring.service.impl;

import com.pi4j.component.temperature.TemperatureSensor;
import com.pi4j.component.temperature.impl.TmpDS18B20DeviceType;
import com.pi4j.io.w1.W1Device;
import com.pi4j.io.w1.W1Master;
import com.toman.gardenmonitoring.service.RaspberryService;
import com.toman.gardenmonitoring.service.config.SensorConfig;
import com.toman.gardenmonitoring.service.config.SensorConfiguration;
import com.toman.gardenmonitoring.service.model.MeasuringBO;
import com.toman.gardenmonitoring.service.model.MeasuringDataBO;
import com.toman.gardenmonitoring.service.model.SensorDataBO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class RaspberryServiceImpl implements RaspberryService {

    private final SensorConfiguration sensorConfiguration;
    private List<W1Device> devices;

    @Autowired
    public RaspberryServiceImpl(final SensorConfiguration sensorConfiguration) {
        this.sensorConfiguration = sensorConfiguration;
        initDevices();
    }

    private void initDevices() {
        W1Master master = new W1Master();
        devices = master.getDevices(TmpDS18B20DeviceType.FAMILY_CODE);
        devices.forEach(device -> System.out.println("Connected device with id: " + device.getId() + " and name: " + device.getName()));
    }

    @Override
    public MeasuringBO measure() {
        LocalDateTime timeStamp = LocalDateTime.now();
        log.info("Measuring started for {} devices with timestamp {}", devices.size(), timeStamp);

        MeasuringBO result = new MeasuringBO();
        result.setSensorsData(new ArrayList<SensorDataBO>());
        MeasuringDataBO measuringDataBO = MeasuringDataBO.builder().timestamp(timeStamp).build();
        for (int i = 0; i < devices.size(); i++) {
            W1Device device = devices.get(i);
            if (sensorConfiguration.getSensors().stream().anyMatch(sensorConfig -> sensorConfig.getId().equalsIgnoreCase(device.getId()))) {
                SensorConfig sensorConfig = sensorConfiguration.getSensors().stream().filter(sensor -> sensor.getId().equalsIgnoreCase(device.getId())).findFirst().get();
                BigDecimal temperature = BigDecimal.valueOf(((TemperatureSensor) device).getTemperature());

                switch (i) {
                    case 0:
                        measuringDataBO.setSensorName1(sensorConfig.getName());
                        measuringDataBO.setSensorTemp1(temperature);
                        break;
                    case 1:
                        measuringDataBO.setSensorName2(sensorConfig.getName());
                        measuringDataBO.setSensorTemp2(temperature);
                        break;
                    case 2:
                        measuringDataBO.setSensorName3(sensorConfig.getName());
                        measuringDataBO.setSensorTemp3(temperature);
                        break;
                    case 3:
                        measuringDataBO.setSensorName4(sensorConfig.getName());
                        measuringDataBO.setSensorTemp4(temperature);
                        break;
                    case 4:
                        measuringDataBO.setSensorName5(sensorConfig.getName());
                        measuringDataBO.setSensorTemp5(temperature);
                        break;
                }

                SensorDataBO sensorDataBO = SensorDataBO.builder().sensorId(sensorConfig.getId()).sensorName(sensorConfig.getName()).temperature(temperature).timestamp(timeStamp).build();
                log.info("Measured sensor data : {}", sensorDataBO.toString());
                result.getSensorsData().add(sensorDataBO);
            }
        }
        result.setMeasuringsData(measuringDataBO);
        log.info("Measuring was completed");

        return result;
    }

//    public String oldMeasure(){
//        W1Master master = new W1Master();
//        List<W1Device> w1Devices = master.getDevices(TmpDS18B20DeviceType.FAMILY_CODE);
//        String temperature = null;
//        for (W1Device device : w1Devices) {
//            //this line is enought if you want to read the temperature
//            if(!StringUtils.isEmpty(String.valueOf(((TemperatureSensor) device).getTemperature()))){
//                temperature= String.valueOf(((TemperatureSensor) device).getTemperature());
//            }
//            System.out.println("Temperature: " + temperature);
//            //returns the temperature as double rounded to one decimal place after the point
//
//            try {
//                System.out.println("1-Wire ID: " + device.getId() +  " value: " + device.getValue());
//                //returns the ID of the Sensor and the  full text of the virtual file
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }
//        return temperature;
//    }
}
