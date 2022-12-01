/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import Vista.Vista;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Apostador implements Observador{
    Vista lector;
    public Observado juego;
    int bolsa=0;
    ArrayList<String> apuesta;
 
    
    public Apostador(Observado ob) {
        this.juego=ob;
        this.lector = new Vista();
        this.apuesta = new ArrayList<>();
    }
    
    public void agregarapuesta(String a){
        this.apuesta.add(a);
    }
    public void limpiar(ArrayList<String> lista){
        lista.clear();
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    public ArrayList<String> getApuesta() {
        return apuesta;
    }
    
    //Aparece en pantalla la actualización
    @Override
    public void update(int i) {
        if(i==1)
        {
            System.out.println("Sus puntos son: "+getBolsa());
        }
        else{
            System.out.println("Hay notificaciones de los nuevos partidos !!!");
        }
    }    
}
