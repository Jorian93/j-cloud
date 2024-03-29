package cn.jorian.framework.controller;

import cn.jorian.framework.service.UserClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Hellocontroller {

    private final UserClient feignClient;

    /**
     * 此处的mapping是一级controller，调用方法里边绑定了二级的conroller，相当于用http完成一次转发
     *
     * @return
     */
    @GetMapping("/hello")
    public String hello() {
        return feignClient.sayHello();
    }

    @GetMapping("/hi")
    public String hi() {
        return feignClient.sayHi();
    }

    @GetMapping("/haha")
    public String haha() {
        return feignClient.sayHaha();
    }


}
