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
public class VideojuegoXboxOne extends XboxOne{
    private String SerieTiendaMicrosoft;

    public VideojuegoXboxOne() {
    }

    public String getSerieTiendaMicrosoft() {
        return SerieTiendaMicrosoft;
    }

    public void setSerieTiendaMicrosoft(String SerieTiendaMicrosoft) {
        this.SerieTiendaMicrosoft = SerieTiendaMicrosoft;
    }
    
    public boolean esExclusivo(){
        return true;
    }
}
