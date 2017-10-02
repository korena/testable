package com.korena.testable.config;


import com.korena.service.MaintenanceService;
import com.korena.testable.service.Maintenance;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MaintenanceConfig {
    @Bean
    MaintenanceService maintenanceService(){
        return new Maintenance();
    }

}
