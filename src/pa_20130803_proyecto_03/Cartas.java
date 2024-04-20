/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_20130803_proyecto_03;

import java.awt.Component;

/**
 *
 * @author cgl05
 */
public class Cartas extends JuegoMesa {
    private Boolean azar; 
    
    public Cartas() 
    {
        azar = true;
    }

    public Cartas(String condicional, String descripcion, String numJugadores) 
    {
        super(descripcion, numJugadores);
        switch(condicional)
        {
            case "si":
                azar = true;
                break;
            case "no":
                azar = false;
                break;
            case "Si":
                azar = true;
                break;
            case "No":
                azar = false;
                break;
        }
    }

    public Boolean getAzar() {
        return azar;
    }

    public void setAzar(Boolean azar) {
        this.azar = azar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNumJugadores() {
        return numJugadores;
    }

    @Override
    public void setNumJugadores(String numJugadores) {
        this.numJugadores = numJugadores;
    }
    
    @Override
    public void dibujar(Component c) 
    {
        
    }

    @Override
    public void mover(Component c) 
    {
        
    }
    
    @Override
    public String atributoUno()
    {
        if(azar == true)
            return "Azar: Si";
        else
            return "Azar: No";
    }
    
}
