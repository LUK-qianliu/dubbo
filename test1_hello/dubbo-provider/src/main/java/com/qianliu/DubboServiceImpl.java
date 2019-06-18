package com.qianliu;

import com.qianliu.DubboService;

public class DubboServiceImpl implements DubboService {
    @Override
    public String sayHello(String name) {
        return "hello,"+name;
    }
}
