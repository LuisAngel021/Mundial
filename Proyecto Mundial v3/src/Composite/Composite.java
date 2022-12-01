/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import Observer.Juego;
import Observer.Registro;
import Strategy.Marcador;
import Vista.Vista;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Miguel Barón
 */
public class Composite extends Component {

    public ArrayList<Component> hijos = new ArrayList(); // Fase de Grupos 
    public ArrayList<Partidos> partidos = new ArrayList(); // Fase de Grupos 
    Vista lector;
      
    public Composite(String grupo, String nombre) {
        super(grupo, nombre);
        this.lector = new Vista();
    }
    public Composite(){
        super("","");
    }
   
    public ArrayList crearPartidos(Juego juego) { // execute
        Unit u = new Unit();
        u.definirGrupos(hijos);
        Random r = new Random();
        for (int i = 0; i < 8; i++) {
            if (i < 8) {
                seleccionarEquipos();
                partidos.add(new Partidos(hijos.remove(0).getNombre(), hijos.remove(0).getNombre(), r.nextInt(4), r.nextInt(4)));
            } else {
               partidos.add(new Partidos(hijos.remove(0).getNombre(), hijos.remove(0).getNombre(), r.nextInt(4), r.nextInt(4)));
            }

        }
        juego.aviso("fase 1", partidos, 0);
        return partidos;
    }
  
    public void seleccionarEquipos() {
        for (int i = 0; i < 2; i++) {
            Random r = new Random();
            int dado = r.nextInt(3);
            hijos.remove(dado);
        }
    }
}