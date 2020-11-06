/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribuidora;

/**
 *
 * @author Hugo Cerda Jara
 */
public interface Caja {

    double IVA = 0.19;
    double DESCUENTO_BEBIDA = 0.1;
    double DESCUENTO_VINO = 0.15;

    int calcularIva();

    /*public abstract*/int calcularDescuento();

    /*public abstract*/int calcularTotal();

    /*public abstract*/void mostrarDescuento();

}
