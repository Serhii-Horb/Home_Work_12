package org.example.Ex2;

import java.util.ArrayDeque;
import java.util.Deque;

/* Тот же склад, что и в случае п.1, но у Вас есть две двери - одна в начале склада, вторая в конце. */
public class WarehouseWithTwoDoors {
    private Deque<String> queueWarehouse;

    public WarehouseWithTwoDoors() {
        this.queueWarehouse = new ArrayDeque<>();
    }

    public void loadsGoodsIntoWarehouse(String supply) {
        queueWarehouse.offerFirst(supply);
        System.out.println("На склад поступил " + supply);
    }

    public void unloadingGoodsFromWarehouse() {
        if (!queueWarehouse.isEmpty()) {
            System.out.println("Со склада отгрузили " + queueWarehouse.pollLast());
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
