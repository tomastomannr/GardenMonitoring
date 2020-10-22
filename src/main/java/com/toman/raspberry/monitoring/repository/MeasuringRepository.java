package com.toman.raspberry.monitoring.repository;

import com.toman.raspberry.monitoring.model.SensorDataDO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeasuringRepository extends CrudRepository<SensorDataDO, String> {

}
