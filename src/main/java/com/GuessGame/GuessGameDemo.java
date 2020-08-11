package com.GuessGame;

//表示游戏程序类
public class GuessGameDemo {
    //创建三个实例变量
    Player p1;
    Player p2;
    Player p3;

    public void StartGuessGame(){
        //实例化三个对象
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        //创建三个变量，保存猜测值
        int guess1 = 0;
        int guess2 = 0;
        int guess3 = 0;

        //创建三个变量，保存是否猜中
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

//        int guessNumber = (int)(Math.random() * 10);

        while(true){
            int guessNumber = (int)(Math.random() * 10);
            System.out.println("设置的目标数值为：" + guessNumber);
            //调用 Player 的 guess()方法
            p1.guess();
            p2.guess();
            p3.guess();

            //把执行guess()方法后的number赋值给变量
            guess1 = p1.number;
            System.out.println("Player one guessed " + guess1);

            guess2 = p2.number;
            System.out.println("Player two guessed " + guess2);

            guess3 = p3.number;
            System.out.println("Player three guessed " + guess3);

            //判断是否猜中
            if(guess1 == guessNumber){
                p1isRight = true;
            }
            if(guess2 == guessNumber){
                p2isRight = true;
            }
            if(guess3 == guessNumber){
                p3isRight = true;
            }

            if(p1isRight || p2isRight || p3isRight){
                System.out.println("your are winner!");
                System.out.println("Is Player one right?" + p1isRight);
                System.out.println("Is Player two right?" + p2isRight);
                System.out.println("Is Player three right?" + p3isRight);
                System.out.println("Game is over!");
                break;
            }else {
                //都没猜到，要求继续重试
                System.out.println("Please try again.");
            }
        }
    }
}
