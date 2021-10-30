package com.example.bigid.configuration;

import com.example.bigid.algo.AlgoC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@PropertySource("classpath:application.properties")
public class AppConfig {


//    @Bean
//    public PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }


    @Bean
    public AlgoC algoCBean(){
        return new AlgoC();
    }




}