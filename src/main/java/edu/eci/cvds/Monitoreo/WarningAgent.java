package edu.eci.cvds.Monitoreo;

public class WarningAgent implements InventoryObserver {
    @Override
    public void update(String name, int stock) {
        if (stock < 5 && stock > 0) {
            System.out.println("ALERTA!!! El stock del Producto: " + name + " es muy bajo, solo quedan " + stock + " unidades ");
        }
    }

}
