package com.toman.raspberry.monitoring.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class MeasuringDataBO {

    private String dateTime;
    private List<SensorData> datas;
}
