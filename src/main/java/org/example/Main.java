package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    static void manufactureCar(String modelName) {
        System.out.println("Производство автомобиля: " + modelName);
    }

    static void sellCar(String modelName, int quantity) {
        System.out.println("Продажа автомобиля: " + modelName + ", количество: " + quantity);
    }

    static void calculateMaintenanceCost(String modelName) {
        System.out.println("Расчет затрат на обслуживание автомобиля: " + modelName);
    }

    void driveCar(String modelName) {
        System.out.println("Поездка на автомобиле: " + modelName);
    }

    void repairCar(String modelName) {
        System.out.println("Ремонт автомобиля: " + modelName);
    }

    void refuelCar(String modelName) {
        System.out.println("Заправка автомобиля: " + modelName);
    }

    static void manufactureCustomCar(String modelName) {
        System.out.println("Производство индивидуального автомобиля: " + modelName);
    }

    static void sellLeaseCar(String modelName, int quantity) {
        System.out.println("Продажа или аренда автомобиля: " + modelName + ", количество: " + quantity);
    }

    public static void main(String[] args) {
        manufactureCar("Toyota Camry");
        sellCar("Toyota Camry", 50);
        calculateMaintenanceCost("Toyota Camry");

        Main main = new Main();
        main.driveCar("Toyota Camry");
        main.repairCar("Toyota Camry");
        main.refuelCar("Toyota Camry");

        manufactureCustomCar("Custom Model");
        sellLeaseCar("Custom Model", 5);
    }
}