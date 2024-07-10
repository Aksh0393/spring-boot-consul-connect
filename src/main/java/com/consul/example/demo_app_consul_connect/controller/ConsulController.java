package com.consul.example.demo_app_consul_connect.controller;
import org.springframework.web.bind.annotation.*;

import com.consul.example.demo_app_consul_connect.service.ConsulService;
import com.ecwid.consul.v1.Response;


@RestController
@RequestMapping("/v1")
public class ConsulController {

    private final ConsulService consulService;

    public ConsulController(ConsulService consulService) {
        this.consulService = consulService;
    }

    @GetMapping("/hello")
    public String getMarks() {
        return "Hello from SB App!!";
    }
    @GetMapping("/marks/{name}")
    public String getMarks(@PathVariable String name) {
        String res = consulService.getValue(name);
        if(null == res) return "No Data found in consul kv";
        return res;
    }

    @SuppressWarnings("unchecked")
    @PostMapping("/value")
    public Response<Boolean> putMarks(@RequestParam String name, @RequestParam Integer marks) {
        return consulService.putValue(name, marks);
    }

}
