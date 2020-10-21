package com.toman.raspberry.monitoring.service.impl;

import com.toman.raspberry.monitoring.service.MeasuringService;
import com.toman.raspberry.monitoring.model.MeasuringDataBO;
import com.toman.raspberry.monitoring.model.SensorData;
import com.toman.raspberry.monitoring.model.SensorType;
import java.time.LocalDateTime;
import java.util.Arrays;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.stereotype.Service;

@Service
public class MeasuringServiceImpl implements MeasuringService {

    @Override
    public MeasuringDataBO measure() {
        String localDateTime = LocalDateTime.now().toString();

        SensorData sensorData1 = new SensorData();
        sensorData1.setSensorType(SensorType.OUTSIDE_SUNNY);
        sensorData1.setTemperature(String.valueOf(RandomUtils.nextDouble()));
        sensorData1.setDateTime(localDateTime);

        SensorData sensorData2 = new SensorData();
        sensorData2.setSensorType(SensorType.OUTSIDE_SHADOW);
        sensorData2.setTemperature(String.valueOf(RandomUtils.nextDouble()));
        sensorData2.setDateTime(localDateTime);

        SensorData sensorData3 = new SensorData();
        sensorData3.setSensorType(SensorType.INSIDE_SUNNY);
        sensorData3.setTemperature(String.valueOf(RandomUtils.nextDouble()));
        sensorData3.setDateTime(localDateTime);

        SensorData sensorData4 = new SensorData();
        sensorData4.setSensorType(SensorType.INSIDE_SHADOW);
        sensorData4.setTemperature(String.valueOf(RandomUtils.nextDouble()));
        sensorData4.setDateTime(localDateTime);

        return MeasuringDataBO.builder().dateTime(localDateTime).datas(Arrays.asList(sensorData1, sensorData2, sensorData3, sensorData4)).build();
    }
}
