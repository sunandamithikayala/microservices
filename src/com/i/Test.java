package com.i;

public class Test {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot(10); // Capacity of 10 cars
        Car car1 = new Car("ABC123", 3); // 3 hours parked

        lot.parkCar();
        lot.unparkCar();

        try {
            lot.doPayment(car1);
        } catch (Exception e) {
            System.out.println("Payment failed: " + e.getMessage());
        }
    }
}

