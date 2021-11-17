package com.github.jep;

/*
 * @author: enping.jep
 * @create: 2021-11-17 8:44 上午
 */
public interface IHelloService {

  //
  String sayHello(String content);

  /**
   * 保存用户
   */
  String saveUser(User user);

}
