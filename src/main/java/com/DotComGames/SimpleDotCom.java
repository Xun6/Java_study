package com.DotComGames;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    //外部传入初始化数组
    public void setLocationCells(int[] locs){
        locationCells = locs;
    }

    //检查猜测值
    public String checkYourself(String stringGuess){
        //把字符串转换成 int
        int guess =  Integer.parseInt(stringGuess);
        String result = "miss"; //默认值

        //循环遍历每个格子
        for(int cell: locationCells){
            //比较格子与猜测值
            if(guess == cell){
                result = "hit";
                numOfHits++;
                break;
            }
        }
        //判断是否全部命中
        if(numOfHits == locationCells.length){
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}
