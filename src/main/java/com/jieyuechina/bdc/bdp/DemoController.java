package com.jieyuechina.bdc.bdp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gaohongbin
 */
@RestController
public class DemoController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/get")
    public String get() {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }

}
