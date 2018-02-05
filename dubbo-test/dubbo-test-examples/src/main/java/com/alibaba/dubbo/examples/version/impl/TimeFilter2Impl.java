package com.alibaba.dubbo.examples.version.impl;

import com.alibaba.dubbo.rpc.*;

import java.util.Date;

/**
 * Created by hurenxian on 2018/2/2.
 */
public class TimeFilter2Impl implements Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        System.out.println("time filter 2"+new Date());
        return invoker.invoke(invocation);
    }
}
