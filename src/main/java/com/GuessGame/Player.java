package com.GuessGame;

//玩家，猜测数字
public class Player {
    int number = 0;

    public void guess(){
        number = (int)(Math.random() * 10);  //强制转换成 int类型，赋值给 number
//        System.out.println("I'am guessing " + number);
    }
}
