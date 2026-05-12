package org.cuatrovientos.ed;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FacturaTest {

    private Factura factura;

    @BeforeEach
    void setUp() {
        factura = new Factura();
        factura.meterProducto(new Producto("pan",   0.50f, 2)); // 1.00
        factura.meterProducto(new Producto("leche", 1.20f, 3)); // 3.60
        factura.meterProducto(new Producto("huevos",2.00f, 1)); // 2.00
    }

    @Test
    void testTotalFactura() {
        assertEquals(6.60f, factura.totalFactura(), 0.001f);
    }

    @Test
    void testAplicarIva() {
        // 6.60 + 21% IVA = 6.60 * 1.21 = 7.986
        assertEquals(7.986f, factura.aplicarIva(21), 0.001f);
    }
}