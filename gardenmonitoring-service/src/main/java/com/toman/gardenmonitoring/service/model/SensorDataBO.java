package com.toman.gardenmonitoring.service.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SensorDataBO {

    private Long id;
    private String sensorId;
    private String sensorName;
    private BigDecimal temperature;
    private LocalDateTime timestamp;

}
