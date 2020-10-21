package com.toman.raspberry.monitoring.scheduler;

import com.toman.raspberry.monitoring.service.MonitoringService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//@Component
@Slf4j
public class ScheduledTasks {

    private final MonitoringService monitoringService;

//    @Autowired
    public ScheduledTasks(final MonitoringService monitoringService) {
        this.monitoringService = monitoringService;
    }

//    @Scheduled(cron = "0 * * * * *")
    public void measurementTask(){
      log.info("meraaaaam");
      monitoringService.scheduledMeasuring();
    }
}
