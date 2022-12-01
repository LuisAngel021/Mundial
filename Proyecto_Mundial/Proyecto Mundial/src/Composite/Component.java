/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author Miguel Barón
 */
public abstract class Component {

    String grupo; // El grupo al que pertenece el equipo
    String nombre; // Nombre del equipo

    public Component(String grupo, String nombre) {
        this.grupo = grupo;
        this.nombre = nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Component{" + "grupo=" + grupo + ", nombre=" + nombre + '}';
    }
 
    public void operation() {
    }
}
