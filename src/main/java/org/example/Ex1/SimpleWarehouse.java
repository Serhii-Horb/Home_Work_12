package org.example.Ex1;

public class SimpleWarehouse {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        warehouse.loadsGoodsIntoWarehouse("Кирпич");

        warehouse.unloadingGoodsFromWarehouse();
        warehouse.unloadingGoodsFromWarehouse();

        warehouse.warehouseCondition();
    }
}
