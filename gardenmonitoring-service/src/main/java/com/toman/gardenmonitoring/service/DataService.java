package com.toman.gardenmonitoring.service;


import com.toman.gardenmonitoring.service.model.MeasuringBO;

public interface DataService {

    void saveMeasuredData(MeasuringBO measuringBO);
}
