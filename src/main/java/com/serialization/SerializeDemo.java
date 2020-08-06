package com.serialization;


// TODO ObjectOutputStream 类用来序列化一个对象
// TODO 如下的 SerializeDemo 例子实例化了一个 Employee 对象，并将该对象序列化到一个文件中
// >> TODO  注意：当序列化一个对象到文件时， 按照 Java 的标准约定是给文件一个 .ser 扩展名。

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args){
        Employee e = new Employee();
        e.name = "小鱼";
        e.address = "杭州滨江阿里中心";
        e.SSN = 1111223;
        e.number = 110;
        try{
            FileOutputStream fileOut = new FileOutputStream("C:/Users/13617/Desktop/employee.ser");
            //序列化对象
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            //将对象序列化到一个文件中
            out.writeObject(e);
            out.close();
            fileOut.close();
        }catch(IOException i){
            i.printStackTrace();
        }
    }
}
