package com.DotComGames.ComplexFinalVersion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 创建攻击网站游戏，它有7x7的格子与3间达康公司。
 * 每个达康网站占用3个格子。
 */
public class GameHelper2 {
    private static final String ALPHABET = "abcdefg";
    private int comCount = 0;
    private int gridLength = 7;  //方格长度
    private int gridSize = 49; //方格大小
    private int[] grid = new int[gridSize]; //数组初始化存储方格

    //获取用户输入实现逻辑
    public String getUserInput(String prompt){
        String inputLine = null;
        System.out.println(prompt);
        try{
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if(inputLine.length() == 0){
                return null;
            }
        } catch (IOException e){
            System.out.println("IOException" + e);
        }
        return inputLine.toLowerCase(); //将输入的字符转换成小写
    }


    //获取dotcom 位置实现逻辑
    public ArrayList<String> placeDotCom(int comSize) {
        ArrayList<String> alphaCells = new ArrayList<String>();
        //保存字符串
        String[] alphacoords = new String[comSize];
        //临时字符串
        String temp = null;
        int[] coords = new int[comSize]; //保存现有字符串
        int attempts = 0;
        boolean success = false;  //是否找到合适位置
        int location = 0;  //目前起点

        comCount++;  //现在处理到第n个
        int incr = 1;
        //如果是单数号的，垂直增加
        if((comCount % 2) == 1){
            incr = gridLength; //垂直增量
        }

        //主要搜索循环
        while(!success & attempts++ < 200){
            //随机起点
            location = (int)(Math.random() * gridSize);
            int x = 0;  //第n个位置
            success = true;  //假定成功
            //查找未使用的点
            while(success && x < comSize){
                //如果方格没有被占用
                if(grid[location] == 0){
                    coords[x++] = location;
                    location += incr;
                    //是否超出下边缘
                    if(location >= gridSize){
                        success = false;
                    }
                    //超出右边缘
                    if(x > 0 && (location % gridLength == 0)){
                        success = false;
                    }
                }else{ //找到已使用的位置
                    success = false;
                }
            }
        }


        int x = 0;
        int row = 0;
        int column = 0;
        while(x < comSize){
            grid[coords[x]] = 1;   //标识格子已用
            row = (int)(coords[x] / gridLength); //得到行的值
            column = coords[x] % gridLength; //得到列的值
            temp = String.valueOf(ALPHABET.charAt(column)); //转换成字符串

            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
        }
        return alphaCells;
    }
}
