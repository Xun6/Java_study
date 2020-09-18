package com.DotComGames.ComplexFinalVersion;

import java.util.ArrayList;

public class DotComBust {
    //声明并初始化变量
    private GameHelper2 helper = new GameHelper2();
    private ArrayList<DotCom> myList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    //Game开始前准备
    private void setUpGame(){
        //first make some dot coms and give them locations
        //创建 3 个DotCom对象并指派名称并置入ArrayList
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("xiaoyu.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        //添加数组对象
        myList.add(one);
        myList.add(two);
        myList.add(three);
        //列出简短的提示
        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, xiaoyu.com, Go2,com");
        System.out.println("Try to sink them all in the fewest number of guesses.");

        //对list中的每个DotCom重复一次
        for(DotCom dotCom : myList){
            //要求DotCom的位置
            ArrayList<String> newLocation = helper.placeDotCom(3);
            //调用这个DotCom 的 setter方法来指派刚取得的位置
            dotCom.setLocationCells(newLocation);
        }
    }


    //游戏开始
    private void startPlaying(){
        //判断DotCom 的list是否为空
        while (!myList.isEmpty()){
            String userGuess = helper.getUserInput("Enter a guess: ");
            //调用 checkUserGuess 方法
            checkUserGuess(userGuess);
        }
        //调用 finishGame方法
        finishGame();

    }

    private void checkUserGuess(String userGuess){
        //递增玩家猜测次数的计数
        numOfGuesses++;
        //先假设没有命中
        String result = "miss";
        //对list中所有的DotCom重复
        for(DotCom dotComToTest : myList){
            //要求DotCom检查是否命中或击沉
            result = dotComToTest.checkYourself(userGuess);
            if(result.equals("hit")){
                break;  //提前跳出循环
            }
            if(result.equals("kill")){
                //这家伙被挂掉了
                myList.remove(dotComToTest);
                break;
            }
        }
        //列出结果
        System.out.println(result);
    }

    private void finishGame(){
        //列出玩家成绩
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");
        if(numOfGuesses <= 18){
            System.out.println("It only took you "+ numOfGuesses + "guesses.");
            System.out.println("You got out before your options.");
        }else{
            System.out.println("Took you long enough."+ numOfGuesses + "guesses.");
            System.out.println("Fish are dancing with your options.");
        }
    }

    //主程序入口
    public static void main(String[] args){
        //创建游戏对象
        DotComBust game = new DotComBust();
        //要求游戏对象启动
        game.setUpGame();
        //要求游戏对象启动游戏的主要循环
        game.startPlaying();
    }
}
