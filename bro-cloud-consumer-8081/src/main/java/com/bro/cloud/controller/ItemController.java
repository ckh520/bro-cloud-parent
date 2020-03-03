package com.bro.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName:ItemController
 * @Description:TODO
 * @Author:admin
 * @Date:2020/2/24 1:24
 * @Version:V1.0
 */
@RestController
@RequestMapping("/consumer/item")
public class ItemController {

    //  private static final String REST_URL_PREFIX = "http://localhost:8080";
    private static final String REST_URL_PREFIX = "http://BRO-CLOUD-PROVIDER";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public String getItem(@PathVariable("id") Integer id) {
        String item = restTemplate.getForObject(REST_URL_PREFIX + "/provider/item/" + id, String.class);

        return "消费:" + item;
    }
}
