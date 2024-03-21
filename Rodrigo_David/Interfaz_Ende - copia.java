package Rodrigo_David;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Interfaz_Ende {

    private JFrame frmRodrigosuma;
    private JTextField txtN1;
    private JTextField txtN2;
    private JLabel lblSalida;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	Interfaz_Ende window = new Interfaz_Ende();
                    window.frmRodrigosuma.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Interfaz_Ende() {
        initialize();
    }

    private void initialize() {
        frmRodrigosuma = new JFrame();
        frmRodrigosuma.setTitle("Rodrigo-Divisor");
        frmRodrigosuma.setResizable(false);
        frmRodrigosuma.setBounds(100, 100, 450, 275);
        frmRodrigosuma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmRodrigosuma.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Numero 1:");
        lblNewLabel.setBounds(37, 42, 70, 14);
        frmRodrigosuma.getContentPane().add(lblNewLabel);

        txtN1 = new JTextField();
        txtN1.setBounds(105, 39, 86, 20);
        frmRodrigosuma.getContentPane().add(txtN1);
        txtN1.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("Numero 2:");
        lblNewLabel_1.setBounds(37, 92, 70, 14);
        frmRodrigosuma.getContentPane().add(lblNewLabel_1);

        txtN2 = new JTextField();
        txtN2.setBounds(105, 89, 86, 20);
        frmRodrigosuma.getContentPane().add(txtN2);
        txtN2.setColumns(10);

        JButton botonDividir = new JButton("Dividir");
        botonDividir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double n1 = Double.parseDouble(txtN1.getText());
                    double n2 = Double.parseDouble(txtN2.getText());

                    double division = n1 / n2;

                    lblSalida.setText(String.format("%.2f / %.2f = %.2f", n1, n2, division));
                } catch (NumberFormatException ex) {
                    lblSalida.setText("Error: Ingresa números válidos");
                } catch (ArithmeticException ex) {
                    lblSalida.setText("Error: No se puede dividir por cero");
                }
            }
        });
        botonDividir.setBounds(10, 134, 89, 23);
        frmRodrigosuma.getContentPane().add(botonDividir);

        JButton botonLimpiar = new JButton("Limpiar");
        botonLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtN1.setText("");
                txtN2.setText("");

                lblSalida.setText("");
            }
        });
        botonLimpiar.setHorizontalAlignment(SwingConstants.RIGHT);
        botonLimpiar.setBounds(105, 134, 89, 23);
        frmRodrigosuma.getContentPane().add(botonLimpiar);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 0));
        panel.setBounds(20, 168, 360, 64);
        frmRodrigosuma.getContentPane().add(panel);
        panel.setLayout(null);

        lblSalida = new JLabel("Salida del resultado");
        lblSalida.setForeground(new Color(0, 128, 255));
        lblSalida.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblSalida.setHorizontalAlignment(SwingConstants.CENTER);
        lblSalida.setBounds(10, 0, 350, 64);
        panel.add(lblSalida);
    }
}
