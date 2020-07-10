package com.exercise.yu;

/**测试类
 */
public class BankDemo {

    public static void main(String[] args){
        //实例化 CheckingAccount 类，并初始化余额 为 101
        CheckingAccount checkingAccount = new CheckingAccount(101.00,"6217000000000000000");
        System.out.println("先存500块。。。");
        checkingAccount.deposit(500);
        System.out.println("记录一次余额为："+ checkingAccount.getBalance());
        try{
            System.out.println("先取出100块。。。");
            checkingAccount.withdraw(100.00);
            System.out.println("记录二次余额为："+ checkingAccount.getBalance());
            System.out.println("再取出600块。。。。");
            checkingAccount.withdraw(600.00);
            System.out.println("记录三次余额为："+ checkingAccount.getBalance());
        }catch(MyException e){
            System.out.println("对不起，您的余额不足了！"+ e.getAmount());
            e.printStackTrace();  //堆栈跟踪日志信息（不建议使用该方法，占内存会导致锁死）
        }
    }
}
