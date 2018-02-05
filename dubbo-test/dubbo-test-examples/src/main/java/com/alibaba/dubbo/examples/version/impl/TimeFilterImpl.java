package com.alibaba.dubbo.examples.version.impl;

import com.alibaba.dubbo.rpc.*;

import java.util.Date;

/**
 * Created by hurenxian on 2018/2/2.
 * user defined  filter just for test
 */
public class TimeFilterImpl implements Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        System.out.println("time filter 1"+new Date());
        return invoker.invoke(invocation);
    }
}
