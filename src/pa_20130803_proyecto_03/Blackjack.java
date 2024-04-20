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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cgl05
 */
public class Blackjack extends Cartas {
    private String tipoDeBaraja;

    public Blackjack() 
    {
        tipoDeBaraja = "Inglesa";
    }

    public Blackjack(String tipoDeBaraja, String condicional, String descripcion, String numJugadores) 
    {
        super(condicional, descripcion, numJugadores);
        this.tipoDeBaraja = tipoDeBaraja;
    }

    public String getTipoDeBaraja() {
        return tipoDeBaraja;
    }

    public void setTipoDeBaraja(String tipoDeBaraja) {
        this.tipoDeBaraja = tipoDeBaraja;
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
       dib.setColor(Color.white);
       dib.fillRect(80,300, 55, 90);
       dib.setColor(Color.black);
       dib.drawRect(80,300, 55, 90);
       dib.setFont(new Font("Arial",Font.BOLD,18));
       dib.drawString("A",82, 315);
       dib.drawString("A",121, 386);
       dib.fillOval(84, 318, 8, 8);
       dib.fillOval(83, 324, 8, 8);
       dib.fillOval(85, 324, 8, 8);
       dib.drawLine(88, 324, 88, 336);
       dib.fillOval(123, 362, 8, 8);
       dib.fillOval(122, 358, 8, 8);
       dib.fillOval(124, 358, 8, 8);
       dib.drawLine(127, 358, 127, 354);
       dib.fillOval(100, 335, 12, 12);
       dib.fillOval(99, 340, 12, 12);
       dib.fillOval(101, 340, 12, 12);
       dib.drawLine(106, 346, 106, 356);
    }
    
    @Override
    public void mover(Component c)
    {
       dib = c.getGraphics();
       for (int y = 0; y < 80; y++)
       {
            dib.setColor(c.getBackground());
            dib.fillRect(0, 200, c.getWidth(), c.getHeight());
            dib.setColor(Color.white);
            dib.fillRect(80,300-y, 55, 90);
            dib.setColor(Color.black);
            dib.setFont(new Font("Arial",Font.BOLD,14));
            dib.drawString(descripcion,50, 290-y);
            dib.drawRect(80,300-y, 55, 90);
            dib.setFont(new Font("Arial",Font.BOLD,18));
            dib.drawString("A",82, 315-y);
            dib.drawString("A",121, 386-y);
            dib.fillOval(84, 318-y, 8, 8);
            dib.fillOval(83, 324-y, 8, 8);
            dib.fillOval(85, 324-y, 8, 8);
            dib.drawLine(88, 324-y, 88, 336-y);
            dib.fillOval(123, 362-y, 8, 8);
            dib.fillOval(122, 358-y, 8, 8);
            dib.fillOval(124, 358-y, 8, 8);
            dib.drawLine(127, 358-y, 127, 354-y);
            dib.fillOval(100, 335-y, 12, 12);
            dib.fillOval(99, 340-y, 12, 12);
            dib.fillOval(101, 340-y, 12, 12);
            dib.drawLine(106, 346-y, 106, 356-y);
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
        return "Tipo de baraja: " + tipoDeBaraja;
    }
    
    @Override
    public String nombre() {
        return "Blackjack";
    }
    
}
