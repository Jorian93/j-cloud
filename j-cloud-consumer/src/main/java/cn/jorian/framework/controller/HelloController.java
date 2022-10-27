package cn.jorian.framework.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author jorian
 */
@RestController
public class HelloController {

    private final RestTemplate resttemplate;

    public HelloController(RestTemplate resttemplate) {
        this.resttemplate = resttemplate;
    }

    @RequestMapping("/hello")
    public String hello() {
        //指出服务地址   http://{服务提供者应用名名称}/{api 地址}
        String url = "http://provider-user/user/sayHello";

        //返回值类型和我们的业务返回值一致
        return resttemplate.getForObject(url, String.class);

    }

    @RequestMapping("/hi")
    public String hi() {
        //指出服务地址   http://{服务提供者应用名名称}/{api 地址}
        String url = "http://provider-user/user/sayHi";

        //返回值类型和我们的业务返回值一致
        return resttemplate.getForObject(url, String.class);

    }

    @RequestMapping("/haha")
    public String haha() {
        //指出服务地址   http://{服务提供者应用名名称}/{具体的controller}
        String url = "http://provider-user/user/sayHaha";
        //返回值类型和我们的业务返回值一致
        return resttemplate.getForObject(url, String.class);

    }
}
