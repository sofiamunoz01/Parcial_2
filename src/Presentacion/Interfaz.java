package Presentacion;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPanel;

import Logica.Parcial;

public class Interfaz extends JFrame implements ActionListener{
	
	private JTextField texto_a;
	private JTextField texto_b;
	private JTextField texto_c;
	private JLabel lResultado ;
	private JButton boton;
	private Parcial parcial;
	
	public Interfaz() {
		this.parcial = new Parcial();
		this.setTitle("Examen Sofia");
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		this.setBounds((int)pantalla.getWidth()/2 - 200, (int)pantalla.getHeight()/2 - 300, 400, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel pBotones = new JPanel();
		pBotones.setLayout(new GridLayout(4, 2));
        this.add(pBotones, BorderLayout.CENTER);

        pBotones.add(new JLabel("a:", SwingConstants.RIGHT));
        this.texto_a = new JTextField();
        pBotones.add(this.texto_a);

        pBotones.add(new JLabel("b:", SwingConstants.RIGHT));
        this.texto_b = new JTextField();
        pBotones.add(this.texto_b);

        pBotones.add(new JLabel("c:", SwingConstants.RIGHT));
        this.texto_c = new JTextField();
        pBotones.add(this.texto_c);

        this.boton = new JButton("Calcular");
        this.boton.addActionListener(this);
        pBotones.add(this.boton);

        this.lResultado = new JLabel("");
        pBotones.add(this.lResultado);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Interfaz();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            float a = Float.parseFloat(this.texto_a.getText());
            float b = Float.parseFloat(this.texto_b.getText());
            float c = Float.parseFloat(this.texto_c.getText());

            this.lResultado.setText(this.parcial.Raices(a, b, c));

        } catch (Exception e1) {
            this.lResultado.setText("Escribe numeros validos");
        }
    }

		
	}
	
	
