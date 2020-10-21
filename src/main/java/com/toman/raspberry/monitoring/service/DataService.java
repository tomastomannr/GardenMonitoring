package com.toman.raspberry.monitoring.service;

import com.toman.raspberry.monitoring.model.MeasuringDataBO;

public interface DataService {
    void pushData(MeasuringDataBO measuringDataBO);
}
