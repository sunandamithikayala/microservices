package com.i;
//FeeParking
public class ParkingLot implements FeeParking {
    private int capacity;
    private int occupiedSpots;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.occupiedSpots = 0;
    }

    public void parkCar() {
        if (occupiedSpots < capacity) {
            occupiedSpots++;
            System.out.println("Car parked. Spots left: " + (capacity - occupiedSpots));
        } else {
            System.out.println("Parking lot is full.");
        }
    }

    public void unparkCar() {
        if (occupiedSpots > 0) {
            occupiedSpots--;
            System.out.println("Car removed. Spots left: " + (capacity - occupiedSpots));
        } else {
            System.out.println("Parking lot is empty.");
        }
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public double calculateFee(Car car) {
        return car.getHoursParked() * 5.0; // Assume $5 per hour
    }

    @Override
    public void doPayment(Car car) throws Exception {
        double fee = calculateFee(car);
        System.out.println("Processing payment of $" + fee);
    }
}
