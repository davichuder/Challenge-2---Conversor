package componentes;

import java.util.ArrayList;
import java.util.Objects;
import java.awt.*;

import javax.swing.*;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import constantes.Parametros;
import enums.Conversiones;
import funciones.Conversion;

public class Conversor {
    private JPanel conversor = new JPanel();
    private JTextField entrada;
    private JLabel salida;
    private JComboBox opcionesEntrada;
    private JComboBox opcionesSalida;
    private ArrayList<Conversiones> lista;

    public Conversor() {
        this.configurar();
    }

    public void configurar() {
        this.conversor.setBounds(Parametros.WIDTH_PANEL_LATERAL, Parametros.HEIGHT_BAR,
                Parametros.WIDTH_PANEL_PRINCIPAL, Parametros.HEIGHT_PANEL_LATERAL);
        this.conversor.setBackground(Color.getHSBColor(125, 50, 25));
        this.conversor.setLayout(null);
        this.conversor.setVisible(false);

        this.entrada = new JTextField();
        this.entrada.setBounds(100, 200, 200, 50);
        this.entrada.addKeyListener(new CustomKeyListener(this));

        this.salida = new JLabel("Seleccione los pares a convertir");
        this.salida.setBounds(0, 300, 400, 50);
        this.salida.setHorizontalAlignment(SwingConstants.CENTER);

        this.opcionesEntrada = new JComboBox<>();
        this.opcionesEntrada.setBounds(25, 100, 150, 20);
        this.opcionesEntrada.addActionListener(e -> {
            String opcionSeleccionada = (String) this.opcionesEntrada.getSelectedItem();
            DefaultComboBoxModel model = (DefaultComboBoxModel) this.opcionesSalida.getModel();
            model.removeAllElements();
            model.addElement("[Destino]");

            for (String item : Conversiones.obtenerUnicosNombreBSegunNombreA(this.lista, opcionSeleccionada)) {
                model.addElement(item);
            }
        });

        this.opcionesSalida = new JComboBox<>();
        this.opcionesSalida.setBounds(200, 100, 150, 20);
        this.opcionesSalida.addActionListener(evt -> {
            String input;
            String output;
            try {
                input = (String) this.opcionesEntrada.getSelectedItem();
                output = (String) this.opcionesSalida.getSelectedItem();
            } catch (Exception exc) {
                input = "";
                output = "";
            }
            if (!Objects.isNull(input) && !Objects.isNull(output)) {
                if (!input.equals("[Origen]") & !output.equals("[Destino]")) {
                    try {
                        Double a = Conversiones.obtenerA(this.lista, input, output);
                        Double b = Conversiones.obtenerB(this.lista, input, output);
                        Double numero = Double.parseDouble(this.entrada.getText());
                        Double resultado = Conversion.funcionLineal(numero, a, b);
                        String mensaje = numero + " " + input + " = " + String.format("%.2f",
                                resultado) + " " + output;
                        this.salida.setText(mensaje);
                    } catch (Exception exception) {
                        this.salida.setText("ERROR: Por favor, ingrese un valor valido");
                    }
                    if (this.entrada.getText().equals("") )
                    this.salida.setText("Ingrese un valor para convertir");
                }
            }
        });

        this.conversor.add(this.opcionesEntrada);
        this.conversor.add(this.opcionesSalida);
        this.conversor.add(entrada);
        this.conversor.add(salida);
    }

    public JPanel getConversor() {
        return this.conversor;
    }

    public ArrayList<Conversiones> getLista() {
        return lista;
    }

    public void mostrar(boolean visible) {
        this.conversor.setVisible(visible);
        this.salida.setText("Seleccione los pares a convertir");
        this.entrada.setText("");
    }

    public void agregarConversorDistancia(JFrame frame) {
        frame.add(this.conversor);
    }

    public void setOpcionesEntrada(ArrayList<Conversiones> lista) {
        this.lista = lista;

        DefaultComboBoxModel model = (DefaultComboBoxModel) this.opcionesEntrada.getModel();
        model.removeAllElements();
        model.addElement("[Origen]");

        for (String item : Conversiones.obtenerUnicosNombreA(lista)) {
            model.addElement(item);
        }
    }
}
