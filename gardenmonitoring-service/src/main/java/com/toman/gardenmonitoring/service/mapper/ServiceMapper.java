package com.toman.gardenmonitoring.service.mapper;

import com.toman.gardenmonitoring.jpa.model.MeasuringDataDO;
import com.toman.gardenmonitoring.jpa.model.SensorDataDO;
import com.toman.gardenmonitoring.service.model.MeasuringDataBO;
import com.toman.gardenmonitoring.service.model.SensorDataBO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ServiceMapper {

    MeasuringDataDO map(MeasuringDataBO measuringDataBO);

    SensorDataDO map(SensorDataBO sensorDataBO);

    List<SensorDataDO> mapList(List<SensorDataBO> sensorDataBOList);
}
