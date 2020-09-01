package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Menu {
    private ArrayList<MenuItem> menuList;
    private String lastUpdate;
    private Date lastUpdate2;

    public Menu () {
        this.menuList = new ArrayList<>(); //empty array list
        this.lastUpdate = getCurrentDate();
        this.lastUpdate2 = new Date();
    }

    public ArrayList<MenuItem> getMenu() { return this.menuList; }
    public String getLastUpdate() { return this.lastUpdate; }

    public void addItem(MenuItem item) {
        menuList.add(item);
        lastUpdate = getCurrentDate(); //update most recent date
        lastUpdate2 = new Date();
    }

    public void removeItem(MenuItem item) {
        menuList.remove(item);
        lastUpdate = getCurrentDate(); //update most recent date
        lastUpdate2 = new Date();
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuList=" + menuList +
                ", lastUpdate='" + lastUpdate + '\'' +
                ", lastUpdate2=" + lastUpdate2 +
                '}';
    }

//    public void removeItem2(String item) {
//        System.out.println("WORKS");
//        Integer itemIndex;
//
//        for (MenuItem food : this.menuList) {
//            System.out.println("alsoWORKS");
//            System.out.println(food.getName());
//            if (food.getName().contains(item)) {
//                itemIndex = this.menuList.indexOf(food);
//                System.out.println(itemIndex);
//                System.out.println(this.getMenu().get(itemIndex));
//                System.out.println("FOUNDIT");
//                menuList.remove(itemIndex);
//            }
//        }
////        if (this.menuList.get)
////        itemIndex = this.menuList.indexOf(item);
////        System.out.println(itemIndex);
////        this.menuList.remove(itemIndex);
////        this.lastUpdate = getCurrentDate(); //update most recent date
//    }

    public static String getCurrentDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }





//    public static void main(String[] args) {
////        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
////        LocalDateTime now = LocalDateTime.now();
////        System.out.println(dtf.format(now));
//
//        System.out.println(getCurrentDate());
//    }

}
