package componentes;

import java.awt.geom.RoundRectangle2D;

import javax.swing.JFrame;

import constantes.Parametros;

public class Ventana {
    private JFrame ventana = new JFrame();

    public Ventana() {
    }

    public void configurar() {
        this.ventana.setLayout(null);
        this.ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.ventana.setSize(Parametros.WIDTH_TOTAL, Parametros.HEIGHT_TOTAL);
        this.ventana.setResizable(false);
        this.ventana.setUndecorated(true);
        this.ventana.setLocationRelativeTo(null);
        this.ventana.setShape(new RoundRectangle2D.Double(0, 0, Parametros.WIDTH_TOTAL, Parametros.HEIGHT_TOTAL,
                Parametros.HEIGHT_BAR, Parametros.HEIGHT_BAR));

        BarraSuperior barraSuperior = new BarraSuperior();
        PanelPrincipal panelPrincipal = new PanelPrincipal();
        Conversor conversor = new Conversor();
        PanelLateral panelLateral = new PanelLateral(panelPrincipal, conversor);

        barraSuperior.agregarBarraSuperior(this.ventana);
        panelLateral.agregarPanelLateral(this.ventana);
        panelPrincipal.agregarPanelPrincipal(this.ventana);
        conversor.agregarConversorDistancia(this.ventana);

        this.ventana.setVisible(true);
    }
}
