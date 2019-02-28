package rpc;

import ch.qos.logback.classic.Level;
import com.github.m5.netutil.rpc.YrpcServer;
import com.github.m5.netutil.rpc.config.ServerConfig;
import com.github.m5.netutil.util.LogLevelUtils;

import java.util.Scanner;

/**
 * @author xiaoyu
 */
public class RpcServerTest {
    public static void main(String[] args) {
        LogLevelUtils.setRootLevel(Level.INFO);

        ServerConfig config = new ServerConfig();
        config.addService(HelloService.class.getName(), new HelloServiceImpl());
        config.addService(GreetingService.class.getName(), new GreetingServiceImpl());

        YrpcServer yrpcServer = new YrpcServer(1111, config);

        System.out.println("启动结果：" + yrpcServer.isOpen());

    }
}