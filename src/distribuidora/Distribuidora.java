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
public class Distribuidora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creacion de los 2 productos solicitados
        Vino v1 = new Vino(13, "Merlot", 10001, "Gran Tarapaca", "Gran Tarapaca", 750, 3500);
        Bebida b1 = new Bebida("SI", "NO", 20001, "Ginger Ale", "Canada Dry", 1.5, 1000);
        //creacion lista contenedora de los productos
        RegistroCompra rc = new RegistroCompra();
        //agregar productos a la lista
        rc.agregarBebestible(v1);
        rc.agregarBebestible(b1);
        //mostrar los productos que estan dentro de la lista
        rc.listarBebestibles();
        //mostrar los descuentos que obtienen los productos segun su categoria
        v1.mostrarDescuento();
        b1.mostrarDescuento();
        //mostrar la cantidad de objetos segun categoria
        rc.obtenerCategoria();
        //mostrar el total de los productos en la lista de compra
        rc.obtenerBoleta();
        System.out.println("test");
    }

}
