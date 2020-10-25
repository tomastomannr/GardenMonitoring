package com.toman.gardenmonitoring.service.config;

import com.toman.gardenmonitoring.service.GardenMonitoringService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ScheduledTasks {

    private final GardenMonitoringService gardenMonitoringService;

    @Autowired
    public ScheduledTasks(final GardenMonitoringService gardenMonitoringService) {
        this.gardenMonitoringService = gardenMonitoringService;
    }

    @Scheduled(cron = "${cron}")
    public void measurementTask() {
        log.info("Started cron expression");
        gardenMonitoringService.scheduledMeasuring();
        log.info("End of cron expression");
    }
}
