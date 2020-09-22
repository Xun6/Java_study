package com.DotComGames.ComplexFinalVersion;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;  //保存dotcom位置的Array
    private String name;

    //更新 DotCom 位置的setter方法
    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }


    public void setName(String name){
        this.name = name;
    }

    public String checkYourself(String userInput){
        String result = "miss";
        //使用indexOf()方法，如果玩家猜中的话，这个方法返回他的位置，若没有返回-1
        int index = locationCells.indexOf(userInput);
        if(index >= 0){
            //删除被猜中的元素
            locationCells.remove(index);
            //判断是否击沉
            if(locationCells.isEmpty()){
                result = "kill";
                System.out.println("Ouch! You sunk "+ name + ": (");
            }else{
                result = "hit";
            }
        }
        return result;
    }
}
