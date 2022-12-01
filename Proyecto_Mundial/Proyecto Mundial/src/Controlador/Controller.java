/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Composite.Composite;
import Observer.Apostador;
import Observer.Juego;
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
    
    
    public Controller(){
        this.vista = new Vista();
        this.c = new Composite();
        this.j1 = new Juego();
        this.a = new Apostador(j1);
        
    }

    public void fase1(){
        vista.imprimirInformacion("Bienvenido a la Fase 1 apostador");
        j1.crear_juego(j1);
        j1.agregar(a);
        c.crearPartidos(j1);
        
         

    }
}