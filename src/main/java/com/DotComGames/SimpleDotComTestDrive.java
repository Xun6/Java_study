package com.DotComGames;

import jdk.nashorn.internal.ir.LexicalContext;

import java.util.Scanner;

/**
 * dotCom游戏的测试类
 */
public class SimpleDotComTestDrive {
    public static void main(String[] args){
        int numOfGuess = 0;
        Scanner scanner = new Scanner(System.in);
        //初始化对象
        SimpleDotCom dot = new SimpleDotCom();
        //创建带有 dotcom 位置的数组
        int[] locations = {2,3,4};
        //调用 setter 方法
        dot.setLocationCells(locations);
        System.out.print("enter a number: ");
        boolean isAlive = true;
        //循环猜测
        while(isAlive){
            //猜测输入
            String userGuess = scanner.next();
            //调用被测方法并传入假的数据
            String result = dot.checkYourself(userGuess);
            numOfGuess += 1;
            String testResult = "failed";
            //判断满足条件则通过
            if(result.equals("hit")){
                testResult = "passed";
            }
            if(result.equals("kill")){
                testResult = "GAME OVER";
                isAlive = false;
            }
            System.out.println(testResult);
        }
        //输出猜测次数
        System.out.println("总共猜测：" + numOfGuess+ " 次");
    }
}
