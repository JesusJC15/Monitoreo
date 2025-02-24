package edu.eci.cvds.Monitoreo;

import java.util.HashMap;
import java.util.List;

public class Inventory {

    private HashMap<String, Product> products = new HashMap<>();
    private List<InventoryObserver> observers;
    
    public Inventory(){
        observers = List.of(new LogAgent(), new WarningAgent());
    }

    public void addProducts(Product product){
        products.put(product.getName(), product);
    }

    public void updateProducts(Product product){
        product.updateProduct(product.getName(), product.getPrice(), product.getStock(), product.getCategory());
        products.put(product.getName(), product);
    }

    public void removeProducts(Product product){
        if(product.getStock() == 1){
            products.get(product.getName()).removeStock(product.getStock());
            products.remove(product.getName());
        }else{
            products.get(product.getName()).removeStock(product.getStock());
        }
    }

    public void notifyObservers(String name, int stock) {
        for (InventoryObserver observer : observers) {
            observer.update(name, stock);
        }
    }
}
