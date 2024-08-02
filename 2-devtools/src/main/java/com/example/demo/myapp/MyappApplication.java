package com.example.demo.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
SpringBootApplication encapsulates
@EnableAutoConfiguration, @ComponentScan, @Configuration (@Bean)
 */

/*
ComponentScan only scans sub-packages. If I want to include pakcages outside
the core application I can do this by parameterizing the annotation like so
 */
@SpringBootApplication(scanBasePackages = {"com.example.demo.myapp",
        "com.example.utils", "org.thirdcode.web"})
public class MyappApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyappApplication.class, args);
    }

}
