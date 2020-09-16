package com.DotComGames;

import com.GuessGame.GuessGameDemo;

public class SimpleDotComGameStart {
    public static void main(String[] args){
        //记录玩家猜测次数
        int numOfGuess = 0;
        //创建玩家对象
        GameHelper gameHelper = new GameHelper();
        //创建dot com 对象
        SimpleDotCom simpleDotCom = new SimpleDotCom();
        //获取 0 ~ 4 的随机数
        int randomNum = (int)(Math.random() * 5);
        //初始化赋值数组
        int[] loc = {randomNum,randomNum+1,randomNum+2};
        //赋值给dot com对象
        simpleDotCom.setLocationCells(loc);
        boolean isAlive = true;
        //执行猜测匹配
        while(isAlive){
            //保存玩家提出的猜测
            String userGuess = gameHelper.getUserInput("enter a number");
            //执行猜测匹配逻辑
            String result = simpleDotCom.checkYourself(userGuess);
            numOfGuess += 1;  //猜测次数递增
            if(result == "kill"){
                isAlive = false; //跳出循环
            }
        }
        System.out.println("You took "+ numOfGuess + " guesses.");
    }
}
