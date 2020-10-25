package com.toman.gardenmonitoring.service.model;

import java.util.List;

import com.toman.gardenmonitoring.jpa.model.MeasuringDataDO;
import com.toman.gardenmonitoring.jpa.model.SensorDataDO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MeasuringBO {

    MeasuringDataBO measuringsData;
    List<SensorDataBO> sensorsData;
}
