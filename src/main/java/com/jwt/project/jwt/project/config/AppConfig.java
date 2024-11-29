package com.jwt.project.jwt.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppConfig {
    @Bean
    public UserDetailsService userDetailsService(){
    UserDetails user= User.builder().username("sandeep").password(passwordEncoder().encode("keshari")).roles("ADMIN").build();
    UserDetails user2= User.builder().username("romi").password(passwordEncoder().encode("keshari")).roles("ADMIN").build();


        return new InMemoryUserDetailsManager(user,user2);
    }
@Bean
    public PasswordEncoder passwordEncoder(){
        return  new BCryptPasswordEncoder();
    }
}
