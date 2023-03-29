package componentes;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

import enums.Conversiones;

public class CustomMouseListener extends MouseAdapter{
    private String tipo;
    private JLabel item;
    private PanelPrincipal panelPrincipal;
    private Conversor conversor;
    
    public CustomMouseListener(String tipo, JLabel item, PanelPrincipal panelPrincipal, Conversor conversor) {
        this.tipo = tipo;
        this.item = item;
        this.panelPrincipal = panelPrincipal;
        this.conversor = conversor;
    }
    public void mouseEntered(MouseEvent evt) {
        item.setBackground(Color.GRAY);
    }
    public void mouseExited(MouseEvent evt){
        item.setBackground(Color.LIGHT_GRAY);
    }
    public void mouseClicked(MouseEvent evt) {
        panelPrincipal.mostrar(false);
        conversor.setOpcionesEntrada(Conversiones.listarPorTipo(tipo));
        conversor.mostrar(true);
    }    
}
