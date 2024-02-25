package org.example.Ex1;

import java.util.LinkedList;
import java.util.Queue;

/* Вы работаете на складе, который продает один вид продукции, не имеющий сроков хранения, например кирпич.
У вас всего одни двери на складе, через которые вы загружаете новый товар и отгружаете заказчикам тоже через эту же дверь.
Как бы вы построили рабочий процесс на Вашем складе, какую бы коллекцию использовали для имитации процесса работы?
Напишите программу, которая бы имитировала работу. */
public class Warehouse {
    private Queue<String> queueWarehouse;

    public Warehouse() {
        this.queueWarehouse = new LinkedList<>();
    }

    public void loadsGoodsIntoWarehouse(String supply) {
        queueWarehouse.offer(supply);
        System.out.println("На склад поступил " + supply);
    }

    public void unloadingGoodsFromWarehouse() {
        if (!queueWarehouse.isEmpty()) {
            System.out.println("Со склада отгрузили " + queueWarehouse.poll());
        } else {
            System.out.println("Извините мы уже всё продали!");
        }
    }

    public void warehouseCondition() {
        if (!queueWarehouse.isEmpty()) {
            System.out.println("На складе находится " + queueWarehouse);
        } else {
            System.out.println("Извините склад пустой!");
        }
    }
}