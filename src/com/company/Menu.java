package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Menu {
    private ArrayList<MenuItem> menuList;
    private String lastUpdate;

    public Menu () {
        this.menuList = new ArrayList<>(); //empty array list
        this.lastUpdate = getCurrentDate();
    }

    public ArrayList<MenuItem> getMenu() { return this.menuList; }
    public String getLastUpdate() { return this.lastUpdate; }

    public void addItem(MenuItem item) {
        this.menuList.add(item);
        this.lastUpdate = getCurrentDate(); //update most recent date
    }

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
