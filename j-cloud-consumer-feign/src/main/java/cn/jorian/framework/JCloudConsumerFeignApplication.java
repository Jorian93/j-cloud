package cn.jorian.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


/**
 * @author jorian
 */
@SpringCloudApplication
@EnableEurekaClient //表明这是一个eureka客户端
@EnableFeignClients(basePackages = "cn.jorian.*") //开启feign
public class JCloudConsumerFeignApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(JCloudConsumerFeignApplication.class, args);
	}

}
