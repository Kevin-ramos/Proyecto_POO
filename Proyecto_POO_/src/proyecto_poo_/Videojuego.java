/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_poo_;

/**
 *
 * @author Pavilion
 */
public class Videojuego{
    private String nombre;
    private Consola precio;
    private String tipoRestriccion;
    private String tipoGenero;
    private String exclusividad;

    public Videojuego() {
    }

    public Videojuego(String nombre, Consola precio, String tipoRestriccion, String tipoGenero, String exclusividad) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipoRestriccion = tipoRestriccion;
        this.tipoGenero = tipoGenero;
        this.exclusividad = exclusividad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Consola getPrecio() {
        return precio;
    }

    public void setPrecio(Consola precio) {
        this.precio = precio;
    }

    public String getTipoRestriccion() {
        return tipoRestriccion;
    }

    public void setTipoRestriccion(String tipoRestriccion) {
        this.tipoRestriccion = tipoRestriccion;
    }

    public String getTipoGenero() {
        return tipoGenero;
    }

    public void setTipoGenero(String tipoGenero) {
        this.tipoGenero = tipoGenero;
    }

    public String getExclusividad() {
        return exclusividad;
    }

    public void setExclusividad(String exclusividad) {
        this.exclusividad = exclusividad;
    }
    
    
    public void visualizarJuegos(){
        
    }
    public String venderJuego(String juego){
        return juego;
    }
    public void actualizarStock(){
        
    }
    public boolean esExclusivo(){
        return true;
    }
}
