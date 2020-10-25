package com.toman.gardenmonitoring.service.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MeasuringDataBO {

    private Long id;
    private String sensorName1;
    private BigDecimal sensorTemp1;
    private String sensorName2;
    private BigDecimal sensorTemp2;
    private String sensorName3;
    private BigDecimal sensorTemp3;
    private String sensorName4;
    private BigDecimal sensorTemp4;
    private String sensorName5;
    private BigDecimal sensorTemp5;
    private LocalDateTime timestamp;
}
