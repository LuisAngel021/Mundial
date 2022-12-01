/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

import Observer.Apostador;
import Observer.Juego;
import Observer.Registro;
import Vista.Vista;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Marcador implements Strategy{
    public ArrayList<String> ganadores = new ArrayList(); // Fase de Grupos
    public ArrayList<String> general  = new ArrayList();;
    Vista lector;
            
    public Marcador(){
        this.lector= new Vista();
    }
    
    @Override
    public ArrayList Strategia(Juego j) {

    for(int i = 0 ; i<j.getPartido().size(); i++){
        if(j.getPartido().get(i).getGolesEq1()>j.getPartido().get(i).getGolesEq2()){
            ganadores.add(j.getPartido().get(i).getEquipo1());
        }else if (j.getPartido().get(i).getGolesEq1() < j.getPartido().get(i).getGolesEq2()){
            ganadores.add(j.getPartido().get(i).getEquipo2());
        }else{
            ganadores.add("Empate");
        }
     }
    Registro.getInstance().escribe("El listado de equipos que ganaron: ",ganadores);
    return ganadores;
    }

    @Override
    public void Apostar(Juego j,ArrayList<String> a, Apostador ap) {
   
        if(ganadores.size()== a.size())
        {
            for(int i = 0 ; i<ganadores.size(); i++){
                if(ganadores.get(i).equalsIgnoreCase(a.get(i))){
                    ap.setBolsa(ap.getBolsa()+2);
                    j.notificar(1);
                }
            }
        }
        else{
        System.out.println("sorry, te robamos el dinero");
        } 
      Registro.getInstance().escribe("El listado de equipos ganadores que apostó :",a);
      
    }
    
}
