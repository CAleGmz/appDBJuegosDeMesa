/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_20130803_proyecto_03;

import java.awt.Component;
import java.awt.Graphics;

/**
 *
 * @author cgl05
 */
public abstract class JuegoMesa implements Comparable {
    protected String descripcion;
    protected String numJugadores;
    Graphics dib;
    
    public JuegoMesa() 
    {
        descripcion = "Juego de mesa";
        numJugadores = "1-2";
    } 
    
    public JuegoMesa(String descripcion, String numJugadores) 
    {
        this.descripcion = "Descipcion: " + descripcion;
        this.numJugadores = "Numero de jugadores: " + numJugadores;
    }  
    
    public abstract void dibujar(Component c);
    
    public abstract void mover(Component c);

    public String getDescripcion() {
        return "Descipcion: " + descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNumJugadores() {
        return numJugadores;
    }

    public void setNumJugadores(String numJugadores) {
        this.numJugadores = numJugadores;
    }
    
    @Override
    public int compareTo(Object o) 
    {
        JuegoMesa j = (JuegoMesa) o;        
        return descripcion.compareTo(j.descripcion);
    }
    
    public String nombre() {
        return "";
    }
    
    public String atributoUno()
    {
        return "";
    }
    
    public String atributoDos()
    {
        return "";
    }
}
