package com.toman.raspberry.monitoring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class GardenMonitoringApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GardenMonitoringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("GardenMonitoringApplication started");
	}
}
