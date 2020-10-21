package com.toman.raspberry.monitoring.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class MeasuringDO {

    private Integer id;
    private Integer sensorId;
    private String sensorName;
    private BigDecimal temperature;
    private LocalDateTime timestamp;
}
