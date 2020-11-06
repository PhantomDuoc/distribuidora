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
public class Vino extends Bebestible {

    private int gradosAlcoholicos;
    private String categoria;

    public Vino() {
    }

    public Vino(int gradosAlcoholicos, String categoria, int codigo, String nombre, String marca, double volumen, int precio) {
        super(codigo, nombre, marca, volumen, precio);
        this.gradosAlcoholicos = gradosAlcoholicos;
        this.categoria = categoria;
    }

    public int getGradosAlcoholicos() {
        return gradosAlcoholicos;
    }

    public void setGradosAlcoholicos(int gradosAlcoholicos) {
        this.gradosAlcoholicos = gradosAlcoholicos;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString() + " Vino{" + "gradosAlcoholicos=" + gradosAlcoholicos + ", categoria=" + categoria + '}';
    }

    public int calcularDescuento() {
        return (int) (super.precio * Caja.DESCUENTO_VINO);
    }

    public void mostrarDescuento() {
        System.out.println("Descuento Vino >> " + Caja.DESCUENTO_VINO * 100 + "%");
    }
}
