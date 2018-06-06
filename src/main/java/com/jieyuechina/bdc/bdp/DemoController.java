package com.jieyuechina.bdc.bdp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gaohongbin
 */
@RestController
public class DemoController {

    @Autowired
    DiscoveryClient discoveryClient;

    @Value("${server.port}")
    String port;

    @GetMapping("/get")
    public String get() {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
    @GetMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }

}
