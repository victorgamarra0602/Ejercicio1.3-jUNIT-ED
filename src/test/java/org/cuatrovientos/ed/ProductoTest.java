package org.cuatrovientos.ed;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {

    private Producto producto;

    @BeforeEach
    void setUp() {
        producto = new Producto("pan", 0.50f, 3);
    }

    @Test
    void testNuevo() {
        assertEquals("pan", producto.getNombre());
        assertEquals(0.50f, producto.getPrecio());
        assertEquals(3, producto.getCantidad());
    }

    @Test
    void testPrecioTotal() {
        assertEquals(1.50f, producto.precioTotal(), 0.001f);
    }
}