package ru.geekbrains.lesson3;

import java.awt.*;

public class MotorCar extends Car {
    public MotorCar(String make, String model, Color color, CarType carType) {
        super(make, model, color, carType);
    }
    public static MotorCar create(String make, String model, Color color, CarType carType){
       return create(make, model, color, carType);
    }

    public static MotorCar create(String make, String model, Color color, int wheelsCount, CarType carType){
        if (wheelsCount!=4){
            throw new RuntimeException("Недопустимое кол-во колес.");
        }
        return new MotorCar(make, model, color,carType);

    }
    @Override
    public void movement() {

    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadlights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }
}
