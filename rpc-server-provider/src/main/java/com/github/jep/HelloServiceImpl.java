package com.github.jep;



/*
 * @author: enping.jep
 * @create: 2021-11-17 8:49 上午
 */
public class HelloServiceImpl implements IHelloService {


  @Override
  public String sayHello(String content) {
    System.out.println("request in sayHello:" + content);
    return "Say Hello:" + content;
  }

  @Override
  public String saveUser(User user) {
    System.out.println("request in saveUser:" + user);
    return "SUCCESS";
  }
}
