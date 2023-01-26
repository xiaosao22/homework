package com.hspedu.encap.aides;
import java.util.Scanner;
public class text {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=========欢迎使用小助手=========");
        System.out.println("请问您的身份：");
        System.out.println("1.老板 \t2.顾客");
        System.out.println("请输入1或2:");
        switch (scanner.nextInt()){
            case 1:
                boss boss1 = new boss("标准单人间", 6, 100.0);
                boss1.bossview();
                break;
            case 2:
                customer customer1 = new customer("标准单人间", 6, 100.0,200.0);
                customer1.customerView();
                break;
        }
    }
}
