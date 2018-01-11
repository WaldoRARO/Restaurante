package Registro;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;

import Postre.Postres;
import Comida.comida;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Registros extends JFrame {
	
	
	JRadioButton rdtMujer = new JRadioButton("Mujer");
	JRadioButton rdtHombre = new JRadioButton("Hombre");
	
	ButtonGroup bg = new ButtonGroup();
	String genero ="";
	
	Postres pos= new Postres();
	private JPanel contentPane;
	private JTable table;
	private JTextField textFieldname;
	private JTextField textFieldid;
	private JTextField textFieldpostre;
	private JButton btnActualizar;
	Object[] row = new Object[5];
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registros frame = new Registros();
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
	public Registros() {
		setTitle("REGISTRO");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 692, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.setLocationRelativeTo(null);
		
	
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 33, 501, 260);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 13));
		scrollPane.setViewportView(table);
		

        
        // create a table model and set a Column Identifiers to this model 
        Object[] columns = {"COMIDA","BEBIDAS","POSTRE","GENERO","Comida"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        
        // set the model to the table
        table.setModel(model);
        
        textFieldname = new JTextField();
        textFieldname.setBounds(122, 316, 86, 20);
        panel.add(textFieldname);
        textFieldname.setColumns(10);
        
        textFieldid = new JTextField();
        textFieldid.setBounds(26, 316, 86, 20);
        panel.add(textFieldid);
        textFieldid.setColumns(10);
          
        textFieldpostre = new JTextField();
        textFieldpostre.setBounds(229, 316, 86, 20);
        panel.add(textFieldpostre);
        textFieldpostre.setColumns(10);
    
     
        
       
        JButton btnAdd = new JButton("add BD");
        btnAdd.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		
        		  row[0] = textFieldid.getText();
                  row[1] = textFieldname.getText();
                  row[2] = textFieldpostre.getText();
                  row[3] = rdtHombre.isSelected();
                  
                 
                  model.addRow(row);
                  
                  
                  
                  
                  
                  
                  Connection con = null;
  				try {
  					
  					Class.forName("com.mysql.jdbc.Driver");
  					String url = "jdbc:mysql://localhost/bd_tutorial";
  					String usr = "root";
  					String psw = "RARO97";
  					//String psw = "";//
  					
  					con = DriverManager.getConnection(url, usr, psw);
  					
  					String usuario= textFieldid.getText();
  					String clave= textFieldname.getText();
  					
  					
  				 
  				
  					String query = "INSERT INTO tb_usuario (usuario,clave) values ('"+usuario+"','"+clave+"')";
  					
  			
  					
  					Statement stm = con.createStatement();
  					
  					stm.executeUpdate(query);
  					
  					textFieldid.setText("");
  					textFieldname.setText("");
  					
  					
  					JOptionPane.showMessageDialog(null, "USUARIO INGRESADO A LA BD");
  					
  				} catch (ClassNotFoundException e1) {
  					System.out.println("Error");
  				} catch (SQLException e1) {
  					System.out.println("Error con la  conexión de BD");
  				}
  				
  				
                  
                  
        	}
        });
        btnAdd.setBounds(555, 30, 89, 23);
        panel.add(btnAdd);
        
        btnActualizar = new JButton("actualizar");
        btnActualizar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		 int i = table.getSelectedRow();
                 
                 if(i >= 0) 
                 {
                    model.setValueAt(textFieldid.getText(), i, 0);
                    model.setValueAt(textFieldname.getText(), i, 1);
                   
                 }
                 else{
                     System.out.println("Update Error");
                 }
        	}
        });
        btnActualizar.setBounds(555, 64, 89, 23);
        panel.add(btnActualizar);
        
        JButton btnAadir = new JButton("a\u00F1adir");
        btnAadir.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		
        		
        		
        			
        		  row[0] = textFieldid.getText();
                  row[1] = textFieldname.getText();
                  row[2] = textFieldpostre.getText();
                  row[3] = rdtHombre.getText();
               
                  model.addRow(row);
        		
        	}
        });
        btnAadir.setBounds(567, 315, 89, 23);
        panel.add(btnAadir);
        rdtHombre.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		
        	
        		
        	}
        });
        
       
        rdtHombre.setBounds(341, 315, 109, 23);
        panel.add(rdtHombre);
        rdtMujer.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
    
        	}
        });
        
       
        rdtMujer.setBounds(452, 315, 109, 23);
        panel.add(rdtMujer);
        
      
        bg.add(rdtHombre);
        bg.add(rdtMujer);
        

   
      
	        
       
	        // create JTextFields
        
       
	      

	       
	      
		
	}
	public void genero(String sexo) {
		genero= sexo;
		
	}
	}

