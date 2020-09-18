package com.DotComGames;

import java.util.ArrayList;

/**
 * 修改后的 DotCom
 */
public class DotComDemo {
//    int[] locationCells;
    private ArrayList<String> locationCells;
    int numOfHits = 0;

    //外部传入初始化数组
    public void setLocationCells(ArrayList<String> locs){
        locationCells = locs;
    }

    //检查猜测值
    public String checkYourself(String userInput){
        String result = "miss"; //设置默认值
        //把字符串转换成 int
//        int guess =  Integer.parseInt(userInput);
        //查询指定元素位置
        int index = locationCells.indexOf(userInput);
        //判断索引值大于或等于 0 ，命中！
        if(index >= 0){
           locationCells.remove(index); //删除已经命中的格子
            //判断为空，表示全部命中
            if(locationCells.isEmpty()){
                result = "kill";
            }else{
                result = "hit";
            }
        }


//        //循环遍历每个格子
//        for(int cell: locationCells){
//            //比较格子与猜测值
//            if(guess == cell){
//                result = "hit";
//                numOfHits++;
//                break;
//            }
//        }
//        //判断是否全部命中
//        if(numOfHits == locationCells.length){
//            result = "kill";
//        }
//        System.out.println(result);
        return result;
    }
}
