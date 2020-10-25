package com.toman.gardenmonitoring;

import com.toman.gardenmonitoring.service.config.SensorConfiguration;
import com.toman.gardenmonitoring.jpa.repository.MeasuringDataRepository;
import com.toman.gardenmonitoring.jpa.repository.SensorDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class GardenMonitoringApplication implements CommandLineRunner {

	@Autowired
    SensorDataRepository sensorDataRepository;

	@Autowired
	MeasuringDataRepository measuringDataRepository;

	@Autowired
	SensorConfiguration sensorConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(GardenMonitoringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("GardenMonitoringApplication started");
	}
}
