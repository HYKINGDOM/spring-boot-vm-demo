package com.java.talent.platform.vm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author kscs
 */
@EnableJpaRepositories
@SpringBootApplication
public class SpringBootVmDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootVmDemoApplication.class, args);
    }

}
