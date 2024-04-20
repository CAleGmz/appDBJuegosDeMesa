/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_20130803_proyecto_03;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.util.logging.Logger;

/**
 *
 * @author cgl05
 */
public class Uno extends Cartas {
    private String variante;

    public Uno() 
    {
        variante = "Clasicas";
    }

    public Uno(String variante, String condicional, String descripcion, String numJugadores) 
    {
        super(condicional, descripcion, numJugadores);
        this.variante = variante;
    }

    public String getVariante() {
        return variante;
    }

    public void setVariante(String variante) {
        this.variante = variante;
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
       dib = c.getGraphics();
       dib.setColor(c.getBackground());
       dib.fillRect(0, 200, 150, c.getHeight());
       dib.setColor(Color.red);
       dib.fillRect(80,300, 55, 90);
       dib.setColor(Color.black);
       dib.drawRect(80,300, 55, 90);
       dib.setColor(Color.white);
       dib.drawLine(80, 335, 135, 300);
       dib.drawLine(80, 390, 135, 355);
       dib.setFont(new Font("Arial",Font.BOLD,18));
       dib.drawString("1",82, 315);
       dib.drawString("1",121, 386);
       dib.setFont(new Font("Arial",Font.BOLD,20));
       dib.drawString("1",100, 349);
    }
    
    @Override
    public void mover(Component c)
    {
       dib = c.getGraphics();
       for (int y = 0; y < 80; y++)
       {
            dib.setColor(c.getBackground());
            dib.fillRect(0, 200, c.getWidth(), c.getHeight());
            dib = c.getGraphics();
            dib.setColor(Color.red);
            dib.fillRect(80,300-y, 55, 90);
            dib.setColor(Color.black);
            dib.drawRect(80,300-y, 55, 90);
            dib.setFont(new Font("Arial",Font.BOLD,14));
            dib.drawString(descripcion,50, 290-y);
            dib.setColor(Color.white);
            dib.drawLine(80, 335-y, 135, 300-y);
            dib.drawLine(80, 390-y, 135, 355-y);
            dib.setFont(new Font("Arial",Font.BOLD,18));
            dib.drawString("1",82, 315-y);
            dib.drawString("1",121, 386-y);
            dib.setFont(new Font("Arial",Font.BOLD,20));
            dib.drawString("1",100, 349-y);
            try {
            Thread.sleep(75);
            } catch (InterruptedException ex) {
                Logger.getLogger("...");
            }
            
       }
    }
    
    @Override
    public String atributoDos()
    {
        return "Variante: " + variante;
    }
    
    @Override
    public String nombre() {
        return "Uno";
    }
    
}
