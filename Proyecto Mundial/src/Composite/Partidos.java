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
public class Partidos {
    String equipo1;
    String equipo2;
    int golesEq1;
    int golesEq2;

    public Partidos(String equipo1, String equipo2, int golesEq1, int golesEq2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEq1 = golesEq1;
        this.golesEq2 = golesEq2;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public int getGolesEq1() {
        return golesEq1;
    }

    public int getGolesEq2() {
        return golesEq2;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public void setGolesEq1(int golesEq1) {
        this.golesEq1 = golesEq1;
    }

    public void setGolesEq2(int golesEq2) {
        this.golesEq2 = golesEq2;
    }

    @Override
    public String toString() {
        return "Partidos{" + "equipo1=" + equipo1 + ", equipo2=" + equipo2 + ", golesEq1=" + golesEq1 + ", golesEq2=" + golesEq2 + '}';
    }
    
}
