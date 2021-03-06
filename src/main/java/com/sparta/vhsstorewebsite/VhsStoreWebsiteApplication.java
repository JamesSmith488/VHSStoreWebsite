package com.sparta.vhsstorewebsite;

import com.sparta.vhsstorewebsite.entities.UserEntity;
import com.sparta.vhsstorewebsite.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class VhsStoreWebsiteApplication {
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public static void main(String[] args) {
        SpringApplication.run(VhsStoreWebsiteApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(UserRepository userRepository){
        return args -> {
            userRepository.save(new UserEntity(1, "jack", "jackathon" ,  "staffEmail",
                    "skegness",encoder.encode("password"), "STAFF", 1));
            userRepository.save(new UserEntity(2, "john", "johnathan" ,  "customerEmail",
                    "skegness",encoder.encode("password"), "CUSTOMER", 1));
        };
    }
}
