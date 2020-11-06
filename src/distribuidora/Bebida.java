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
public class Bebida extends Bebestible {

    private String gasificada;//SI = si tiene gas, NO = no tiene gas
    private String light;//SI = es light, NO = no es light

    public Bebida() {
    }

    public Bebida(String gasificada, String light, int codigo, String nombre, String marca, double volumen, int precio) {
        super(codigo, nombre, marca, volumen, precio);
        this.gasificada = gasificada;
        this.light = light;
    }

    public String getGasificada() {
        return gasificada;
    }

    public void setGasificada(String gasificada) {
        this.gasificada = gasificada;
    }

    public String getLight() {
        return light;
    }

    public void setLight(String light) {
        this.light = light;
    }

    @Override
    public String toString() {
        return super.toString() + " Bebida{" + "gasificada=" + gasificada + ", light=" + light + '}';
    }

    public int calcularDescuento() {
        return (int) (super.precio * Caja.DESCUENTO_BEBIDA);
    }

    public void mostrarDescuento() {
        System.out.println("Descuento Bebida >> " + Caja.DESCUENTO_BEBIDA * 100 + "%");
    }

}
