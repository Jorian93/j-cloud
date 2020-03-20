package cn.jorian.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author jorian
 */
@SpringBootApplication
@EnableEurekaClient //表明这是一个eureka客户端
public class JCloudProvider1Application {

    public static void main(String[] args) {
        SpringApplication.run(JCloudProvider1Application.class, args);
    }

}
