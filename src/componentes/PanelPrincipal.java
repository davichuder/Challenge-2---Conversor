package componentes;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import constantes.Parametros;

public class PanelPrincipal {
    private JPanel panel_principal = new JPanel();

    public PanelPrincipal() {
        this.configurar();
    }

    private void configurar() {
        this.panel_principal.setBounds(Parametros.WIDTH_PANEL_LATERAL, Parametros.HEIGHT_BAR, Parametros.WIDTH_TOTAL,
                Parametros.HEIGHT_PANEL_LATERAL);
        this.panel_principal.setBackground(Color.WHITE);
        this.panel_principal.setLayout(null);

        JLabel info = new JLabel("<html>Elija un conversor<br/><br/>para continuar</html>");
        info.setForeground(Color.BLACK);
        info.setBounds(0, 0, Parametros.WIDTH_TOTAL, Parametros.HEIGHT_PANEL_LATERAL);
        info.setHorizontalAlignment(SwingConstants.CENTER);
        info.setVerticalAlignment(SwingConstants.CENTER);
        info.setFont(new Font(Parametros.INFO_FUENTE, Font.PLAIN, Parametros.TAMANIO_INFO));
        this.panel_principal.add(info);
    }

    public JPanel getPanelPrincipal() {
        return this.panel_principal;
    }

    public void agregarPanelPrincipal(JFrame frame) {
        frame.add(this.panel_principal);
    }

    public void mostrar(boolean visible) {
        this.panel_principal.setVisible(visible);
    }
}
