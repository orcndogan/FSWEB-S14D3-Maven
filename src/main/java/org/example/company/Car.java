package org.example.company;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Car{" +
                "cylinders=" + cylinders +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object car) {
        if(car instanceof Car) {
            return this.cylinders == ((Car)car).cylinders && this.name.equals(((Car)car).name);
        } else {
            return false;
        }
    }
    public String startEngine() {
        System.out.println(getClass().getSimpleName());
        return "the car's engine is starting";
    }
    public String accelerate() {
        System.out.println(getClass().getSimpleName());
        return "the car is accelerating";
    }
    public String brake() {
        System.out.println(getClass().getSimpleName());
        return "the car is braking";
    }

}
