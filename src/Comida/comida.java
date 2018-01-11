package Comida;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import Formulario.restaurante;
import Postre.Postres;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import Registro.Registros;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import Comida.alimentos;
import javax.swing.JTextField;

public class comida extends JFrame implements ActionListener{
	
	
	private JComboBox<String> carne;
	private JComboBox<String> mariscos;
	private JTextArea resultado;
	private JPanel contentPane;
	Formulario.restaurante form = new Formulario.restaurante();
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					comida frame = new comida();
					 frame.setUndecorated(true);
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
	public comida() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 632, 485);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		
		JButton enviar = new JButton("SELECCIONAR");
		enviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent b) {
				
				if(carne.getSelectedIndex()!=0 || mariscos.getSelectedIndex()!=0) {
					if(mariscos.getSelectedIndex()!=0) {
						String mar = mariscos.getSelectedItem().toString();
						textField.setText(mar);
					}
					if(carne.getSelectedIndex()!=0) {
						String cor = carne.getSelectedItem().toString();
						textField.setText(cor);
					}
				}
			}
		});
		enviar.setBounds(165, 392, 121, 43);
		contentPane.add(enviar);
		
		carne = new JComboBox<String>();
		carne.setForeground(new Color(0, 0, 0));
		carne.setFont(new Font("Arial Black", Font.PLAIN, 13));
		carne.setBackground(new Color(102, 204, 153));
		carne.setBounds(43, 75, 348, 29);
		getContentPane().add(carne);
		
		carne.addItem("");
		carne.addItem("Puyazo \"Best Seller\" ....... $240.00");
		carne.addItem("Filete Blue Cheese ....... $340.00 ");
		carne.addItem("Filete de Res de Exportación ....... $320.00");
		carne.addItem("Filete Mignon ....... $330.00");
		carne.addItem("Filete de Res Nacional ....... $230.00");
		carne.addItem("Lomo de Costilla 10 OZ ....... $230.00");
		carne.addItem("Lomo de Costilla 16 OZ ....... $310.00");
		carne.addItem("Fajitas de Res ....... $195.00");
		
		
		mariscos = new JComboBox<String>();
		mariscos.setFont(new Font("Arial Black", Font.PLAIN, 13));
		mariscos.setBackground(new Color(204, 0, 0));
		mariscos.setForeground(new Color(0, 0, 0));
		mariscos.setBounds(43, 148, 348, 29);
		getContentPane().add(mariscos);
		
		JLabel lblNewLabel = new JLabel("CARNES");
		lblNewLabel.setForeground(new Color(102, 204, 153));
		lblNewLabel.setBackground(new Color(153, 153, 102));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(100, 29, 168, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MARISCOS");
		lblNewLabel_1.setForeground(new Color(204, 0, 0));
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(138, 115, 104, 29);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBackground(new Color(153, 204, 204));
		textField.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 13));
		textField.setBounds(43, 352, 364, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("ORDENAR");
		btnNewButton.setBounds(469, 390, 111, 45);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("REGRESAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comida.this.dispose();
			}
		});
		btnNewButton_1.setBounds(469, 11, 111, 37);
		contentPane.add(btnNewButton_1);
		
		mariscos.addItem("");
		mariscos.addItem("Filete de Pescado ....... $220.00");
		mariscos.addItem("Camarones Empanizados ....... $295.00");
		mariscos.addItem("Camarones al Ajillo ....... $260.00");
		mariscos.addItem("Pescado a \"la Tipitapa\" ....... $284.00");
		mariscos.addItem("Curritos de Pescado ....... $220.00");
		mariscos.addItem("Especial de Langosta ....... $340.00");
		
		
		carne.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				mariscos.setSelectedIndex(0);
			}
		});
		
		mariscos.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				carne.setSelectedIndex(0);
			}
		});
		
		
		
	
		
		
		

		
		
	
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
