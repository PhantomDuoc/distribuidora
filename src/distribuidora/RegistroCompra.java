/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribuidora;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hugo Cerda Jara
 */
public final class RegistroCompra {

    private List<Bebestible> listaBebestible;

    public RegistroCompra() {
        listaBebestible = new ArrayList<>();
    }

    public boolean agregarBebestible(Bebestible newBebestible) {
        return listaBebestible.add(newBebestible);
    }

    public void listarBebestibles() {
        for (Bebestible tmp : listaBebestible) {
            System.out.println(tmp.toString());
        }
    }

    public void obtenerCategoria() {
        int contVino = 0, contBebida = 0;
        for (Bebestible tmp : listaBebestible) {
            if (tmp instanceof Vino) {
                contVino++;
            }
            if (tmp instanceof Bebida) {
                contBebida++;
            }
        }
        System.out.println("Bebidas >> " + contBebida);
        System.out.println("Vinos >> " + contVino);
    }

    public void obtenerBoleta() {
        int total = 0;
        System.out.println("-----BOLETA-----");
        for (Bebestible tmp : listaBebestible) {
            System.out.println(tmp.getNombre() + " $" + tmp.calcularTotal());
            System.out.println("Precio >> $" + tmp.getPrecio());
            System.out.println("IVA >> $" + tmp.calcularIva());
            System.out.println("Descuento >> $" + tmp.calcularDescuento());
            System.out.println("---------------");
            total += tmp.calcularTotal();
        }
        System.out.println("Total a pagar >> $" + total);
    }

}
