/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea6_ed;

/**
 *
 * @author Alejandro
 */
public class Facturacion {
    private static final int UNIDADES_PARA_DESCUENTO = 5;
    private static final int MINIMO_PRODUCTOS_DESCUENTO = 3;
    private static final double DESCUENTO_BASICO = 0.95;
    private static final double DESCUENTO_PREMIUN = 0.8;

    public void aplicarDescuento(double precioProducto, int numProductos) {
        double total;
        if (numProductos > MINIMO_PRODUCTOS_DESCUENTO) {
            precioProducto -= UNIDADES_PARA_DESCUENTO;
        }
        if (numProductos != 0) {
            total = precioProducto * DESCUENTO_PREMIUN;
            mostrarTotal(total);
        } else {
            total = precioProducto * DESCUENTO_BASICO;
            mostrarTotal(total);
        }

    }

    private void mostrarTotal(double total) {
        System.out.println("El total a pagar es:" + total);
        System.out.println("Enviado");
    }
}
