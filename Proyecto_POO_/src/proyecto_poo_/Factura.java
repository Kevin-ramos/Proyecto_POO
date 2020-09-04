/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_poo_;

import java.util.ArrayList;

/**
 *
 * @author Pavilion
 */
public class Factura {
    private int numFactura;
    private String fecha;
    private String nombre;
    private String apellido;
    private String numCedula;
    ArrayList <Consola> consola;
    ArrayList <Videojuego> videojuego;
    ArrayList <Consola> complemento;
    private double valorAPagar;

    public Factura() {
    }

    public Factura(int numFactura, String fecha, String nombre, String apellido, String numCedula, ArrayList<Consola> consola, ArrayList<Videojuego> videojuego, ArrayList<Consola> complemento, double valorAPagar) {
        this.numFactura = numFactura;
        this.fecha = fecha;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numCedula = numCedula;
        this.consola = consola;
        this.videojuego = videojuego;
        this.complemento = complemento;
        this.valorAPagar = valorAPagar;
    }

    public int getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumCedula() {
        return numCedula;
    }

    public void setNumCedula(String numCedula) {
        this.numCedula = numCedula;
    }

    public ArrayList<Consola> getConsola() {
        return consola;
    }

    public void setConsola(ArrayList<Consola> consola) {
        this.consola = consola;
    }

    public ArrayList<Videojuego> getVideojuego() {
        return videojuego;
    }

    public void setVideojuego(ArrayList<Videojuego> videojuego) {
        this.videojuego = videojuego;
    }

    public ArrayList<Consola> getComplemento() {
        return complemento;
    }

    public void setComplemento(ArrayList<Consola> complemento) {
        this.complemento = complemento;
    }

    public double getValorAPagar() {
        return valorAPagar;
    }

    public void setValorAPagar(double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }
    
    public double calcularValorPago(double valor){
        return valor;
    }

    @Override
    public String toString() {
        return "Datos de la Factura: " + "\n" + 
               "Número de la Factura: " + numFactura + "\n" + 
               "Fecha de facturación: " + fecha + "\n" + 
               "Nombre del Cliente: " + nombre + "\n" + 
               "Apellido del Cliente: " + apellido + "\n" + 
               "Número de Cédula: " + numCedula + "\n" + 
               "Modelo de Consola: " + consola + "\n" + 
               "Video juego: " + videojuego + "\n" + 
               "Complemento adquirido: " + complemento + "\n" + 
               "Valor a pagar: " + valorAPagar;
    }
    
}
