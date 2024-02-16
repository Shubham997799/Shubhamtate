import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Arith extends JFrame 
{
			JLabel l1,l2,l3;
			JTextField t1,t2,t3;
			JButton b1,b2;
			
			Arith()
			{
					Font f = new Font("verdana",Font.BOLD,24);
					l1 = new JLabel("No1 : ");	
					l2 = new JLabel("No2 : ");
					l3 = new JLabel("Ans : ");
					t1 = new JTextField(20);
					t2 = new JTextField(20);
					t3 = new JTextField(20);
					b1 = new JButton("Add");
					b2 = new JButton("Mul");
					

					l1.setFont(f);
					l2.setFont(f);
					l3.setFont(f);
					t1.setFont(f);
					t2.setFont(f);
					t3.setFont(f);
					b1.setFont(f);
					b2.setFont(f);
					
					setLayout(new GridLayout(4,2));
					add(l1);
					add(t1);
					add(l2);
					add(t2);
					add(l3);
					add(t3);
					add(b1);
					add(b2);
				
					ActionListener addition = new 	ActionListener()
					{
							public void actionPerformed(ActionEvent e)
							{
										int a,b,c;
										a = 	Integer.parseInt(t1.getText());		
										b = 	Integer.parseInt(t2.getText());		
										c = a+b;
										t3.setText(c+"");
							}	
					};			
					
					ActionListener multiply = new 	ActionListener()
					{
							public void actionPerformed(ActionEvent e)
							{
										int a,b,c;
										a = 	Integer.parseInt(t1.getText());		
										b = 	Integer.parseInt(t2.getText());		
										c = a*b;
										t3.setText(c+"");					
							}
					};	
			
					b1.addActionListener(addition);
					b2.addActionListener(multiply);
					
			}
		
			public static void main(String ar[])
			{
					Arith  x  =  new Arith();
					x.setVisible(true);
					x.setSize(400,400);
					
			}		
}	