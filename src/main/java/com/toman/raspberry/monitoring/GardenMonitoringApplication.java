package com.toman.raspberry.monitoring;

import com.toman.raspberry.monitoring.config.SensorConfiguration;
import com.toman.raspberry.monitoring.repository.MeasuringRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class GardenMonitoringApplication implements CommandLineRunner {

	@Autowired
	MeasuringRepository measuringRepo;

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
