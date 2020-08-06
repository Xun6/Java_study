package com.serialization;

// >> TODO 下面的 DeserializeDemo 程序实例了反序列化，C:/Users/13617/Desktop/employee.ser 存储了 Employee 对象。

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
    public static void main(String[] args){
        Employee e = null;  //创建一个空对象引用
        try{
            FileInputStream fileIn = new FileInputStream("C:/Users/13617/Desktop/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            //取出对象并反序列化
            e = (Employee)in.readObject();
            in.close();
            fileIn.close();
        }catch(IOException i){
            i.printStackTrace();
            return;
        }catch(ClassNotFoundException c){
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("反序列化 Employee....");
        System.out.println("Name: "+ e.name);
        System.out.println("Address: "+ e.address);
        System.out.println("SSN: "+ e.SSN);
        System.out.println("Number: "+ e.number);
    }
}
