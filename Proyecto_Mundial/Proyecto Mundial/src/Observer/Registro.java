/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import Composite.Partidos;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
/**
 *
 * @author Lenovo
 */
public class Registro {
   
    private static Registro r;
    private String ficheroCopia="C:\\Users\\Lenovo\\Downloads//ficheroCopia.txt";
    private String ficheroOriginal="C:\\Users\\Lenovo\\Downloads//fichero.txt";
	
    //para evitar la creación de mas de una instancia
    private Registro() {	
        
    }
    
    //regresa una instancia unica de la clase que se va a guardar dentro de el static r 
    public static Registro getInstance() {
        if(r == null) {
            r= new Registro();
        }
         return r;
    }
    //la manera de acceder a este no es crear uno nuevo como 
    // new registros no, sino que se llama al get instance 
    //En el main
    //Registro registro = Registro.getInstance();
    // si se crean mas registros me estoy refiriendo a la misma instancia
    //el singleton solo me ayuda a no crear varias instancias del mismo
	 
    public void escribe(String reporte,ArrayList partido)
    {
          FileWriter Fichero = null;
	  PrintWriter pw = null;
	   try {
	           Fichero = new FileWriter(ficheroCopia);
	           pw = new PrintWriter(Fichero);
                   
                   pw.println(reporte);
                   for(int i=0; i<partido.size();i++){
                       pw.println(partido.get(i));
                   }
                   pw.println("\n");
                   
                   
            } catch (Exception e) {
                e.printStackTrace();
            }
	   finally {
            try {
                if (null != Fichero) {
                    Fichero.close();
                }
            } catch (Exception e2) {
	                e2.printStackTrace();
	   }
           }
    }
}


 

