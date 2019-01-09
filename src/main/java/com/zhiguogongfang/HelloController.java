package com.zhiguogongfang;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Log4j2
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping
    public String index(){
        return "Greeting from Spring Boot!";
    }
    @RequestMapping("/info")
    public Map<String,String> getInfo(@RequestParam String name){
        Map<String,String> map =new HashMap<>();
        map.put("name",name);
        return map;
    }
    @RequestMapping("/list")
    public List<Map<String,String>> getList(){
        log.error("Hi ! We have an Error. Hello World");
        List<Map<String,String>> list =new ArrayList<>();
        Map<String,String> map=null;
        for(int i=1;i<=5;i++){
            map =new HashMap<>();
            map.put("name","lingzhi"+i);
            list.add(map);
        }
        return list;
    }
}

