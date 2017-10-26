package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DataSourceConfig {

    @Bean("datasource")
    @Profile("development")
    DataSource dataSourceDev() {

        return new DataSource("myURLDev",9000);
    }

    @Bean("datasource")
    @Profile("production")
    DataSource dataSourceProd() {
        return new DataSource("myURLProd",9000);
    }





}