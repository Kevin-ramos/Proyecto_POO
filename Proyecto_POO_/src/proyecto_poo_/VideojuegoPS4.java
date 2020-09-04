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
public class VideojuegoPS4 extends PS4{
    private String codigoReferenciaPsPlus;

    public VideojuegoPS4() {
    }

    public String getCodigoReferenciaPsPlus() {
        return codigoReferenciaPsPlus;
    }

    public void setCodigoReferenciaPsPlus(String codigoReferenciaPsPlus) {
        this.codigoReferenciaPsPlus = codigoReferenciaPsPlus;
    }
    
    public boolean esExclusivo(){
        return true;
    }
}
