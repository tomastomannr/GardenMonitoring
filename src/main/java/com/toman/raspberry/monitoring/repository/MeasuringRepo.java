package com.toman.raspberry.monitoring.repository;

import com.toman.raspberry.monitoring.model.MeasuringDO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface MeasuringRepository extends CrudRepository<MeasuringDO, String> {
}
