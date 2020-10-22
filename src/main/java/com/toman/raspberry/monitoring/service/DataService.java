package com.toman.raspberry.monitoring.service;

import com.toman.raspberry.monitoring.model.SensorDataDO;

public interface DataService {
    void pushData(SensorDataDO measuringDO);
}
