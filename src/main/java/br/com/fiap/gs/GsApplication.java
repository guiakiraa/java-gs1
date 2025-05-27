package br.com.fiap.gs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableCaching
@EnableJpaRepositories
@EntityScan
@SpringBootApplication
public class GsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GsApplication.class, args);
    }

}
