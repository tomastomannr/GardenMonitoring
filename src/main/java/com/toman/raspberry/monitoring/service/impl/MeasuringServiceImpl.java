package com.toman.raspberry.monitoring.service.impl;

import com.toman.raspberry.monitoring.config.SensorConfiguration;
import com.toman.raspberry.monitoring.model.SensorDataDO;
import com.toman.raspberry.monitoring.service.MeasuringService;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeasuringServiceImpl implements MeasuringService {

    @Autowired
    SensorConfiguration sensorConfiguration;

    @Override
    public SensorDataDO measure() {
        LocalDateTime now = LocalDateTime.now();

        sensorConfiguration.getSensors().forEach();


       return null;
    }
}
