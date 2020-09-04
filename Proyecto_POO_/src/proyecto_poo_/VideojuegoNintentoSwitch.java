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
public class VideojuegoNintentoSwitch extends NintentoSwitch{
    private int numeroJuegoNintento;

    public VideojuegoNintentoSwitch() {
    }

    public int getNumeroJuegoNintento() {
        return numeroJuegoNintento;
    }

    public void setNumeroJuegoNintento(int numeroJuegoNintento) {
        this.numeroJuegoNintento = numeroJuegoNintento;
    }
    public boolean esExclusivo(){
        return true;
    }
}
