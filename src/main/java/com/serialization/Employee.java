package com.serialization;

// >>TODO 假设我们定义了如下的Employee类，该类实现了Serializable 接口。
/**
 * 一个类的对象要想序列化成功，必须满足两个条件：
 *     1、该类必须实现 java.io.Serializable 接口。
 *     2、该类的所有属性必须是可序列化的。如果有一个属性不是可序列化的，则该属性必须注明是短暂的。
 *     3、如果你想知道一个 Java 标准类是否是可序列化的，请查看该类的文档。
 *        检验一个类的实例是否能序列化十分简单，
 *        只需要查看该类有没有实现 java.io.Serializable接口。
 */

public class Employee implements java.io.Serializable{
    public String name;
    public String address;
    public transient int SSN;
    public int number;
    public void mailCheck(){
        System.out.println("mail寄送到："+name + " " + address);
    }
}
