package cn.jorian.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class JCloudConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(JCloudConsumerApplication.class, args);
    }

}
