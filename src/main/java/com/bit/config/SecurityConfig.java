package com.bit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity //active spring web security
public class SecurityConfig {
    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails admin = User
                .withUsername("CR7")
                .password("{noop}admin")
                .roles("admin", "user")
                .build();
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("M10")
                .password("user")
                .roles("user")
                .build();
        return new InMemoryUserDetailsManager(admin,user);
    }
}
