package com.sparta.week01.model;

public class Bus extends Vehicle{
    private int currentPassenger;
    private String state;
    private int fare;
    private int busNumber;
    private int busMaximumPassenger;
    private int busFuel_volume;
    private int speed;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
        this.start();

        this.currentPassenger = 0;
        this.state = "운행중";
        this.fare = 1000;
        super.setMaximumPassenger(30);
        busMaximumPassenger = super.getMaximumPassenger();
        this.busFuel_volume = super.getFuel_volume();
        this.speed = super.getSpeed();
    }

    public void start() {
        System.out.println(busNumber + "버스 운행 시작합니다");
    }

    public void number_comparison(){
        System.out.println("차량번호는 : " + busNumber);
    }

    public void passengerBoarding(int passanger){
        currentPassenger += passanger;

        if (currentPassenger <= 30 && state=="운행중"){
            busMaximumPassenger -= passanger;
            fare = fare * passanger;
            System.out.println("탑승 승객수 : " + currentPassenger);
            System.out.println("잔여 승객 수 : " + busMaximumPassenger);
            System.out.println("요금 확인 : " + fare);
        }else {
            currentPassenger = 0;
            System.out.println("최대 승객 수 초과");
        }
    }

    public void oiling(int oil){
        if (oil >= 0){
            busFuel_volume += oil;
            state="차고지행";
            System.out.println("상태 : " + state);
            System.out.println("주유량 : " + busFuel_volume);
        }else {
            busFuel_volume += oil;
            System.out.println("주유량 : " + busFuel_volume);
        }
        if (busFuel_volume < 10){
            state = "차고지행";
            System.out.println("상태 : " + state);
            System.out.println("주유가 필요합니다");
        }else {
            state = "운행중";
        }
    }

    public void speedChange(int ChangeSpeed){
        speed += ChangeSpeed;
    }



}
