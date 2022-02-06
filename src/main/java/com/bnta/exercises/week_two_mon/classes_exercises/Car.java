package com.bnta.exercises.week_two_mon.classes_exercises;
import java.util.Objects;

public class Car {
    //1. assigning attributes of the car
        private String manufacturer;
        private double price;
        private EngineType engineType;

    /* assigning a default constructor.
    this step is usually unnecessary as it is already assigned by default, without being written*/
    public Car(){}
    public Car (String manufacturer,
                double price,
                EngineType engineType) {
            this.manufacturer = manufacturer;
            this.price = price;
            this.engineType = engineType;
    }

    // invoking the setter and getter methods for each attribute
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' + ", price = " + price
                + ", engineType=" + engineType + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && Objects.equals(manufacturer, car.manufacturer) && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, price, engineType);
    }
}

