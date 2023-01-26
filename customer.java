package com.hspedu.encap.aides;
import java.util.Scanner;
public class customer extends Room implements customer1{

    Scanner scanner = new Scanner(System.in);
    private Double balance ;//余额

    public customer(String type, int number, Double price, Double balance) {
        super(type, number, price);
        this.balance = balance;
    }
    public  int count = 0;

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void view(){//获取房间类型及其数量
        System.out.println("已为您获取房间类型");
        super.view();
    }
    public  void operate() {//开房操作
        view();
        System.out.println("请选择想要开的房间类型：");
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("请输入入住天数：");
                int x = scanner.nextInt();
                if(getBalance() - x * getPrice() < 0){
                    System.out.println("余额不足请先充值");
                    break;
                }
                setBalance(getBalance() - x * getPrice());//扣除余额
                System.out.println("欢迎入住标准单人间，这" + x + "天里祝您在本店里愉快开心");
                count ++;
                break;
            case 2:
                System.out.println("请输入入住天数：");
                int y = scanner.nextInt();
                if(getBalance() - y * getPrice() < 0){
                    System.out.println("余额不足请先充值");
                    break;
                }
                System.out.println("欢迎入住标准双人间，这" + y + "天里祝您在本店里愉快开心");
                count ++;
                break;
            case 3:
                System.out.println("请输入入住天数：");
                int z = scanner.nextInt();
                if(getBalance() - z * getPrice() < 0){
                    System.out.println("余额不足请先充值");
                    break;
                }
                System.out.println("欢迎入住豪华套装间，这" + z + "天里祝您在本店里愉快开心");
                count ++;
                break;
        }
    }
    public  void Check() {
        if(count <= 0){
            System.out.println("退房失败，请先开房");
        }else{
        System.out.println("退房成功，欢迎下次光临");
        count --;
        }
    }

    public  void recharge(){//充值
        System.out.println("您当前余额为" + getBalance() +"\n请输入充值金额：");
        setBalance(getBalance() + scanner.nextDouble());
        System.out.println("充值成功，您现在余额为：" + getBalance());
    }
    public void customerView() {
        boolean top = true;
        System.out.println("欢迎光临本店，请问有什么帮到您的捏：");
        do {
            System.out.println("\t\t\t1.查看空闲房间");
            System.out.println("\t\t\t2.开房");
            System.out.println("\t\t\t3.退房");
            System.out.println("\t\t\t4.查看我的房卡");
            System.out.println("\t\t\t5.充值");
            System.out.println("\t\t\t6.退出");
            System.out.println("请输入1-6选择：");
            switch (scanner.nextInt()){
                case 1 :
                    view();
                    break;
                case 2 :
                    operate();
                    break;
                case 3 :
                    Check();
                    break;
                case 4 :
                    customer customer = new customer("标准单人间", 3, 100.0, 200.0);
                    System.out.println("目前房卡账户余额为" + customer.getBalance());
                    if(count >0){
                        System.out.println("您已在本店开房" + count + "间");
                    }else{
                        System.out.println("您未在本店开房");
                    }
                    break;
                case 5 :
                    recharge();
                    break;
                case 6:
                    top = false;
            }
            System.out.println("1.返回菜单\t2.退出");
            if(scanner.nextInt() == 2){
                top = false;
            }
        }while(top);
    }
}
