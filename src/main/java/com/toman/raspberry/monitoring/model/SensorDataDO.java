package com.toman.raspberry.monitoring.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

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
    private Integer sensorId;

    @Column(nullable = false)
    private String sensorName;

    @Column(nullable = false)
    private BigDecimal temperature;

    @Column(nullable = false)
    private LocalDateTime timestamp;
}
