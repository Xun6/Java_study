package com.dogs.dogArray;

public class DogDemo {
    public static void main(String[] args){
        Dog[] pets = new Dog[7];
        pets[0] = new Dog();
        pets[1] = new Dog();
        for(int i =0; i <pets.length; i++){
            System.out.println(pets[i]);
        }

        pets[0].eat();
        pets[0].name = "小志";
        System.out.println(pets[0].name+"的小狗要吃饭了！！！");
    }

}

class Dog{
    String name;
    public void eat(){
        System.out.println(name +"的，小狗饿了，要吃东西！！");
    }
}

class Hobbits{
    String names;
    public void hobbitMethod(){
        Hobbits[] hobbits = new Hobbits[3];
        int i = 0;
        while (i < 4){
            hobbits[i] = new Hobbits();
            hobbits[i].names = "hobbits";
            if(i == 1){
                hobbits[i].names = "";
            }
        }
    }
}


