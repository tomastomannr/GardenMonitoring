package com.toman.raspberry.monitoring.service.impl;

import com.toman.raspberry.monitoring.service.DataService;
import com.toman.raspberry.monitoring.service.MeasuringService;
import com.toman.raspberry.monitoring.service.MonitoringService;
import com.toman.raspberry.monitoring.model.MeasuringDO;

//@Service
public class MonitoringServiceImpl implements MonitoringService {

    private final MeasuringService measuringService;
    private final DataService dataService;

//    @Autowired
    public MonitoringServiceImpl(final MeasuringService measuringService, final DataService dataService) {
        this.measuringService = measuringService;
        this.dataService = dataService;
    }

    @Override
    public void scheduledMeasuring() {
        //call measurement on sensors and get data
        final MeasuringDO measuringData = measuringService.measure();

        //send data to cloud
        dataService.pushData(measuringData);
    }
}
