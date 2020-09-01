package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Menu burgerJoint = new Menu();
        MenuItem burger1 = new MenuItem("Basic Burger",10.99,"regular old burger","main course");
        MenuItem pudding1 = new MenuItem("Pudding",2.99,"regular old pudding","dessert");
        MenuItem friedPickles1 = new MenuItem("Fried Pickles",6.99,"regular old fried pickles","appetizer");
        burgerJoint.addItem(burger1);
        burgerJoint.addItem(pudding1);
        burgerJoint.addItem(friedPickles1);
        //System.out.println(burgerJoint.getCurrentDate());

        for (int i = 0; i < burgerJoint.getMenu().size(); i++) {
            System.out.println(burgerJoint.getMenu().get(i).getName());
            System.out.println(burgerJoint.getMenu().get(i).getDescription());
            System.out.println(burgerJoint.getMenu().get(i).getPrice());
            System.out.println(burgerJoint.getMenu().get(i).getCategory());
            //System.out.println(burgerJoint.getMenu().get(i).getNewItem());
            if (burgerJoint.getMenu().get(i).getNewItem()) {
                System.out.println("NEW ITEM");
            }
        }

        burgerJoint.removeItem(burger1);
        //burgerJoint.getMenu();

        for (int i = 0; i < burgerJoint.getMenu().size(); i++) {
            System.out.println(burgerJoint.getMenu().get(i).getName());
            System.out.println(burgerJoint.getMenu().get(i).getDescription());
            System.out.println(burgerJoint.getMenu().get(i).getPrice());
            System.out.println(burgerJoint.getMenu().get(i).getCategory());
            //System.out.println(burgerJoint.getMenu().get(i).getNewItem());
            if (burgerJoint.getMenu().get(i).getNewItem()) {
                System.out.println("NEW ITEM");
            }
        }

    }
}
