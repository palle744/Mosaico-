package Mosaico4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana  extends JPanel {
	private final int WIDTH = 500, HEIGHT = 500;
	private JFrame ventana;
	private Container contenedor;

	
	public Ventana() {
		ventana = new JFrame("Mosaico");
		
		configureWindow();
		configureContainer();
		this.setBackground(Color.black);
		
	}
	private void configureContainer() {
		contenedor = ventana.getContentPane();
		contenedor.setSize(WIDTH, HEIGHT);
		contenedor.add(this, BorderLayout.CENTER);
		
	
		
	}

	private void configureWindow() {
		ventana.setResizable(false);
		ventana.setVisible(true);
		ventana.setSize(WIDTH, HEIGHT);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
	}
	
	
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);;

        Graphics2D g2 = (Graphics2D) g;

        TexturePaint relleno = null;
        try {
            relleno = new TexturePaint(ImageIO.read(new File("C:\\Users\\alanc\\Documents\\Gabi\\Captura.png")),
                    new Rectangle(0, 0, 50, 50));
        } catch (IOException e) {
            e.printStackTrace();
        }

        g2.setPaint(relleno);

        g.fillRect(0, 0, 500, 500);
    }
	
	
}
