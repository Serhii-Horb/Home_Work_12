package org.example.Ex2;

public class SimpleWarehouseWithTwoDoors {
    public static void main(String[] args) {
        WarehouseWithTwoDoors warehouse = new WarehouseWithTwoDoors();
        warehouse.loadsGoodsIntoWarehouse("Кирпич");

        warehouse.unloadingGoodsFromWarehouse();
        warehouse.unloadingGoodsFromWarehouse();

        warehouse.warehouseCondition();
    }
}
