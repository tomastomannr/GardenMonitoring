package com.toman.raspberry.monitoring.service;

import com.toman.raspberry.monitoring.model.MeasuringDO;

public interface DataService {
    void pushData(MeasuringDO measuringDO);
}
