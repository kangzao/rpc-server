package com.github.jep;

import java.io.Serializable;

/*
 * @author: enping.jep
 * @create: 2021-11-17 8:44 上午
 */
public class RpcRequest implements Serializable {

  private String className;
  private String methodName;
  private Object[] parameters;

  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public String getMethodName() {
    return methodName;
  }

  public void setMethodName(String methodName) {
    this.methodName = methodName;
  }

  public Object[] getParameters() {
    return parameters;
  }

  public void setParameters(Object[] parameters) {
    this.parameters = parameters;
  }
}