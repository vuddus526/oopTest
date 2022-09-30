package com.sparta.week01.model;

public class Taxi extends Vehicle{
    private int currentPassenger;//현재승객수
    private String state;//상태
    private int defaultFare;//기본요금
    private int farePerDistance;//거리당 요금
    private int defaultDistance;//기본 거리
    private int taxiNumber;
    private int taxiFuel_volume;
    private int taxiMaximumPassenger;
    private String goal;
    private int goalDistance;
    private int payMoney;
    private int totalPayMoney;
    private int speed;
    public Taxi(int taxiNumber) {
        super();
        super.setMaximumPassenger(4);
        taxiMaximumPassenger = super.getMaximumPassenger();
        this.currentPassenger = 0;
        this.defaultFare = 3000;
        this.farePerDistance = 1000;
        this.defaultDistance = 1;
        taxiFuel_volume = super.getFuel_volume();
        this.state = "일반";
        this.taxiNumber =taxiNumber;
        this.speed = super.getSpeed();
    }

    public void start() {
        if (taxiFuel_volume >= 10){
            System.out.println(taxiNumber + "번 택시 운행 시작!");
            System.out.println("주유량 : " + getFuel_volume());
            System.out.println("상태 : " + state);
        }else {
            state= "운행불가";
            System.out.println("상태 : " + state);
        }

    }

    public void passengerBoarding(int passanger, String goal, int goalDistance){
        currentPassenger += passanger;
        System.out.println("탑승 승객 수 : " + passanger);
        if(passanger > 4 && state=="일반"){
            currentPassenger = 0;
            taxiMaximumPassenger = 4;
            System.out.println("최대 승객 수 초과");
        }else {
            taxiMaximumPassenger -= passanger;
            System.out.println("잔여 승객 수 : " + taxiMaximumPassenger);
            System.out.println("기본 요금 확인 : " + defaultFare);
            System.out.println("목적지 : " + goal);
            System.out.println("목적지까지 거리 : " + goalDistance + "km");

            if (goalDistance < 2) {
                payMoney = defaultFare;
                totalPayMoney += defaultFare;
            }else {
                payMoney = defaultFare + ((goalDistance - 1) * farePerDistance);
                totalPayMoney += defaultFare + ((goalDistance - 1) * farePerDistance);
            }
            System.out.println("지불할 요금 : " + payMoney);
            state = "운행중";
            System.out.println("상태 : " + state);
            state = "일반";
        }
    }

    public void oiling(int oil){
        if (taxiFuel_volume <= 0){
            taxiFuel_volume += oil;
            state = "운행불가";

            System.out.println("주유량 : " + taxiFuel_volume);
            System.out.println("상태 : " + state);
            System.out.println("누적요금 : " + totalPayMoney);
        }else{
            if (oil < 0 ){
                taxiFuel_volume += oil;
                System.out.println("주유량 : " + taxiFuel_volume);
                System.out.println("누적요금 : " + totalPayMoney);
            }
        }
    }

    public void speedChange(int ChangeSpeed){
        speed += ChangeSpeed;
    }
}
