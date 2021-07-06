package com.company;


import com.sun.source.doctree.SystemPropertyTree;

abstract class Hotel{
    abstract void serveFood();
    abstract void foodMenu();
    void HotelRating(){
        System.out.println("5 Stars hotel.");
    }
}
class HotelKitchen extends Hotel{
    void serveFood(){
        System.out.println("Food served...");
    }
    void foodMenu(){
        System.out.println("Here is your MENU.");
    }
}
public class Main {

    public static void main(String[] args) {
     HotelKitchen customer = new HotelKitchen();
     customer.HotelRating();
     customer.foodMenu();
     customer.serveFood();
    }
}
