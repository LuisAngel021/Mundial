/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;

/**
 *
 * @author Miguel Barón
 * 
 **/
public class Unit {
    public ArrayList definirGrupos(ArrayList equipos){
        equipos.add(new Leaf("A", "Qatar") {});
        equipos.add(new Leaf("A", "Ecuador") {});
        equipos.add(new Leaf("A", "Senegal") {});
        equipos.add(new Leaf("A", "Paises Bajos") {});
        equipos.add(new Leaf("B", "Inglaterra") {});
        equipos.add(new Leaf("B", "Iran") {});
        equipos.add(new Leaf("B", "EEUU") {});
        equipos.add(new Leaf("B", "Gales") {});
        equipos.add(new Leaf("C", "Argentina") {});
        equipos.add(new Leaf("C", "Arabia Saudi") {});
        equipos.add(new Leaf("C", "Mexico") {});
        equipos.add(new Leaf("C", "Polonia") {});
        equipos.add(new Leaf("D", "Francia") {});
        equipos.add(new Leaf("D", "Australia") {});
        equipos.add(new Leaf("D", "Dinamarca") {});
        equipos.add(new Leaf("D", "Tunez") {});
        equipos.add(new Leaf("E", "España") {});
        equipos.add(new Leaf("E", "Costa Rica") {});
        equipos.add(new Leaf("E", "Alemania") {});
        equipos.add(new Leaf("E", "Japon") {});
        equipos.add(new Leaf("F", "Belgica") {});
        equipos.add(new Leaf("F", "Canada") {});
        equipos.add(new Leaf("F", "Marruecos") {});
        equipos.add(new Leaf("F", "Croacia") {});
        equipos.add(new Leaf("G", "Brazil") {});
        equipos.add(new Leaf("G", "Serbia") {});
        equipos.add(new Leaf("G", "Suiza") {});
        equipos.add(new Leaf("G", "Camerun") {});
        equipos.add(new Leaf("H", "Portugal") {});
        equipos.add(new Leaf("H", "Ghana") {});
        equipos.add(new Leaf("H", "Uruguay") {});
        equipos.add(new Leaf("H", "Corea del Sur") {}); 
        
        return equipos;
    }
}

