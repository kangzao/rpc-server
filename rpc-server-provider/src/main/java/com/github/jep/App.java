package com.github.jep;

/*
 * @author: enping.jep
 * @create: 2021-11-17 9:15 上午
 */
public class App {

  //发布服务
  public static void main(String[] args) {
    IHelloService helloService = new HelloServiceImpl();

    RpcProxyServer proxyServer = new RpcProxyServer();
    proxyServer.publisher(helloService, 8080);
  }
}
