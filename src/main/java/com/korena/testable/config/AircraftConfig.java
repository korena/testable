package com.korena.testable.config;


import com.korena.testable.model.Aircraft;
import com.korena.testable.model.Boing_777;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AircraftConfig {

    @Bean
    Aircraft aircraft() {
        return new Boing_777("Emirates", 200, 100);
    }

}
