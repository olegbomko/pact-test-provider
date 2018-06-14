package com.example.pacttestprovider;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Oleg Bomko on 12/06/2018.
 */
@RestController
public class ProviderController {

    @RequestMapping("/getHello")
    public String hello() {
        return "Hello from pact test provider service";
    }
}
