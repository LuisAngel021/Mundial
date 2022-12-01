/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import Vista.Vista;

/**
 *
 * @author Lenovo
 */
public class Apostador implements Observador{
    Vista lector;
    public Observado juego;
    
  
    public Apostador(Observado ob) {
        this.juego=ob;
        this.lector = new Vista();
    }
    

    //Aparece en pantalla la actualización
    @Override
    public void update() {
            lector.imprimirInformacion("Actualizaciones de los partidos: ");
    }    
}
