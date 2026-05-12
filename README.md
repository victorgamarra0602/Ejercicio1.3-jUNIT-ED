# Ejercicio 1.3 - JUnit + UML - Entornos de Desarrollo

## Descripción
Proyecto Maven en Java que implementa un sistema de facturación con dos clases (`Producto` y `Factura`) basado en un diagrama UML, junto con sus clases de test usando JUnit 5.

## Diagrama UML

```
Factura                          Producto
─────────────────────            ─────────────────────────────────
productos: Vector<Producto> 1..n -nombre: String
+meterProducto(p: Producto)      -precio: float
+totalFactura(): float           -cantidad: int
+aplicarIva(iva: float): float   ─────────────────────────────────
                                 +Producto(nombre, precio, cantidad)
                                 +precioTotal(): float
                                 +toString(): String
```

## Estructura del proyecto
```
Ejercicio1-3-jUNIT-ED/
└── src/
    ├── main/java/org/cuatrovientos/ed/
    │   ├── Producto.java
    │   └── Factura.java
    └── test/java/org/cuatrovientos/ed/
        ├── ProductoTest.java
        └── FacturaTest.java
```

## Clases implementadas

### Producto
| Método | Descripción |
|--------|-------------|
| `Producto(nombre, precio, cantidad)` | Constructor |
| `precioTotal()` | Devuelve precio × cantidad |
| `toString()` | Representación en texto del producto |

### Factura
| Método | Descripción |
|--------|-------------|
| `meterProducto(p)` | Añade un producto a la factura |
| `totalFactura()` | Suma el precioTotal de todos los productos |
| `aplicarIva(iva)` | Devuelve el total con el IVA aplicado |

## Tests

### ProductoTest
| Test | Descripción |
|------|-------------|
| `testNuevo` | Comprueba que los atributos se inicializan correctamente |
| `testPrecioTotal` | Comprueba que precio × cantidad es correcto |

### FacturaTest
| Test | Descripción |
|------|-------------|
| `testTotalFactura` | Añade productos y comprueba que el total es correcto |
| `testAplicarIva` | Comprueba el total con IVA al 21% |

Resultado: ✅ 4/4 tests pasados

## Tecnologías
- Java 17
- Maven
- JUnit 5.10.2
- Eclipse IDE
