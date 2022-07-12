package com.example.demo;

import net.minidev.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

class Client {
    private int id;
    private String name;


    public Client(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int brand) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

@SpringBootApplication
@RestController

public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @PostMapping("/ok")
    public JSONObject ok(@RequestBody Client client) throws InterruptedException {
        JSONObject json_response = new JSONObject();

        int[] intArray = new int[]{1, 2, 3, 4, 5};
        boolean found = false;

        int kooficent = 5;
        int id = client.getId();

        for(int x : intArray){
            if(x == id){
                found = true;
                break;
            }
        }

        if (found){
            kooficent = 1;
            TimeUnit.SECONDS.sleep(5);
        } else if (id < 10) {
            kooficent = 3;
            TimeUnit.SECONDS.sleep(8);
        }
        else {
            TimeUnit.SECONDS.sleep(10);
        }

        json_response.put("id", id);
        json_response.put("kooficent", kooficent);

        return json_response;
    }
}
//http://localhost:8080/ok