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
public abstract class Bebestible implements Caja {

    protected int codigo;
    protected String nombre;
    protected String marca;
    protected double volumen; //en litros, por ejemplo 1,5 Litros
    protected int precio;

    public Bebestible() {
    }

    public Bebestible(int codigo, String nombre, String marca, double volumen, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.volumen = volumen;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Bebestible{" + "codigo=" + codigo + ", nombre=" + nombre + ", marca=" + marca + ", volumen=" + volumen + ", precio=" + precio + '}';
    }

    public int calcularIva() {
        return (int) (this.precio * Caja.IVA);
    }

    public int calcularTotal() {
        return (int) (this.precio + calcularIva() - calcularDescuento());
    }

}
