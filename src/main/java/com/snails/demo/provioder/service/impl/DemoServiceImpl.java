package com.snails.demo.provioder.service.impl;

import com.snails.demo.provioder.service.DemoService;

public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
