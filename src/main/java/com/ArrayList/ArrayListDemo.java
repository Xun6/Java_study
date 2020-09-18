package com.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args){

        //创建对象
        ArrayList<Egg> myList = new ArrayList<Egg>();
        //加入元素
        Egg s = new Egg();
        myList.add(s);
        Egg d = new Egg();
        myList.add(d);

        //查询大小
        int theSize = myList.size();
        System.out.println(theSize);

        //取出数组元素
        for(Egg egg : myList){
            System.out.println(egg);
        }

        //查询特定元素
        boolean isIn = myList.contains(s);
        System.out.println(isIn);

        //查询特定元素的位置
        int idx = myList.indexOf(d);
        System.out.println(idx);

        //判断集合是否为空
        boolean empty = myList.isEmpty();
        System.out.println(empty);

        //删除元素
        myList.remove(s);
    }

    private static class Egg {
    }
}
