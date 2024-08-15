package com.example.myapp.config;

import com.example.myapp.common.Architect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ArchitectConfig {

    // Make Architect and Agent, though it is not. Then use like component.
    @Bean("architect") //bean id can be used for qualifier or use auto
    public Architect architectAgent() {
        return new Architect();
    }
}
