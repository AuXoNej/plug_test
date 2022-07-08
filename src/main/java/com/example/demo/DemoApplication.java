package com.example.demo;

import net.minidev.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.concurrent.TimeUnit;


import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController

public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/ok")
    public String ok(int id) throws InterruptedException {

        JSONObject json = new JSONObject();

        int[] intArray = new int[]{1, 2, 3, 4, 5};
        boolean found = false;
        int res = 5;

        for(int x : intArray){
            if(x == id){
                found = true;
                break;
            }
        }

        if (found){
            res = 1;
            TimeUnit.SECONDS.sleep(5);
        } else if (id < 10) {
            res = 3;
            TimeUnit.SECONDS.sleep(8);
        }
        else {
            TimeUnit.SECONDS.sleep(10);
        }

        json.put("kooficent", res);
        String response = json.toString();
        return response;
    }
}
//http://localhost:8080/ok?id=5