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
public class SerpientesYEscaleras extends Tablero {
    private String dificultad;

    public SerpientesYEscaleras() 
    {
        dificultad = "normal";
    }

    public SerpientesYEscaleras(String dificultad, String condicional, String descripcion, String numJugadores)
    {
        super(condicional, descripcion, numJugadores);
        this.dificultad = dificultad;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
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
       for (int i = 0; i <=15; i++)
       {
            dib.fillRect(80-i,300-i, 5, 5);
       }
       dib.setColor(Color.black);
       dib.drawLine(65,285, 80, 300);
       dib.setColor(Color.green);
       for (int i = 0; i <=15; i++)
       {
            dib.fillRect(80+i,300+i, 15, 15);
            dib.fillRect(95-i,315+i, 15, 15);
            dib.fillRect(80+i,330+i, 15, 15);
            dib.fillRect(95-i,345+i, 15, 15);
            dib.fillRect(80+i,360+i, 15, 15);
       }
       dib.setColor(Color.white);
       dib.fillOval(80, 310, 8, 8);
       dib.fillOval(90, 300, 8, 8);
       dib.setColor(Color.black);
       dib.fillOval(80, 310, 5, 5);
       dib.fillOval(90, 300, 5, 5);
       dib.setColor(c.getBackground());
       dib.fillRect(65, 285, 5, 5);
    }
    
    @Override
    public void mover(Component c)
    {
       dib = c.getGraphics();
       for (int y = 0; y < 80; y++)
       {
            dib.setColor(c.getBackground());
            dib.fillRect(0, 200, c.getWidth(), c.getHeight());
       
            dib.setColor(Color.red);
            for (int i = 0; i <=15; i++)
            {
                 dib.fillRect(80-i,(300-i)-y, 5, 5);
            }
            dib.setColor(Color.black);
            dib.drawLine(65,285-y, 80, 300-y);
            dib.setColor(Color.green);
            for (int i = 0; i <=15; i++)
            {
                 dib.fillRect(80+i,(300+i)-y, 15, 15);
                 dib.fillRect(95-i,(315+i)-y, 15, 15);
                 dib.fillRect(80+i,(330+i)-y, 15, 15);
                 dib.fillRect(95-i,(345+i)-y, 15, 15);
                 dib.fillRect(80+i,(360+i)-y, 15, 15);
            }
            dib.setColor(Color.white);
            dib.fillOval(80, 310-y, 8, 8);
            dib.fillOval(90, 300-y, 8, 8);
            dib.setColor(Color.black);
            dib.setFont(new Font("Arial",Font.BOLD,14));
            dib.drawString(descripcion,50, 285-y);
            dib.fillOval(80, 310-y, 5, 5);
            dib.fillOval(90, 300-y, 5, 5);
            dib.setColor(c.getBackground());
            dib.fillRect(65, 285-y, 5, 5);
            try {
                 Thread.sleep(75);
             } catch (InterruptedException ex) {
                 Logger.getLogger("...");
            }
            dib.setColor(c.getBackground());
            dib.fillRect(0, 190, c.getWidth(), c.getHeight());
            dib.setColor(Color.black);
        }
    }
    
    @Override
    public String atributoDos()
    {
        return "Dificultad: " + dificultad;
    }
    
    @Override
    public String nombre() {
        return "Serpientes y escaleras";
    }
    
}
