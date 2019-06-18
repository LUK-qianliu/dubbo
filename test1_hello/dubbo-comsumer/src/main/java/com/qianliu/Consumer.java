package com.qianliu;

import com.qianliu.DubboService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        DubboService demoService = (DubboService) context.getBean("dubboService");
        System.out.println("consumer");
        System.out.println(demoService.sayHello("dubbo"));
    }
}
