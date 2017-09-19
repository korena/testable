package com.korena.testable.config;


import com.korena.testable.service.Maintenance;
import com.korena.testable.service.MaintenanceService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MaintenanceConfig {
    @Bean
    MaintenanceService maintenanceService(){
        return new Maintenance();
    }

}
