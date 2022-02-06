package com.bnta.exercises.week_two_mon.classes_exercises;

public class Main {

    public static void main(String[] args) {
        //4. (optional) setting a constructor for the object 'car'
       /* Car lamborghini = new Car("Lamborghini",
                200_000.00,
                EngineType.PETROL);*/


        //1. creating objects for 'car'
        Car lamborghini = new Car("lamborghini",
                200_000.00,
                EngineType.PETROL);
        Car corvette = new Car();
        Car tesla = new Car();

        Car[] cars = {lamborghini, corvette, tesla};


        //3. assigning values to the attributes of the car using the set method
        tesla.setEngineType(EngineType.ELECTRIC);
        tesla.setPrice(80_000.00);
        tesla.setManufacturer("Tesla");

        corvette.setEngineType(EngineType.PETROL);
        corvette.setPrice(100_000.00);
        corvette.setManufacturer("Corvette");

        lamborghini.setEngineType(EngineType.PETROL);
        lamborghini.setPrice(280_000.00);
        lamborghini.setManufacturer("Lamborghini");

        //2. invoking the behaviors of the car
        System.out.println(lamborghini.getManufacturer());
        System.out.println(lamborghini.getEngineType());
        System.out.println(lamborghini.getPrice());

        System.out.println(corvette.getManufacturer());
        System.out.println(corvette.getEngineType());
        System.out.println(corvette.getPrice());

        System.out.println(tesla.getManufacturer());
        System.out.println(tesla.getEngineType());
        System.out.println(tesla.getPrice());


    }
}
