package edu.eci.cvds.Monitoreo;

public class LogAgent implements InventoryObserver {
    @Override
    public void update(String name, int stock) {
        System.out.println("Producto: " + name + " -> " + stock + " unidades disponibles");
    }

}
