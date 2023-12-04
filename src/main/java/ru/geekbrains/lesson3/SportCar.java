package ru.geekbrains.lesson3;

import java.awt.*;

public class SportCar extends Car {


    public SportCar(String make, String model, Color color, CarType carType) {
        super(make, model, color, carType);
    }

    public static SportCar create(String make, String model, Color color,CarType carType){
        if (carType.equals(CarType.Sport)) return create(make, model, color, carType);
        return create(make, model, color, CarType.Sport);
    }

    public static SportCar create(String make, String model, Color color, int wheelsCount,CarType carType){
        if (wheelsCount < 3 || wheelsCount > 10){
            throw new RuntimeException("Недопустимое кол-во колес.");
        }
        return new SportCar(make, model, color,CarType.Sport);
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
