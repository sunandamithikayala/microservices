package com.i;


public interface FeeParking {
    double calculateFee(Car car);
    void doPayment(Car car) throws Exception;
}
