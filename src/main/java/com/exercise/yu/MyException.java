package com.exercise.yu;

import java.io.*;
/**
 * 自定义的一个异常类，继承 Exception 类
 * */
public class MyException extends Exception{
    //此处的amount用来储存当出现异常（取出钱多于余额时）所缺乏的钱
    private double amount;
    //带参数构造方法
    public MyException(double amount){
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }
}
