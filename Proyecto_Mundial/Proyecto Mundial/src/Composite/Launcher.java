/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import Controlador.Controller;
import Observer.Juego;

/**
 *
 * @author Miguel Barón
 */
public class Launcher {
    public static void main(String[] args) {
       Controller c = new Controller();
       c.fase1();
    }
}
