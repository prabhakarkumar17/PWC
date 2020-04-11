package com.demo.sap;

//import com.google.gson.Gson;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

//import java.util.*;

@RestController
public class commit {

    @RequestMapping("/welcome")
    public static String show(){
        RestTemplate restTemplate = new RestTemplate();
        //Gson g = new Gson();

        final String uri = "https://api.github.com/users/crashTechOnGitHub";
        String result =  restTemplate.getForObject(uri, String.class);
        


        return result;
    }
}