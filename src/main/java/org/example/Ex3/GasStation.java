package org.example.Ex3;
/* Автозаправка. По умолчанию автомобили заправляются согласно стандартной очереди FIFO. Но автомобили скорой помощи
всегда заправляются вне очереди.
В час пик, общественные автобусы получают максимальный приоритет по заправке, но скорая помощь все равно более приоритетна.
Во время стихийных бедствий (снегопад, наводнение) технологический транспорт городских служб заправляется вне очереди.
Какую бы коллекцию Вы использовали для реализации данного алгоритма?
Напишите программу, которая бы имитировала работу. */

import java.util.Comparator;
import java.util.PriorityQueue;

public class GasStation {
    private PriorityQueue<Car> priorityQueue;

    public GasStation() {
        priorityQueue = new PriorityQueue<>();
    }

    public void addsCarToTheQueue(Car car) {
        priorityQueue.offer(car);
        System.out.println(car.getType() + " стоит в очереди на заправку");
    }

    public void removeCarToTheQueue() {
        while (!priorityQueue.isEmpty()) {
            Car car = priorityQueue.poll();
            System.out.println(car.getType() + " заправилась и уехала");
        }
    }

    @Override
    public String toString() {
        return "GasStation{" +
                "priorityQueue=" + priorityQueue +
                '}';
    }

    public PriorityQueue<Car> getPriorityQueue() {
        return priorityQueue;
    }
}
