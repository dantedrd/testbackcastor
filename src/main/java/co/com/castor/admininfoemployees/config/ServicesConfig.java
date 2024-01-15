package co.com.castor.admininfoemployees.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "co.com.castor.admininfoemployees.domain.service",
        includeFilters = {@ComponentScan.Filter(type = FilterType.REGEX, pattern = "^.+Service")},
        useDefaultFilters = false)
public class ServicesConfig {
}
