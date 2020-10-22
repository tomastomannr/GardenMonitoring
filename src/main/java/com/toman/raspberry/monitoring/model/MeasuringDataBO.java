package com.toman.raspberry.monitoring.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MeasuringDataBO {

    List<MeasuringDataDO> measuringsData;
    List<SensorDataDO> sensorsData;
}
