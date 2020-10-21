package com.toman.raspberry.monitoring.config;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.ResourceUtils;

@Slf4j
public class FirebaseConfiguration {

    private static final String DATABASE_URL = "https://datastorage-21636.firebaseio.com/";
    private static final String DATABASE_CONFIG_FILE_PATH = "classpath:datastorage-21636-firebase-adminsdk-z562s-fe7da9408a.json";

    public FirebaseConfiguration() {
        try{
            FileInputStream refreshToken = new FileInputStream(ResourceUtils.getFile(DATABASE_CONFIG_FILE_PATH));

            FirebaseOptions options = FirebaseOptions.builder()
                    .setCredentials(GoogleCredentials.fromStream(refreshToken))
                    .setDatabaseUrl(DATABASE_URL)
                    .build();

            FirebaseApp.initializeApp(options);
        }catch(IOException ex){
            log.error(ex.getMessage());
        }
    }
}
