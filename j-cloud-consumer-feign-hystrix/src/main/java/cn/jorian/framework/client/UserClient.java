package cn.jorian.framework.client;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author: jorian
 * @date: 2020/2/27 10:51
 * @description: this is  description for the class
 */
@FeignClient("provider-user")
public interface UserClient {
    /**
     * @FeignClient(value="provider-user") 应用名称
     * Feign中没有原生的@GetMapping/@PostMapping/@DeleteMapping/@PutMapping，要指定需要用method进行
     *
     * 定义方法，方法上部使用 @RequestMapping(value="/sayHello",method= RequestMethod.GET)
     * 映射转发请求
     */
    @RequestMapping(value="/user/sayHello",method= RequestMethod.GET)
    String hello();

    @RequestMapping(value="/sayHi",method=RequestMethod.GET)
    String sayHi();

    @RequestMapping(value="/sayHaha",method=RequestMethod.GET)
    String sayHaha();





}
