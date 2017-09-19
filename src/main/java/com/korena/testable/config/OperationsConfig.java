package com.korena.testable.config;


import com.korena.testable.Operations;
import com.korena.testable.service.MaintenanceService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OperationsConfig {


    @Bean
    Operations operations(MaintenanceService maintenance){
        return new Operations(maintenance);
    }
}
