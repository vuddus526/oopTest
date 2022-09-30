package com.sparta.week01.model;

public class Main {
    public static void main(String[] args) {
        // 버스 출력문
        Bus bus1 = new Bus(1000);
        Bus bus2 = new Bus(2000);

        bus1.number_comparison();
        bus2.number_comparison();
        System.out.println("------------------------------------------------");
        bus1.passengerBoarding(2);
        System.out.println("------------------------------------------------");
        bus1.oiling(-50);
        System.out.println("------------------------------------------------");
        bus1.oiling(10);
        bus1.passengerBoarding(45);
        System.out.println("------------------------------------------------");
        bus1.passengerBoarding(5);
        System.out.println("------------------------------------------------");
        bus1.oiling(-55);
        System.out.println("------------------------------------------------");
        //택시 출력문
        Taxi taxi1 = new Taxi(1000);
        Taxi taxi2 = new Taxi(2000);
        taxi1.start();
        taxi2.start();
        taxi1.passengerBoarding(2,"서울역",2);
        System.out.println("------------------------------------------------");
        taxi1.oiling(-80);
        System.out.println("------------------------------------------------");
        taxi1.passengerBoarding(5, "서울역", 2);
        System.out.println("------------------------------------------------");
        taxi1.passengerBoarding(3, "구로디지털단지역", 12);
        System.out.println("------------------------------------------------");
        taxi1.oiling(-20);
    }
}
