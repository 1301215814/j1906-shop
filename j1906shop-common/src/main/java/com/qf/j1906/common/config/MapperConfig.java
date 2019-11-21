package com.qf.j1906.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import java.util.Properties;


@Configuration
public class MapperConfig {
    @Bean
    public MapperScannerConfigurer scannerConfigurer(){
        MapperScannerConfigurer scannerConfigurer = new MapperScannerConfigurer ();
        scannerConfigurer.setSqlSessionFactoryBeanName ("sqlSessionFactory");
        scannerConfigurer.setBasePackage ("com.qf.j1906.*.mapper");
        Properties properties = new Properties ();
        properties.setProperty ("notEmpty","false");
        properties.setProperty ("IDENTITY","MYSQL");
        properties.setProperty ("mappers","com.qf.j1906.common.config.BaseMapper");
        scannerConfigurer.setProperties (properties);
        return scannerConfigurer;
    }
}
