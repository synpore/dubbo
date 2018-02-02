package com.alibaba.dubbo.examples.version.impl;

import com.alibaba.dubbo.examples.version.api.VersionService;

/**
 * Created by hurenxian on 2018/2/2.
 */
public class VersionServiceMock implements VersionService {
    @Override
    public String sayHello(String name) {
        System.out.println("call remote service VersionService method sayHello fail");
        return null;
    }

    @Override
    public String autoLearn(String course) {
        return null;
    }
}
