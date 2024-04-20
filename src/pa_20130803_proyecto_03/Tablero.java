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
public class Tablero extends JuegoMesa {
    private Boolean dados;

    public Tablero() 
    {
        dados = true;
    }

    public Tablero(String condicional, String descripcion, String numJugadores) 
    {
        super(descripcion, numJugadores);
        switch(condicional)
        {
            case "Si":
                dados = true;
                break;
            case "No":
                dados = false;
                break;
            case "si":
                dados = true;
                break;
            case "no":
                dados = false;
                break;
        }
    }

    public Boolean getDados() {
        return dados;
    }

    public void setDados(Boolean dados) {
        this.dados = dados;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
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
        if(dados == true)
            return "Usa Dados: Si";
        else
            return "Usa Dados: No";
    }
    
}
