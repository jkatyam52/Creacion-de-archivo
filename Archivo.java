import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Archivo implements ActionListener
{
	private JFrame ventana;

	private JLabel lbl_nombre;
	private JTextField tf_nombre;

	private JLabel lbl_apellido;
	private JTextField tf_apellido;

	private JButton btn_grabar;
	private Jbutton btn_leer;

	public static void main(String[] args) 
	{
		new Archivo();
	}

	Archivo()
	{
		ventana = new JFrame("Archivo");
		ventana.setBounds(100,100,300,300);
		ventana.setLayout(null);

		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		lbl_nombre = new JLabel("Nombre");
		lbl_nombre.setBounds(20,20,80,20);
		ventana.add(lbl_nombre);

		tf_nombre = new JTextField();
		tf_nombre.setBounds(105,20,80,20);
		ventana.add(tf_nombre);

		lbl_apellido = new JLabel("Apellido");
		lbl_apellido.setBounds(20,45,80,20);
		ventana.add(lbl_apellido);

		tf_apellido = new JTextField();
		tf_apellido.setBounds(105,45,80,20);
		ventana.add(tf_apellido);

		btn_grabar = new JButton("Grabar");
		btn_grabar.setBounds(20,70,80,20);
		btn_grabar.addActionListener(this);
		ventana.add(btn_grabar);

		btn_leer = new JButton("Leer");
		btn_leer.setBounds(105,70,80,20);
		btn_leer.addActionListener(this);
		ventana.add(btn_leer);


		ventana.setVisible(true); 
	}

	public void	actionPerformed(ActionEvent e)
	{
		if (e.getSource()==btn_grabar)
		    grabar();
		if (e.getSource()==btn_leer)
			leer();
	}

	public void grabar()
	{
		FileWriter fw;
		try
		{
			/*fw = new FileWriter("cliente.txt",true); ESTO ES PARA INGRESE TODOS LOS NOMBRES INGRESADOS*/
			fw = new FileWriter("cliente.txt",false);
			fw.write(tf_nombre.getText()+"\r\n");
			fw.write(tf_apellido.getText()+"\r\n");
			fw.close();
		}
		catch(Exception e)
		{
			System.out.println("Error al grabar "+e.toString());
		}
	}

	piblic void leer()
	{
		try
		{
			File f = new File("cliente.txt");
			Scanner sc;
			String nombre, apellido;
			sc = new Scanner(f);

			while(sc.hasNextLine())
			{
				nombre = sc.NextLine();
			}
		}
		
		catch()
		{

		}
	}
}