package sk.tuke.kpi.ibeach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class iBeachApp {
    public static void main(String[] args) {
        SpringApplication.run(iBeachApp.class, args);
        System.out.println("Starting iBeach...");
    }
}
