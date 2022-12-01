/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Composite.Composite;
import Observer.Apostador;
import Observer.Juego;
import Strategy.Marcador;
import Vista.Vista;

/**
 *
 * @author Lenovo
 */
public class Controller {
    private Vista vista;
    private Composite c;
    private Juego j1;
    private Apostador a;
    private Marcador m;
    
    
    
    public Controller(){
        this.vista = new Vista();
        this.c = new Composite();
        this.j1 = new Juego();
        this.a = new Apostador(j1);
        this.m = new Marcador();
    }

    public void fase1(){
        //creo juego y apostador
        int contador=1;
        vista.imprimirInformacion("Bienvenido a la Fase 1 apostador");
        j1.crear_juego(j1);
        j1.agregar(a);
        c.crearPartidos(j1);
        
        //recibo la apuesta 
        vista.imprimirInformacion("Por favor digite el nombre equipo ganador o empate en su defecto por cada partido");
        do{
          vista.imprimirInformacion("Nombre del ganador del partido "+contador+": ");
          a.agregarapuesta(vista.leerTexto());
          contador++;
        }while(contador<9);
  
        //comparo y doy los puntos si le atino
        vista.imprimirInformacion("El listado de equipos ganadores es: ");
        vista.imprimir(m.Strategia(j1));
        m.Apostar(j1,a.getApuesta(),a);
         
        
        
        //vista.listaimprime();
        
        
        
    }
}