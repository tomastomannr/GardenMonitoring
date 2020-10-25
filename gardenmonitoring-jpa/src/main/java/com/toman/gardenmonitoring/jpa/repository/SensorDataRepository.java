package com.toman.gardenmonitoring.jpa.repository;

import com.toman.gardenmonitoring.jpa.model.SensorDataDO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorDataRepository extends CrudRepository<SensorDataDO, String> {

}
