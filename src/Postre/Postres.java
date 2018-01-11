package Postre;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.omg.CORBA.Principal;

import Registro.Registros;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Choice;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import Formulario.restaurante;

public class Postres extends JFrame {
	
	ButtonGroup bg = new ButtonGroup();
	private JPanel contentPane;
	Formulario.restaurante form = new Formulario.restaurante();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Postres frame = new Postres();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Postres() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 498, 350);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(189, 183, 107));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(189, 183, 107));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblPostres = new JLabel("POSTRES");
		lblPostres.setForeground(new Color(255, 215, 0));
		lblPostres.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPostres.setHorizontalAlignment(SwingConstants.CENTER);
		lblPostres.setBounds(10, 11, 404, 24);
		panel.add(lblPostres);
		
		JRadioButton gelatina = new JRadioButton("Gelatina");
		gelatina.setFont(new Font("Tahoma", Font.PLAIN, 12));
		gelatina.setForeground(new Color(255, 255, 255));
		gelatina.setBackground(new Color(189, 183, 107));
		gelatina.setBounds(17, 54, 121, 23);
		panel.add(gelatina);
		
		JRadioButton helado = new JRadioButton("Helado");
		helado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		helado.setForeground(new Color(255, 255, 255));
		helado.setBackground(new Color(189, 183, 107));
		helado.setBounds(17, 93, 121, 23);
		panel.add(helado);
		
		JRadioButton pastel = new JRadioButton("Pastel de Chocolate\r\n\r\n");
		pastel.setForeground(new Color(255, 255, 255));
		pastel.setBackground(new Color(189, 183, 107));
		pastel.setBounds(17, 131, 121, 23);
		panel.add(pastel);
		
		JRadioButton zanahoria = new JRadioButton("Pastel de Zanahoria");
		zanahoria.setFont(new Font("Tahoma", Font.PLAIN, 12));
		zanahoria.setForeground(new Color(255, 255, 255));
		zanahoria.setBackground(new Color(189, 183, 107));
		zanahoria.setBounds(17, 168, 121, 23);
		panel.add(zanahoria);
		
		JRadioButton flan = new JRadioButton("Flan");
		flan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		flan.setForeground(new Color(255, 255, 255));
		flan.setBackground(new Color(189, 183, 107));
		flan.setBounds(17, 207, 121, 23);
		panel.add(flan);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				enciar();
				
			}
		});
		btnEnviar.setBackground(new Color(218, 165, 32));
		btnEnviar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnEnviar.setBounds(373, 267, 89, 23);
		panel.add(btnEnviar);
		
		JLabel label = new JLabel(".......");
		label.setForeground(new Color(255, 255, 255));
		label.setBounds(148, 58, 46, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel(".......");
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(144, 97, 46, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel(".......");
		label_2.setForeground(Color.WHITE);
		label_2.setBounds(144, 135, 46, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel(".......");
		label_3.setForeground(Color.WHITE);
		label_3.setBounds(144, 172, 46, 14);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel(".......");
		label_4.setForeground(Color.WHITE);
		label_4.setBounds(144, 211, 46, 14);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("$ 25");
		label_5.setForeground(new Color(255, 255, 255));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(187, 59, 46, 14);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("$ 25");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setForeground(Color.WHITE);
		label_6.setBounds(187, 98, 46, 14);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("$ 25");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setForeground(Color.WHITE);
		label_7.setBounds(187, 135, 46, 14);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("$ 25");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setForeground(Color.WHITE);
		label_8.setBounds(187, 173, 46, 14);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("$ 25");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(Color.WHITE);
		label_9.setBounds(187, 212, 46, 14);
		panel.add(label_9);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		spinner.setBounds(243, 56, 44, 20);
		panel.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(243, 95, 44, 20);
		panel.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(243, 132, 44, 20);
		panel.add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(243, 170, 44, 20);
		panel.add(spinner_3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(243, 209, 44, 20);
		panel.add(spinner_4);
		
		JLabel lblCantidad = new JLabel("cantidad");
		lblCantidad.setForeground(new Color(255, 255, 255));
		lblCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantidad.setBounds(151, 31, 227, 14);
		panel.add(lblCantidad);
		
		JButton btnNewButton = new JButton("REGRESAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				  
			  Postres.this.dispose();
				    
			}
		});
		btnNewButton.setBounds(213, 268, 130, 23);
		panel.add(btnNewButton);
		
		
		bg.add(flan);
		bg.add(zanahoria);
		bg.add(pastel);
		bg.add(gelatina);
		bg.add(helado);

	}
	public void enciar() {
		JOptionPane.showConfirmDialog(contentPane, "Desea mandar la orden");
		
}
			
		
		



}
