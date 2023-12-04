package ru.geekbrains.lesson3;

public class CarWash implements Wiping,Wash {

    protected TypeWash typeWash = TypeWash.noncontact;

    private int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void washing(TypeWash type){
        if(typeWash.equals(type)) System.out.println("Бесконтактная мойка");
        else System.out.println("Ручная мойка");
        water();
        foam();
        water();
        if(temperature<0) air();
        wipCarBody();
        wipMirrors();
        wipGlass();
        wipHeadlights();
    }
    @Override
    public void wipMirrors() {
        System.out.println("Протерли зеркала");
    }

    @Override
    public void wipWindshield() {
    }

    @Override
    public void wipHeadlights() {
        System.out.println("Протерли фары");

    }

    @Override
    public void wipGlass() {
        System.out.println("Протерли стекла");
    }

    @Override
    public void wipCarBody() {
        System.out.println("Протерли кузов автомобиль");
    }

    @Override
    public void water() {
        System.out.println("Использовали воду");

    }

    @Override
    public void foam() {
        System.out.println("Использовали пену");
    }

    @Override
    public void air() {
        System.out.println("Использовали воздух");
    }

}
