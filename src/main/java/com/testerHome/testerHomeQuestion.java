package com.testerHome;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 编程题求解：
 * 为了防止被黑客获取到客户输入的密码，某银行在登录软件上以屏幕输入法输入密码。
 * 该输入法有9个按钮，每个按钮上有不多于3个字母。字母有先后顺序。
 * 按第一个字母需要用鼠标点击按钮一次， 第二个字母需要点击2次，
 * 第三个字母需要点击3次，若连续两个字母都在同一个按钮上，则输入第一个字母后需要等待一小段时间。
 * 假设某客户的输入习惯是：点击按钮需要1单位时间，等待一小段时间为2单位时间，某次登录的时候，
 * 9个按钮上的字母分别为azc dwf gti jql mon pkr shu vex yb，求该客户输入他的密码的时间 。
 * 输入：
 * 该客户的密码都是小写字母[a-z],密码长度<=16
 * 输出：
 * 客户输入密码的时间。
 */
public class testerHomeQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String inputStr = scanner.nextLine();
            System.out.println(inputStr);
            char[] strs = inputStr.toCharArray();
            getTimes(strs);
        }
    }

    public static int getTimes(char[] strs) {
        int times = 0;
        //记录每个按键的单位时间
        Map< String, Integer > values = new HashMap<String, Integer>();
        values.put("a", 1);
        values.put("d", 1);
        values.put("g", 1);
        values.put("j", 1);
        values.put("m", 1);
        values.put("p", 1);
        values.put("s", 1);
        values.put("v", 1);
        values.put("y", 1);
        values.put("z", 2);
        values.put("w", 2);
        values.put("t", 2);
        values.put("q", 2);
        values.put("o", 2);
        values.put("k", 2);
        values.put("h", 2);
        values.put("e", 2);
        values.put("b", 2);
        values.put("c", 3);
        values.put("f", 3);
        values.put("i", 3);
        values.put("l", 3);
        values.put("n", 3);
        values.put("r", 3);
        values.put("u", 3);
        values.put("x", 3);
        //记录每个字母的按键位置
        Map < String, Integer > keys = new HashMap<String, Integer>();
        keys.put("a", 1);
        keys.put("d", 2);
        keys.put("g", 3);
        keys.put("j", 4);
        keys.put("m", 5);
        keys.put("p", 6);
        keys.put("s", 7);
        keys.put("v", 8);
        keys.put("y", 9);
        keys.put("z", 1);
        keys.put("w", 2);
        keys.put("t", 3);
        keys.put("q", 4);
        keys.put("o", 5);
        keys.put("k", 6);
        keys.put("h", 7);
        keys.put("e", 8);
        keys.put("b", 9);
        keys.put("c", 1);
        keys.put("f", 2);
        keys.put("i", 3);
        keys.put("l", 4);
        keys.put("n", 5);
        keys.put("r", 6);
        keys.put("u", 7);
        keys.put("x", 8);
        for (int i = 0; i < strs.length; i++) {
            String c = String.valueOf(strs[i]);
            int time = values.get(c);
            int  key = keys.get(c);//记录当前字母的按键数
            if (i == 0) {
                times = times + time;
                continue;
            }
            //取当前字母的前一个字母
            String cc = String.valueOf(strs[i - 1]);
            int bkey = keys.get(cc);
            if (bkey == key) {//同一个按键上
                times = times + 2;
            }
            times = times + time;
        }
        return times;
    }
}
