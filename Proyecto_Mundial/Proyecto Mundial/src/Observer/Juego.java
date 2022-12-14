/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;
import Composite.Partidos;
import Vista.Vista;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Lenovo
 */
public class Juego implements Observado{

    ArrayList<Observador> apostadores = new ArrayList<>();
    ArrayList<Partidos> partido = new ArrayList<>();
    Juego juego;
    Vista lector;
    
    public void crear_juego(Juego j){
        this.juego=new Juego();
        this.lector= new Vista();
    }

    public void aviso( String msg, Partidos p){
        partido.add(p);
        this.notificar();
        String k = "";
        k+=p.toString();        
        lector.listaimprime(partido);
        Registro.getInstance().escribe(msg,partido);
    }
    //Agrega apostador
    @Override
    public void agregar(Observador o) {
            this.apostadores.add(o);
    }

    //Elimina apostador
    @Override
    public void eliminar(Observador o) {
            this.apostadores.remove(o);
    }

    //Recorre toda la lista de los clientes y notifica el cambio 
    // Deberia aparecer en pantalla si hay un partido nuevo o si se perdió algún partido, diciendole si gano o perdió la apuesta
    @Override
    public void notificar() {

            for (int i=0; i<this.apostadores.size();i++)
            {
                    apostadores.get(i).update();
            }

    }
   
    
}
