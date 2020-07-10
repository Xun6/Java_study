package com.exercise.yu;

import java.io.*;
/**
 * 抛出一个我自定义的异常
 * */

//模拟一个银行账户
public class CheckingAccount {

    //balance为余额，number为卡号
    private double balance;
    private String number;
    public CheckingAccount(double balance,String number){
        this.balance = balance;
        this.number = number;
    }

    //存钱
    public void deposit(double amounts){
        balance += amounts;
    }

    //取钱
    public void withdraw(double amounts) throws MyException {
        if(amounts <= balance){
            balance -= amounts;
        }else{
            double num = balance - amounts;
            //抛出异常
            throw new MyException(num);
        }
    }

    //返回余额
    public double getBalance(){
        return balance;
    }

    //返回卡号
    public String getNumber(){
        return number;
    }

}
