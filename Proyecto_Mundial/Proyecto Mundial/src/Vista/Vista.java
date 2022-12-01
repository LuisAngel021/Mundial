/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Composite.Partidos;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Vista {
    private Scanner leer;

    public Vista() {
            leer = new Scanner(System.in);
    }

    public String leerTexto() {
            String dato = "";
            while (dato.length() == 0) {
                    dato = leer.nextLine();
            }
            return dato;
    }

    public long leerDatoLong() {
            long dato = 0;
            String aux = "";
            try {
                    while (aux.length() == 0) {
                            aux = leer.nextLine();
                    }
                    dato = Long.parseLong(aux);
            } catch (Exception e) {
                    System.out.println("El dato ingresado no es un numero");
                    dato = 0;
            }
            return dato;
    }

    public int leerOpcion() {
            String dato = "";
            int numero = 0;
            try {
                    while (dato.length() == 0) {
                            dato = leer.nextLine();
                    }
                    numero = Integer.parseInt(dato);
            } catch (Exception e) {
                    leer.nextLine();
                    System.out.println("El dato ingresado no es un numero");
                    numero = 0;
            }
            return numero;
    }

    public void imprimirInformacion(String msg) {
            System.out.println("\n"+msg);
    }
    
    public void listaimprime(ArrayList<Partidos> p){
        int t=p.size();
       for(int i=0;i<p.size();i++)
       {
           if(i==t-1)
           {
               System.out.println(p.get(i).getEquipo1()+" VS "+p.get(i).getEquipo2());
           }
        }
        
    }

}
