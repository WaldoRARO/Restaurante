package Bebidas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Registro.Registros;
import Formulario.restaurante;
import Postre.Postres;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Choice;
import java.awt.SystemColor;
import java.awt.Button;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

public class bebidas extends JFrame {
	private JPanel contentPane;

	private JComboBox<String> bebidas;
	private JComboBox<String> alcohol;
	private JComboBox<String> sinAlcohol;
	
	Formulario.restaurante form = new Formulario.restaurante();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bebidas frame = new bebidas();
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
	public bebidas() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 750, 485);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBebidas = new JLabel("BEBIDAS");
		lblBebidas.setForeground(new Color(255, 255, 0));
		lblBebidas.setHorizontalAlignment(SwingConstants.CENTER);
		lblBebidas.setFont(new Font("DFGothic-EB", Font.BOLD, 22));
		lblBebidas.setBounds(10, 11, 714, 37);
		contentPane.add(lblBebidas);
		this.setLocationRelativeTo(null);
		ImageIcon foto1 = new ImageIcon("src/ima1/coca.jpg");
		
		JLabel lblNewLabel = new JLabel("BEBIDAS PREPARADAS");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("DFGothic-EB", Font.BOLD, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 160, 714, 37);
		contentPane.add(lblNewLabel);
		ImageIcon foto = new ImageIcon("src/ima1/bebidas.jpg");
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(bebidas.getSelectedIndex()!=0 || alcohol.getSelectedIndex()!=0 || sinAlcohol.getSelectedIndex()!=0) {
					if(alcohol.getSelectedIndex()!=0) {
						String alco = alcohol.getSelectedItem().toString();
						textField.setText(alco);
					}
					if(bebidas.getSelectedIndex()!=0) {
						String bebi = bebidas.getSelectedItem().toString();
						textField.setText(bebi);
					}
					if(sinAlcohol.getSelectedIndex()!=0) {
						String sinAl = sinAlcohol.getSelectedItem().toString();
						textField.setText(sinAl);
					}
				}
			}
		});
		btnEnviar.setBackground(new Color(128, 128, 128));
		btnEnviar.setFont(new Font("Verdana", Font.BOLD, 13));
		btnEnviar.setForeground(Color.WHITE);
		btnEnviar.setBounds(151, 392, 128, 30);
		contentPane.add(btnEnviar);
		
		JButton btnNewButton = new JButton("Regresar");
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 13));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(128, 128, 128));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 bebidas.this.dispose();
	     		
				
			}
		});
		btnNewButton.setBounds(431, 392, 128, 30);
		contentPane.add(btnNewButton);
		
		bebidas = new JComboBox<String>();
		bebidas.setForeground(new Color(255, 255, 255));
		bebidas.setFont(new Font("Arial Black", Font.PLAIN, 13));
		bebidas.setBackground(new Color(60, 179, 113));
		bebidas.setBounds(170, 59, 401, 38);
		getContentPane().add(bebidas);
		
		bebidas.addItem("");
		bebidas.addItem("Coca Cola....... $20.00");
		bebidas.addItem("Pepsi ....... $20.00 ");
		bebidas.addItem("Sprite ....... $18.00");
		bebidas.addItem("Manzana ....... $18.00");
		bebidas.addItem("Sidral ....... $16.00");
		bebidas.addItem("Fresca ....... $18.00");
		bebidas.addItem("Refresco de Vainilla ....... $16.00");
		bebidas.addItem("Agua Mineral....... $15.00");
		
		bebidas.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				alcohol.setSelectedIndex(0);
			}
		});
		
		alcohol = new JComboBox<String>();
		alcohol.setForeground(new Color(255, 255, 255));
		alcohol.setFont(new Font("Arial Black", Font.PLAIN, 13));
		alcohol.setBackground(new Color(255, 215, 0));
		alcohol.setBounds(170, 220, 408, 38);
		getContentPane().add(alcohol);
		
		alcohol.addItem("");
		alcohol.addItem("Cerveza Clara....... $20.00");
		alcohol.addItem("Cerveza Oscura ....... $20.00 ");
		alcohol.addItem("Tequila ....... $18.00");
		alcohol.addItem("Vodka ....... $18.00");
		alcohol.addItem("Ron ....... $16.00");
		alcohol.addItem("Vino Tinto ....... $18.00");
		alcohol.addItem("Vino Rosa ....... $16.00");
		alcohol.addItem("Whisky....... $15.00");
		
		alcohol.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				bebidas.setSelectedIndex(0);
			}
		});
		
		
		sinAlcohol = new JComboBox<String>();
		sinAlcohol.setForeground(new Color(255, 255, 255));
		sinAlcohol.setFont(new Font("Arial Black", Font.PLAIN, 13));
		sinAlcohol.setBackground(new Color(143, 188, 143));
		sinAlcohol.setBounds(170, 269, 408, 38);
		getContentPane().add(sinAlcohol);
		
		sinAlcohol.addItem("");
		sinAlcohol.addItem("Agua de Horchata....... $20.00");
		sinAlcohol.addItem("Agua de Jamaica ....... $20.00 ");
		sinAlcohol.addItem("Limonada ....... $18.00");
		sinAlcohol.addItem("Cocada ....... $18.00");
		sinAlcohol.addItem("Piñada ....... $16.00");
		sinAlcohol.addItem("Tamarindo ....... $18.00");
		
	
		sinAlcohol.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				bebidas.setSelectedIndex(0);
				alcohol.setSelectedIndex(0);
			}
		});
		
	
		
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(bebidas.class.getResource("/ima1/pape.jpg")));
		lblNewLabel_1.setBounds(0, 0, 734, 446);
		contentPane.add(lblNewLabel_1);
		
		
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBackground(SystemColor.control);
		textField.setFont(new Font("Arial Black", Font.BOLD, 13));
		textField.setBounds(170, 338, 408, 30);
		contentPane.add(textField);
		textField.setColumns(10);

	
		
	}
}
