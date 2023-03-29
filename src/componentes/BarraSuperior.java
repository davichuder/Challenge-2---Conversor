package componentes;

import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import constantes.Parametros;

public class BarraSuperior {
    private JPanel barraSuperior = new JPanel();
    private JLabel botonCerrar = new JLabel();
    private JLabel titulo = new JLabel();
    private Integer xMouse;
    private Integer yMouse;

    public BarraSuperior() {
        this.configurar();
    }

    private void configurar() {
        this.barraSuperior.setLayout(null);
        this.barraSuperior.setBackground(Color.GRAY);
        this.barraSuperior.setBounds(0, 0, Parametros.WIDTH_TOTAL, Parametros.HEIGHT_BAR);
        this.barraSuperior.setVisible(true);
        this.barraSuperior.setLayout(new FlowLayout());
        this.barraSuperior.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                xMouse = evt.getX();
                yMouse = evt.getY();
            }
        });

        this.titulo.setText(Parametros.TITULO);
        this.titulo.setFont(new Font(Parametros.TITULO_FUENTE, Font.PLAIN, Parametros.TAMANIO_TITULO));
        this.titulo.setBounds(0, 0, Parametros.WIDTH_TOTAL, Parametros.HEIGHT_BAR);
        this.titulo.setForeground(Color.BLACK);
        this.titulo.setHorizontalAlignment(SwingConstants.CENTER);
        this.titulo.setVerticalAlignment(SwingConstants.CENTER);

        this.botonCerrar.setText("X");
        this.botonCerrar.setFont(new Font("Arial", Font.PLAIN, 18));
        this.botonCerrar.setBounds(Parametros.WIDTH_TOTAL - Parametros.HEIGHT_BAR, 0, Parametros.HEIGHT_BAR, Parametros.HEIGHT_BAR);
        this.botonCerrar.setForeground(Color.BLACK);
        this.botonCerrar.setBackground(Color.GRAY);
        this.botonCerrar.setOpaque(false);
        this.botonCerrar.setHorizontalAlignment(SwingConstants.CENTER);
        this.botonCerrar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                System.exit(0);
            }

            public void mouseEntered(MouseEvent evt) {
                botonCerrar.setBackground(Color.LIGHT_GRAY);
                botonCerrar.setOpaque(true);
            }

            public void mouseExited(MouseEvent evt) {
                botonCerrar.setBackground(Color.YELLOW);
                botonCerrar.setOpaque(false);
            }

            public void mousePressed(MouseEvent evt) {
                botonCerrar.setBackground(Color.DARK_GRAY);
                botonCerrar.setOpaque(true);
                botonCerrar.setForeground(Color.WHITE);
            }

            public void mouseReleased(MouseEvent evt) {
                botonCerrar.setForeground(Color.BLACK);
            }
        });
    }

    public void agregarBarraSuperior(JFrame frame) {
        this.barraSuperior.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent evt) {
                int x = evt.getXOnScreen();
                int y = evt.getYOnScreen();
                frame.setLocation(x - xMouse, y - yMouse);
            }
        });

        frame.add(this.titulo);
        frame.add(this.botonCerrar);
        frame.add(this.barraSuperior);
    }

    public JPanel getBarraSuperior(){
        return this.barraSuperior;
    }
}
