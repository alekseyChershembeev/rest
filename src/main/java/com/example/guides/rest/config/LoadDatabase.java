package com.example.guides.rest.config;

import com.example.guides.rest.payroll.Employee;
import com.example.guides.rest.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {

private static final Logger log = LoggerFactory.getLogger( LoadDatabase.class );


    @Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository){
        return args -> {
            log.info("Preloading " + employeeRepository.save(new Employee("Bilbo Baggins", "burglar")));
            log.info("Preloading " + employeeRepository.save(new Employee("Frodo Baggins", "thief")));
        };
    }
}
