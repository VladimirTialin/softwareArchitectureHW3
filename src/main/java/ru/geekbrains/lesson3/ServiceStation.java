package ru.geekbrains.lesson3;

public class ServiceStation implements Refueling, Wiping{
    private boolean extraService=false;
    CarWash carWash= new CarWash();

    /**Услуга - помыть автомобить
     *
     * @param type тип мойки автомобиля:
     *            1 - ручная мойка;
     *            2 - бесконтактная мойка
     */

    public void serviceCarWash(TypeWash type, Car car){
        temperature();
        System.out.print(car);
        carWash.washing(type);
    }
    private void temperature(){
        // устанавливаем температуру окружающей среды. Можно получать температуру с датчиков
        carWash.setTemperature(-10);
    }
    @Override
    public void fuel(FuelType fuelType1) {
        FuelType fuelType = FuelType.Diesel;
        if(fuelType1.equals(fuelType))
            System.out.println("Заправляем автомобиль дизельным топливом");
        else System.out.println("Заправляем автомобиль безнином");
    }

    public boolean setExtraService(boolean set){
      if(set)
          return extraService=true;
      else return extraService;
    }

    public void pumpTire(){
        if(extraService)
            System.out.println("Накачать колесо");
    }

    @Override
    public void wipMirrors() {
        if(extraService)
            System.out.println("Протерли зеркала");
    }

    @Override
    public void wipWindshield() {
        if(extraService)
            System.out.println("Протерли зеркала");
    }

    @Override
    public void wipHeadlights() {
        if(extraService)
            System.out.println("Протерли фары");
    }

    @Override
    public void wipGlass() {
        System.out.println("Протерли стекла");
    }

    @Override
    public void wipCarBody() {

    }
}
