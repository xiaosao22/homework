package com.hspedu.encap.aides;

import java.lang.reflect.Type;

public class Room {
    private String type;//（房间类型）
    private int number;//（房间数）
    private Double Price;//单晚价格

    public Room(String type, int number, Double price) {
        this.type = type;
        this.number = number;
        Price = price;
    }

    public Room(String 单人间, int number, String 未入住, double price) {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public static Room[] rooms =  {new Room("标准单人间", 6 , 100.0),
                new Room("标准双人间", 6 , 150.0),
                 new Room("豪华套装间", 6 , 200.0),};
    public void view(){//获取房间类型及其数量
        for (int i = 0; i < 3; i++) {
            System.out.println(rooms[i]);
        }
    }


    @Override
    public String toString() {
        return
                "房间类型：" + type + "\t" +
                "剩余数量：  " + number + "\t" +
                "单晚价格：" + Price;
    }
}
