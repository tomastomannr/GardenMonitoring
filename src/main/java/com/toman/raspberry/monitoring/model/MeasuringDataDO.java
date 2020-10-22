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
@Table(name = "measuring_data")
@EqualsAndHashCode(of = "id")
public class MeasuringDataDO {

    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String sensorName1;

    @Column(nullable = false)
    private BigDecimal sensorTemp1;

    @Column(nullable = false)
    private String sensorName2;

    @Column(nullable = false)
    private BigDecimal sensorTemp2;

    @Column(nullable = false)
    private String sensorName3;

    @Column(nullable = false)
    private BigDecimal sensorTemp3;

    @Column(nullable = false)
    private String sensorName4;

    @Column(nullable = false)
    private BigDecimal sensorTemp4;

    @Column(nullable = false)
    private String sensorName5;

    @Column(nullable = false)
    private BigDecimal sensorTemp5;

    @Column(nullable = false)
    private LocalDateTime timestamp;
}
