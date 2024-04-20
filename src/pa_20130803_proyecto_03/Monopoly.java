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
public class Monopoly extends Tablero {
    private String modelo;

    public Monopoly() {
        modelo = "Clasico";
    }

    public Monopoly(String modelo, String condicional, String descripcion, String numJugadores) 
    {
        super(condicional, descripcion, numJugadores);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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
       dib.setColor(Color.black);       
       dib.fillRect(80,300, 15, 30); 
       dib.drawLine(75, 330, 99, 330);
       dib.setColor(Color.green);
       dib.fillRect(80,325, 15, 3);
       dib.setColor(Color.PINK);
       dib.fillOval(74, 330, 25, 25);
       dib.setColor(Color.white);
       dib.drawLine(79, 334, 82, 334);
       dib.drawLine(89, 334, 92, 334);
       dib.drawLine(84, 347, 85, 346);
       dib.drawLine(83, 346, 84, 347);
       dib.drawLine(89, 347, 90, 346);
       dib.drawLine(88, 346, 89, 347);
       dib.drawLine(85, 347, 89, 347);
       dib.fillOval(78, 335, 5, 5);
       dib.fillOval(89, 335, 5, 5);
       dib.setColor(Color.black);
       dib.fillOval(79, 337, 3, 3);
       dib.fillOval(90, 337, 3, 3);
       dib.drawLine(83, 348, 84, 349);
       dib.drawLine(89, 349, 90, 348);
       dib.drawLine(84, 349, 89, 349);
       dib.fillRect(80,356, 15, 30);
       dib.fillRect(92,357, 7, 5);
       dib.fillRect(99,357, 3, 10);
       dib.fillRect(92,367, 10, 5);
       dib.fillRect(75,357, 5, 5);
       for (int a = 1; a <=8; a++)
       {
           dib.fillRect(75-a,357-a, 5, 5);
       }
        for (int a = 0; a <= 5; a++) 
        {
            dib.fillRect(67,348-a, 5, 5);
        }
       dib.setColor(Color.white);
       dib.fillRect(85,356,5,10);
       dib.setColor(Color.PINK);
       dib.fillRect(92,367, 5, 5);
       dib.fillRect(67,343, 5, 5);
       dib.setColor(Color.red);
       dib.fillRect(86,356,3,2);
       dib.setColor(Color.gray);
       dib.fillRect(80,386, 15, 25);
       dib.setColor(Color.black);
       dib.drawLine(87, 386, 87, 410);
       dib.setColor(c.getBackground());
       dib.fillRect(80,300, 15, 15);
    }
    
    @Override
    public void mover(Component c)
    {
       dib = c.getGraphics();
       for (int y = 0; y < 80; y++)
       {
            dib.setColor(c.getBackground());
            dib.fillRect(0, 200, c.getWidth(), c.getHeight());
            dib.setColor(Color.black);  
            dib.setFont(new Font("Arial",Font.BOLD,14));
            dib.drawString(descripcion,50, 295-y);
            dib.fillRect(80,300-y, 15, 30); 
            dib.drawLine(75, 330-y, 99, 330-y);
            dib.setColor(Color.green);
            dib.fillRect(80,325-y, 15, 3);
            dib.setColor(Color.PINK);
            dib.fillOval(74, 330-y, 25, 25);
            dib.setColor(Color.white);
            dib.drawLine(79, 334-y, 82, 334-y);
            dib.drawLine(89, 334-y, 92, 334-y);
            dib.drawLine(84, 347-y, 85, 346-y);
            dib.drawLine(83, 346-y, 84, 347-y);
            dib.drawLine(89, 347-y, 90, 346-y);
            dib.drawLine(88, 346-y, 89, 347-y);
            dib.drawLine(85, 347-y, 89, 347-y);
            dib.fillOval(78, 335-y, 5, 5);
            dib.fillOval(89, 335-y, 5, 5);
            dib.setColor(Color.black);
            dib.fillOval(79, 337-y, 3, 3);
            dib.fillOval(90, 337-y, 3, 3);
            dib.drawLine(83, 348-y, 84, 349-y);
            dib.drawLine(89, 349-y, 90, 348-y);
            dib.drawLine(84, 349-y, 89, 349-y);
            dib.fillRect(80,356-y, 15, 30);
            dib.fillRect(92,357-y, 7, 5);
            dib.fillRect(99,357-y, 3, 10);
            dib.fillRect(92,367-y, 10, 5);
            dib.fillRect(75,357-y, 5, 5);
            for (int a = 1; a <=8; a++)
            {
                dib.fillRect(75-a,(357-a)-y, 5, 5);
            }
             for (int a = 0; a <= 5; a++) 
             {
                 dib.fillRect(67,(348-a)-y, 5, 5);
             }
            dib.setColor(Color.white);
            dib.fillRect(85,356-y,5,10);
            dib.setColor(Color.PINK);
            dib.fillRect(92,367-y, 5, 5);
            dib.fillRect(67,343-y, 5, 5);
            dib.setColor(Color.red);
            dib.fillRect(86,356-y,3,2);
            dib.setColor(Color.gray);
            dib.fillRect(80,386-y, 15, 25);
            dib.setColor(Color.black);
            dib.drawLine(87, 386-y, 87, 410-y);
            dib.setColor(c.getBackground());
            dib.fillRect(80,300-y, 15, 15);
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
        return "modelo: " + modelo;
    }
    
    @Override
    public String nombre() {
        return "Monopoly";
    }
}
