package com.toman.gardenmonitoring.jpa.model;

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

    @Column
    private BigDecimal sensorTemp1;

    @Column
    private String sensorName2;

    @Column
    private BigDecimal sensorTemp2;

    @Column
    private String sensorName3;

    @Column
    private BigDecimal sensorTemp3;

    @Column
    private String sensorName4;

    @Column
    private BigDecimal sensorTemp4;

    @Column
    private String sensorName5;

    @Column
    private BigDecimal sensorTemp5;

    @Column
    private LocalDateTime timestamp;
}
