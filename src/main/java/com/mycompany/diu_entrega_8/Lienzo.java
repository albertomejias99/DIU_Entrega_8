package com.mycompany.diu_entrega_8;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author alber
 */
public class Lienzo extends JPanel {

    private BufferedImage imagen = null;

    public Lienzo() {
    }

    public BufferedImage getImagen() {
        return imagen;
    }

    public void setImagen(BufferedImage imagen) {
        this.imagen = imagen;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imagen != null) {
            g.drawImage(imagen, 0, 0, null);
        }
    }

    public int getImageWidth() {
        return imagen.getWidth();
    }

    public int getImageHeight() {
        return imagen.getHeight();
    }
}
