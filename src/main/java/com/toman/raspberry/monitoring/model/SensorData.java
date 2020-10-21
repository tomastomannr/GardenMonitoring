package com.toman.raspberry.monitoring.model;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SensorData {

    private SensorType sensorType;
    private String temperature;
    private String dateTime;
}
