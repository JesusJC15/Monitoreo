package edu.eci.cvds.Monitoreo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MonitoringTest {

    private Monitoring monitoring;

    @BeforeEach
    void setUp() {
        monitoring = new Monitoring();
    }

    @Test
    void shouldCreateProduct() {
        Product product = new Product("Nintendo Switch", 1000, 8, "Videojuegos");
        assertEquals("Nintendo Switch", product.getName());
        assertEquals(1000, product.getPrice());
        assertEquals(8, product.getStock());
        assertEquals("Videojuegos", product.getCategory());
    }

    @Test
    void shouldCreateProductNoArgs() {
        Product product = new Product();
        product.setName("Xbox series x");
        product.setPrice(3000);
        product.setStock(10);
        product.setCategory("Videojuegos");
        assertEquals("Xbox series x", product.getName());
        assertEquals(3000, product.getPrice());
        assertEquals(10, product.getStock());
        assertEquals("Videojuegos", product.getCategory());
    }

    @Test
    void shouldUpdateProduct() {
        Product product = new Product();
        product.setName("Xbox series x");
        product.setPrice(3000);
        product.setStock(10);
        product.setCategory("Videojuegos");
        product.setName("Xbox series s");
        product.setPrice(2000);
        product.setStock(5);
        product.setCategory("Videojuegos");
        assertEquals("Xbox series s", product.getName());
        assertEquals(2000, product.getPrice());
        assertEquals(5, product.getStock());
        assertEquals("Videojuegos", product.getCategory());
    }

    @Test
    void shouldUpdateAProduct(){
        Product product = new Product("Nintendo Switch", 1000, 8, "Videojuegos");
        assertEquals("Nintendo Switch", product.getName());
        monitoring.addProduct(product);
        product.updateProduct("Nintendo Switch 2", 1000, 8, "Videojuegos");
        monitoring.updateProduct(product);
        assertEquals("Nintendo Switch 2", product.getName());
    }

    @Test
    void shouldInformLogAgent() {
        Product product = new Product("PS5", 3000, 10, "Videojuegos");
        monitoring.addProduct(product);
        assertEquals(10, product.getStock());
    }

    @Test
    void shouldInformWarningAgent() {
        Product product = new Product("Steam Deck", 3000, 5, "Videojuegos");
        monitoring.addProduct(product);
        assertEquals(5, product.getStock());
        monitoring.removeProduct(product);
        assertEquals(4, product.getStock());
    }

    @Test
    void shouldRemoveProductOnlyOne() {
        Product product = new Product("PS5", 3000, 1, "Videojuegos");
        monitoring.addProduct(product);
        assertEquals(1, product.getStock());
        monitoring.removeProduct(product);
        assertEquals(0, product.getStock());
    }

}