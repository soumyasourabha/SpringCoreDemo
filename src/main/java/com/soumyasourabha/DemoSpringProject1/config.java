package com.soumyasourabha.DemoSpringProject1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.soumyasourabha.DemoSpringProject1")
@PropertySource("classpath:application.properties")
public class config {

}
