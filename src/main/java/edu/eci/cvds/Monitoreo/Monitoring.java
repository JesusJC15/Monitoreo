package edu.eci.cvds.Monitoreo;

public class Monitoring {

    public Inventory inventory;

    public Monitoring(){
        inventory = new Inventory();
    }

    public void addProduct(Product product){
        inventory.addProducts(product);
        inventory.notifyObservers(product.getName(), product.getStock());
    }

    public void updateProduct(Product product){
        inventory.updateProducts(product);
        inventory.notifyObservers(product.getName(), product.getStock());
    }

    public void removeProduct(Product product){
        inventory.removeProducts(product);
        inventory.notifyObservers(product.getName(), product.getStock());
    }
}
