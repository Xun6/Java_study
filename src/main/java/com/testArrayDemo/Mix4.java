package com.testArrayDemo;

/**
 * 连连看练习
 */
public class Mix4 {
    int counter = 0;
    public static void main(String[] args){
        int count = 0;
        Mix4[] mix4s = new Mix4[20];
        int x =0;
        while(x < 7){
            mix4s[x] =new Mix4();
            mix4s[x].counter = mix4s[x].counter + 1;
            count += 1;
            count = count + mix4s[x].maybeNew(x);
            x = x + 1;
        }
        System.out.println(count + " " + mix4s[1].counter);
    }

    public int maybeNew(int index){
        if(index < 7){
            Mix4 m4 = new Mix4();
            m4.counter = m4.counter + 1;
            return 1;
        }
        return 0;
    }
}
