package com.korena.testable.config.props;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;


@Data
@ConfigurationProperties(prefix = "aircraft")
public class AircraftProps {
    private String name;
    private Integer fuelLimit;
    private Integer fuelLevel;
    private Integer seatCount;
}
