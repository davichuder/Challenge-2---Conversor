package componentes;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import constantes.Parametros;
import enums.Conversiones;

public class PanelLateral {
    private JPanel panelLateral = new JPanel();

    public PanelLateral(PanelPrincipal panelPrincipal, Conversor conversor) {
        this.configurar(panelPrincipal, conversor);
    }

    private void configurar(PanelPrincipal panelPrincipal, Conversor conversor) {
        this.panelLateral.setBackground(Color.LIGHT_GRAY);
        this.panelLateral.setBounds(0, Parametros.HEIGHT_BAR, Parametros.WIDTH_PANEL_LATERAL, Parametros.HEIGHT_PANEL_LATERAL);
        this.panelLateral.setVisible(true);
        this.panelLateral.setLayout(new BoxLayout(panelLateral, BoxLayout.Y_AXIS));

        this.panelLateral.add(Box.createVerticalGlue());
        for (String tipo: Conversiones.listarTipos()) {
            JLabel item = new JLabel(tipo);
            item.setLayout(new FlowLayout(SwingConstants.CENTER));
            item.setFont(new Font(Parametros.OPCIONES_FUENTE, Font.PLAIN, Parametros.TAMANIO_OPCIONES));
            item.setBackground(Color.LIGHT_GRAY);
            item.setOpaque(true);
            item.addMouseListener(new CustomMouseListener(tipo, item, panelPrincipal, conversor));

            JPanel itemPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
            itemPanel.setOpaque(false);
            itemPanel.add(item);
            this.panelLateral.add(itemPanel);
            this.panelLateral.add(Box.createVerticalGlue());
        }
    }

    public void agregarPanelLateral(JFrame frame) {
        frame.add(this.panelLateral);
    }

    public JPanel getPanelLateral(){
        return this.panelLateral;
    }
}
