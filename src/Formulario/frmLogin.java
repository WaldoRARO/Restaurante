package Formulario;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bean.Usuario;
import mantenimientos.GestionUsuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Font;

public class frmLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtContrase�a;
	JRadioButton Hombre;
	ButtonGroup bH;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmLogin frame = new frmLogin();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				    
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmLogin() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 443, 226);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUsuario = new JLabel("USERNAME");
		lblUsuario.setFont(new Font("Consolas", Font.BOLD, 12));
		lblUsuario.setForeground(new Color(255, 255, 255));
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario.setBounds(50, 81, 85, 14);
		contentPane.add(lblUsuario);

		JLabel lblContrasea = new JLabel("PASSWORD");
		lblContrasea.setFont(new Font("Consolas", Font.BOLD, 12));
		lblContrasea.setForeground(new Color(255, 255, 255));
		lblContrasea.setHorizontalAlignment(SwingConstants.CENTER);
		lblContrasea.setBounds(50, 110, 85, 14);
		contentPane.add(lblContrasea);
		
		


		txtUsuario = new JTextField();
		txtUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		txtUsuario.setBounds(166, 78, 190, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);

		txtContrase�a = new JPasswordField();
		txtContrase�a.setBounds(166, 107, 190, 20);
		contentPane.add(txtContrase�a);

		JButton btnSalir = new JButton("exit");
		btnSalir.setForeground(Color.DARK_GRAY);
		btnSalir.setFont(new Font("Microsoft JhengHei", Font.BOLD, 11));
		btnSalir.setBackground(new Color(230, 230, 250));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				salir();
			}
		});
		btnSalir.setBounds(271, 147, 85, 23);
		contentPane.add(btnSalir);

		JButton btnIngresar = new JButton("login");
		btnIngresar.setFont(new Font("Microsoft JhengHei", Font.BOLD, 11));
		btnIngresar.setForeground(Color.DARK_GRAY);
		btnIngresar.setBackground(new Color(230, 230, 250));
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ingresar();
			}
		});
		btnIngresar.setBounds(176, 147, 85, 23);
		contentPane.add(btnIngresar);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 11, 427, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("..\\ima\\Login.jpg"));
		lblNewLabel_1.setBounds(0, 24, 437, 50);
		contentPane.add(lblNewLabel_1);
		
		JButton btnAgregar = new JButton("add");
		btnAgregar.setFont(new Font("Microsoft JhengHei", Font.BOLD, 11));
		btnAgregar.setForeground(Color.DARK_GRAY);
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(txtUsuario.getText().length()==0){
			JOptionPane.showMessageDialog(null, "Ingresar usuario","ERROR",JOptionPane.WARNING_MESSAGE);
		}else if(txtContrase�a.getPassword().length==0){
			JOptionPane.showMessageDialog(null, "Ingresar contrase�a","ERROR",JOptionPane.WARNING_MESSAGE);
		}else{
				
				
				Connection con = null;
				try {
					
					Class.forName("com.mysql.jdbc.Driver");
					String url = "jdbc:mysql://localhost/bd_tutorial";
					String usr = "root";
					String psw = "RARO97";
					//String psw = "";//
					
					con = DriverManager.getConnection(url, usr, psw);
					
					String usuario= txtUsuario.getText();
					String clave = String.valueOf(txtContrase�a.getPassword());
					
				 
				
					String query = "INSERT INTO tb_usuario (usuario,clave) values ('"+usuario+"','"+clave+"')";
					
			
					
					Statement stm = con.createStatement();
					
					stm.executeUpdate(query);
					
					txtUsuario.setText("");
					txtContrase�a.setText("");
					
					
					JOptionPane.showMessageDialog(null, "USUARIO INGRESADO A LA BD");
					
				} catch (ClassNotFoundException e) {
					System.out.println("Error");
				} catch (SQLException e) {
					System.out.println("Error con la  conexi�n de BD");
				}
				
				
		}

				
			}
		});
		btnAgregar.setBounds(78, 147, 85, 23);
		contentPane.add(btnAgregar);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("src/ima1/Login.jpg"));
		lblNewLabel_2.setBounds(0, 0, 437, 197);
		contentPane.add(lblNewLabel_2);
	}

	protected void ingresar() {

		String usuario = txtUsuario.getText();
		String clave = String.valueOf(txtContrase�a.getPassword());

		GestionUsuario gestionUsuario = new GestionUsuario();

		Usuario usuario2 = new Usuario();
		usuario2.setUsuario(usuario);
		usuario2.setClave(clave);

		Usuario usu = gestionUsuario.obtenerUsuario(usuario2);
		if(txtUsuario.getText().length()==0){
		JOptionPane.showMessageDialog(txtUsuario, "Ingresar usuario" ,"Error", JOptionPane.WARNING_MESSAGE);
		}else{
		


		if (usu != null) {
			JOptionPane.showMessageDialog(contentPane, "   Bienvenido");

			this.dispose();
			
			restaurante bienvenida = new restaurante();
			bienvenida.setVisible(true);

		} else {
			JOptionPane.showMessageDialog(contentPane, "Datos incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
		}
		}
	}

	protected void salir() {
		System.exit(0);
	}
}
