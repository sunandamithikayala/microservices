package com.i;


public class Car {
    private String licensePlate;
    private int hoursParked;

    public Car(String licensePlate, int hoursParked) {
        this.licensePlate = licensePlate;
        this.hoursParked = hoursParked;
    }

    public int getHoursParked() {
        return hoursParked;
    }

    // ✅ Getter method for licensePlate (fixes the unused variable issue)
    public String getLicensePlate() {
        return licensePlate;
    }
}

