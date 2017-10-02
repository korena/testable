package com.korena.testable.config;


import com.korena.testable.config.props.AircraftProps;
import com.korena.aircraft.model.Aircraft;
import com.korena.testable.model.Boing_777;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AircraftConfig {

    @Bean
    Aircraft aircraft(AircraftProps aircraftProps) {
        return new Boing_777(aircraftProps.getName(),
                aircraftProps.getSeatCount(),
                aircraftProps.getFuelLevel(),
                aircraftProps.getFuelLimit());
    }

}
