/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Miguel Barón
 */
public class Composite extends Component {

    public Composite(String grupo, String nombre) {
        super(grupo, nombre);
    }

    public Composite() {
        super("", "");
    }

    public ArrayList<Component> hijos = new ArrayList(); // Fase de Grupos 
    public ArrayList<Partidos> partidos = new ArrayList(); // Fase de Grupos 
    public ArrayList<String> ganadores = new ArrayList(); // Fase de Grupos
    
    public ArrayList crearPartidos() {
        Unit u = new Unit();
        u.definirGrupos(hijos);
        Random r = new Random();
        for (int i = 0; i < 8; i++) {
            if (i < 7) {
                seleccionarEquipos();
                partidos.add(new Partidos(hijos.remove(0).getNombre(), hijos.remove(0).getNombre(), r.nextInt(4), r.nextInt(4)));
            } else {
                partidos.add(new Partidos(hijos.remove(0).getNombre(), hijos.remove(0).getNombre(), r.nextInt(4), r.nextInt(4)));
            }

        }
        return partidos;
    }
    public ArrayList execute(){
        for(int i = 0 ; i<partidos.size(); i++){
            if(partidos.get(i).getGolesEq1()>partidos.get(i).getGolesEq2()){
                ganadores.add(partidos.get(i).getEquipo1());
            }else if (partidos.get(i).getGolesEq1() < partidos.get(i).getGolesEq2()){
                ganadores.add(partidos.get(i).getEquipo2());
            }else{
                ganadores.add("Empate");
            }
        }
        return ganadores;
    }

    public void mostrarPartidos() {
        partidos.stream().forEach(System.out::println);
    }

    public void seleccionarEquipos() {
        for (int i = 0; i < 2; i++) {
            Random r = new Random();
            int dado = r.nextInt(4);
            hijos.remove(dado);
        }
    }

}
