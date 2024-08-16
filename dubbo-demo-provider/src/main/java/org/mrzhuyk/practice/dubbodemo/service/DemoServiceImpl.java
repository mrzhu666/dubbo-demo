package org.mrzhuyk.practice.dubbodemo.service;

import org.mrzhuyk.practice.dubbodemo.api.DemoService;

import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class DemoServiceImpl implements DemoService {
    
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}