package com.toman.raspberry.monitoring.service.impl;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.toman.raspberry.monitoring.model.MeasuringDataBO;
import com.toman.raspberry.monitoring.model.SensorData;
import com.toman.raspberry.monitoring.model.SensorType;
import com.toman.raspberry.monitoring.service.DataService;
import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

//@Service
public class DataServiceImpl implements DataService {

    private static final String CHILD_SENSOR_REF = "sensor_data";
    private static final String CHILD_MEASURING_DATA_REF = "measuring_data";

    @Override
    public void pushData(MeasuringDataBO measuringDataBO) {
        final DatabaseReference sensorDbTempRef = FirebaseDatabase.getInstance().getReference().child(CHILD_SENSOR_REF);
        final DatabaseReference sensorDbRef = sensorDbTempRef.push();

        final DatabaseReference measuringDbTempRef = FirebaseDatabase.getInstance().getReference().child(CHILD_MEASURING_DATA_REF);
        final DatabaseReference measuringDbRef = measuringDbTempRef.push();


        sensorDbRef.setValueAsync(measuringDataBO.getDatas());
        sensorDbRef.push();

//        measuringDataBO.getDatas().stream().forEach(sensorData -> {
//            sensorDbRef.setValueAsync(sensorData);
//            sensorDbRef.push();
//        });
        measuringDbRef.setValueAsync(measuringDataBO);
        measuringDbRef.push();
    }
}
