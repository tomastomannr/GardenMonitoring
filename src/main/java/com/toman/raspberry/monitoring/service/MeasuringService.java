package com.toman.raspberry.monitoring.service;

import com.toman.raspberry.monitoring.model.SensorDataDO;

public interface MeasuringService {
    public SensorDataDO measure();
}
