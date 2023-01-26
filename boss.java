package com.hspedu.encap.aides;
import java.util.Scanner;
public class boss extends Room implements boss1{

    Scanner scanner = new Scanner(System.in);

    public boss(String type, int number, Double price) {

        super(type, number, price);
    }

    public  void build(){//新建
        System.out.println("选择新建类型：");
        System.out.println("1.标准单人间 2.标准双人间 3.豪华套装间");
        switch (scanner.nextInt()){
            case 1:
                rooms[0].setNumber(rooms[0].getNumber()+1);
                System.out.println("已新建一个标准单人间");
                break;
            case 2:
                rooms[1].setNumber(rooms[1].getNumber()+1);
                System.out.println("已新建一个标准双人间");
                break;
            case 3:
                rooms[2].setNumber(rooms[2].getNumber()+1);
                System.out.println("已新建一个豪华套装间");
                break;
            default:
                System.out.println("输入错误，请输入1~3：");
        }
        //</editor-fold>
        System.out.println("新建后的房间信息如下");
        view();
    }
    public  void dismantle(){//拆除
        System.out.println("选择拆除类型：");
        System.out.println("1.标准单人间 2.标准双人间 3.豪华套装间");
        switch (scanner.nextInt()){
            case 1:
                rooms[0].setNumber(rooms[0].getNumber()-1);
                System.out.println("已拆除一个标准单人间");
                break;
            case 2:
                rooms[1].setNumber(rooms[1].getNumber()-1);
                System.out.println("已拆除一个标准双人间");
                break;
            case 3:
                rooms[2].setNumber(rooms[2].getNumber()-1);
                System.out.println("已拆除一个豪华套装间");
                break;
        }
        System.out.println("现如今的房间信息如下：");
        view();
    }//拆除房间
    public  void fitment(){//装修
        System.out.println("请选择需要装修的房间类型（将标准间装修成套装间）");
        System.out.println("1.标准单人间 2.标准双人间 ");
        switch (scanner.nextInt()){
            case 1:
                System.out.println("已将其装修成豪华套装间");
                rooms[0].setNumber(rooms[0].getNumber()-1);
                rooms[2].setNumber(rooms[2].getNumber()+1);
                break;
            case 2:
                System.out.println("已将其装修成豪华套装间");
                rooms[1].setNumber(rooms[1].getNumber()-1);
                rooms[2].setNumber(rooms[2].getNumber()+1);
                break;

        }
        System.out.println("装修后的房间信息如下");
        view();

    }
    public void revise(){//修改数量
        System.out.println("请选择要修改数量的类型：");
        System.out.println("1.标准单人间 2.标准双人间 3.豪华套装间");
        switch (scanner.nextInt()){
            case 1:
                System.out.println("现在标准单人间数量为：" + rooms[0].getNumber() +"\n请输入修改后的数量：");
                try {
                    rooms[0].setNumber(scanner.nextInt());
                } catch (Exception e) {
                    System.out.println("单人间修改数输入有误");
                }
                System.out.println("修改成功，现在房间信息如下");
                break;
            case 2:
                System.out.println("现在标准双人间数量为：" + rooms[1].getNumber() +"\n请输入修改后的数量：");
                try {
                    rooms[1].setNumber(scanner.nextInt());
                } catch (Exception e) {
                    System.out.println("双人间修改数输入有误");
                }
                break;
            case 3:
                System.out.println("现在标准豪华套装间数量为：" + rooms[2].getNumber() +"\n请输入修改后的数量：");
                try {
                    rooms[2].setNumber(scanner.nextInt());
                } catch (Exception e) {
                    System.out.println("豪华间修改数输入有误");
                }
                break;
        }
        System.out.println("修改后的房间信息如下");
        view();

    }
    private boolean loop = true;
    public void bossview(){//老板端界面
        System.out.println("欢迎老板，请问有什么帮到您的捏：");
        do {
            System.out.println("\t\t\t1.建造房间");
            System.out.println("\t\t\t2.拆除房间");
            System.out.println("\t\t\t3.装修房间");
            System.out.println("\t\t\t4.设置房间数");
            System.out.println("\t\t\t5.退出");
            System.out.println("请输入数字1-5");
            int num =5;
            try {
                num = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("数字输入有误");
            }
            switch (num) {
                case 1:
                    build();
                    break;
                case 2:
                    dismantle();
                    break;
                case 3:
                    fitment();
                    break;
                case 4:
                    revise();
                    break;
                case 5:
                    loop = false;

            }
            System.out.println("1.返回菜单\t2.退出");
            if(scanner.nextInt() == 2){
                loop = false;
            }
        }while (loop);
    }

}
