package com.toman.gardenmonitoring.jpa.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sensor_data")
@EqualsAndHashCode(of = "id")
public class SensorDataDO {

    @Id
    @GeneratedValue()
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String sensorId;

    @Column(nullable = false)
    private String sensorName;

    @Column(nullable = false)
    private BigDecimal temperature;

    @Column(nullable = false)
    private LocalDateTime timestamp;
}
