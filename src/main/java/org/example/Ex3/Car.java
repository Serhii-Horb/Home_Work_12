package org.example.Ex3;

public class Car implements Comparable<Car>{
    private String type;
    private Priority priority;

    public Car(String type, Priority priority) {
        this.type = type;
        this.priority = priority;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Car {" +
                "type = '" + type + '\'' +
                ", priority = " + priority +
                '}';
    }

    @Override
    public int compareTo(Car car) {
        return Integer.compare(car.getPriority().getIndexPriority(), this.getPriority().getIndexPriority());
    }
}
