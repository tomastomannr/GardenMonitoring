package com.toman.gardenmonitoring.service.impl;

import com.toman.gardenmonitoring.service.DataService;
import com.toman.gardenmonitoring.service.GardenMonitoringService;
import com.toman.gardenmonitoring.service.RaspberryService;
import com.toman.gardenmonitoring.service.model.MeasuringBO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class GardenMonitoringServiceImpl implements GardenMonitoringService {

    private final RaspberryService raspberryService;
    private final DataService dataService;

    @Autowired
    public GardenMonitoringServiceImpl(final RaspberryService raspberryService, final DataService dataService) {
        System.out.printf("Initialize GardenMonitoringServiceImpl");
        this.raspberryService = raspberryService;
        this.dataService = dataService;
    }

    @Override
    public void scheduledMeasuring() {
        MeasuringBO measuredData = raspberryService.measure();

        dataService.saveMeasuredData(measuredData);
    }
}
