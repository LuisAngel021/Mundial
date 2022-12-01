/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

import Observer.Apostador;
import Observer.Juego;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public interface Strategy {
    public ArrayList Strategia(Juego j);
    public void Apostar(Juego j, ArrayList<String> apuesta,Apostador a);

}
