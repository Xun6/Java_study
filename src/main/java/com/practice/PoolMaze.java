package com.practice;

public class PoolMaze {
    public static void main(String[] args){
        Echo echoOne = new Echo();
        Echo echoTwo = new Echo();

        int x = 0;
        while(x < 4){
            echoOne.hello();
            echoOne.count = echoOne.count + 1;
            if(x == 3){
                echoTwo.count = echoTwo.count + 1;
            }
            if(x > 0){
                echoTwo.count = echoTwo.count + echoOne.count;
            }
            x = x + 1;
        }
        System.out.println(echoTwo.count);
    }
}

class Echo{
    int count = 0;
    void hello(){
        System.out.println("helloooo.... ");
    }
}
