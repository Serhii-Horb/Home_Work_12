package org.example.Ex3;public class SimpleGasStation {    public static void main(String[] args) {        GasStation gasStation = new GasStation();        gasStation.addsCarToTheQueue(new Car("Обычная машина", Priority.NORMAL));        gasStation.addsCarToTheQueue(new Car("Общественные автобусы", Priority.MEDIUM));        gasStation.addsCarToTheQueue(new Car("Обычная машина", Priority.NORMAL));        gasStation.addsCarToTheQueue(new Car("Скорая помощь", Priority.HIGH));        gasStation.addsCarToTheQueue(new Car("Технологический транспорт", Priority.HIGHEST));        System.out.println();        gasStation.removeCarToTheQueue();    }}