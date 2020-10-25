package com.toman.gardenmonitoring.service.impl;

import com.toman.gardenmonitoring.jpa.repository.MeasuringDataRepository;
import com.toman.gardenmonitoring.jpa.repository.SensorDataRepository;
import com.toman.gardenmonitoring.service.DataService;
import com.toman.gardenmonitoring.service.mapper.ServiceMapper;
import com.toman.gardenmonitoring.service.model.MeasuringBO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DataServiceImpl implements DataService {

    private final MeasuringDataRepository measuringDataRepository;
    private final SensorDataRepository sensorDataRepository;
    private final ServiceMapper mapper;

    public DataServiceImpl(final MeasuringDataRepository measuringDataRepository, final SensorDataRepository sensorDataRepository, final ServiceMapper mapper) {
        System.out.printf("Initialize DataServiceImpl");
        this.measuringDataRepository = measuringDataRepository;
        this.sensorDataRepository = sensorDataRepository;
        this.mapper = mapper;
    }

    @Override
    public void saveMeasuredData(MeasuringBO measuringBO) {
        measuringDataRepository.save(mapper.map(measuringBO.getMeasuringsData()));
        sensorDataRepository.saveAll(mapper.mapList(measuringBO.getSensorsData()));
    }
}
