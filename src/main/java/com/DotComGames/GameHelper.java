package com.DotComGames;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GameHelper {
    public String getUserInput(String param){
        //----------我自己想的---------------
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(param + ": ");
//        String input = scanner.next();
//        return input;


//------------教材上的方法-------------------
        String inputLine = null;
        System.out.println(param + ": ");
        try{
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            inputLine = is.readLine();
            if(inputLine.length() == 0){
                return null;
            }
        } catch (IOException e){
            System.out.println("IOException: "+ e);
        }
        return inputLine;
    }
}
