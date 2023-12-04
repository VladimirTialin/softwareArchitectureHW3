package ru.geekbrains.lesson3;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

public class Program {


    public static void main(String[] args) {
//        SportCar sportCar = SportCar.create("A", "B", Color.BLACK,3,CarType.Sport);
//        RefuelingStation refuelingStation = new RefuelingStation();
//        sportCar.setRefuelingStation(refuelingStation);
//        sportCar.fuel();

        //Создаем автомобили

        String[] make= {"Lada","Nissan","Opel","Mazda","Alfa Romeo","BMW"};
        String[] model= {"Vesta","Tiida","Astra","6","7","X6"};
        Color[] color={Color.BLACK,Color.red,Color.white,Color.pink,Color.cyan,Color.GREEN};
        Collection<MotorCar> carCollection=new ArrayList<>();

        for (int i = 0; i < make.length; i++) {
            RandomEnumGenerator rnd = new RandomEnumGenerator(CarType.class);
            CarType type = (CarType) rnd.randomEnum();
            carCollection.add(new MotorCar(make[i],model[i], color[i],type));
        }
        ServiceStation serviceStation= new ServiceStation();
        int count=0;
        for (MotorCar car:carCollection) {

            RandomEnumGenerator rnd = new RandomEnumGenerator(FuelType.class);
            FuelType type = (FuelType) rnd.randomEnum();
            RandomEnumGenerator rndWash = new RandomEnumGenerator(TypeWash.class);
            TypeWash tWath = (TypeWash) rndWash.randomEnum();
            System.out.print(++count+": "+car);
            serviceStation.fuel(type);
            serviceStation.setExtraService(true);
            serviceStation.serviceCarWash(tWath,car);

        }

    }


    public static double calculateMaintenance(Car car){
        if (car.getWheelsCount() == 6){
            return 1500 * 6;
        }
        else {
            return 1000 * 4;
        }
    }

}
