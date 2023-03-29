package componentes;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import enums.Conversiones;
import funciones.Conversion;

class CustomKeyListener implements KeyListener {
    private Conversor conversor;

    public CustomKeyListener(Conversor conversor) {
        this.conversor = conversor;
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
        String entrada;
        String salida;

        JComboBox opcionesEntrada = (JComboBox) this.conversor.getConversor().getComponent(0);
        JComboBox opcionesSalida = (JComboBox) this.conversor.getConversor().getComponent(1);

        entrada = (String) opcionesEntrada.getItemAt(opcionesEntrada.getSelectedIndex());
        salida = (String) opcionesSalida.getItemAt(opcionesSalida.getSelectedIndex());

        JTextField input = (JTextField) this.conversor.getConversor().getComponents()[2];
        JLabel output = (JLabel) this.conversor.getConversor().getComponents()[3];


        if (!entrada.equals("[Origen]") & !salida.equals("[Destino]")) {
            try {
                Double a = Conversiones.obtenerA(this.conversor.getLista(), entrada, salida);
                Double b = Conversiones.obtenerB(this.conversor.getLista(), entrada, salida);
                Double numero = Double.parseDouble(input.getText());
                Double resultado = Conversion.funcionLineal(numero, a, b);
                String mensaje = numero + " " + entrada + " = " + String.format("%.2f",
                        resultado) + " " + salida;
                output.setText(mensaje);
            } catch (Exception exception) {
                output.setText("ERROR: Por favor, ingrese un valor valido");
            }
        }
    }
}