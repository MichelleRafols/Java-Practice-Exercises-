package com.bnta.exercises.week_two_mon.classes_exercises;


/* what does the question 6 & 7 require?
1. create properties of the dealership: (apply business logic)
    - what car is there?
    - what is the capacity?
    - how many cars will be added to the dealership?
      there are currently no cars
2. we need a counter to keep track of how many cars we find
3. we need to be able to add cars to an empty space
4. be able to find a car by their manufacturer. so first, we must check
if there is a car in a slot. if there is, then the car's manufacturer must match the one we want
 */
public class Dealership {
    // assigning the properties of the dealership
    private String carName;
    private int maxCars;
    private Car[] cars;

    //invoking the attributes of the dealership
    public Dealership(String carName, int maxCars) {
        this.carName = carName;
        this.maxCars = maxCars;
        this.cars = new Car[maxCars]; //i don't understand this line

    }


}