import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

 class Arith3 extends JFrame{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4;
    JButton b1,b2,b3;

    Arith()
    {
        Font f = new Font("verdana",Font.BOLD,24);
					l1 = new JLabel("No1 : ");	
					l2 = new JLabel("No2 : ");
					l3 = new JLabel("No3 : ");
                    l4= new JLabel("Ans : ");
					t1 = new JTextField(20);
					t2 = new JTextField(20);
					t3 = new JTextField(20);
                    t3 = new JTextField(30);
					b1 = new JButton("Add");
					b2 = new JButton("Mul");
                    b2 = new JButton("Avg");

					

					l1.setFont(f);
					l2.setFont(f);
					l3.setFont(f);
                    l4.setFont(f);
					t1.setFont(f);
					t2.setFont(f);
					t3.setFont(f);
                    t4.setFont(f);
					b1.setFont(f);
					b2.setFont(f);
                    b3.setFont(f);
					
					setLayout(new GridLayout(5,3));
					add(l1);
					add(t1);
					add(l2);
					add(t2);
					add(l3);
					add(t3);
                    add(l4);
					add(t4);
					add(b1);
					add(b2);
                    add(b3);
				
					ActionListener addition = new 	ActionListener()
					{
							public void actionPerformed(ActionEvent e)
							{
										int a,b,c,d;
										a = 	Integer.parseInt(t1.getText());		
										b = 	Integer.parseInt(t2.getText());	
                                        c = 	Integer.parseInt(t3.getText());	
										d = a+b+c;
										t4.setText(d+"");
							}	
					};			
					
					ActionListener multiply = new 	ActionListener()
					{
							public void actionPerformed(ActionEvent e)
							{
										int a,b,c,d;
										a = 	Integer.parseInt(t1.getText());		
										b = 	Integer.parseInt(t2.getText());		
                                        c = 	Integer.parseInt(t3.getText());	
										d = a*b*c;
										t4.setText(d+"");					
							}
					};	

                    ActionListener Average = new 	ActionListener()
					{
							public void actionPerformed(ActionEvent e)
							{
										int a,b,c,d;
										a = 	Integer.parseInt(t1.getText());		
										b = 	Integer.parseInt(t2.getText());		
                                        c = 	Integer.parseInt(t3.getText());	
										d =      (a+b+c)/3;
										t4.setText(d+"");					
							}
					};


					b1.addActionListener(addition);
					b2.addActionListener(multiply);
                    b3.addActionListener(Average);
					
    }

    public static void main(String ar[])
			{
					Arith  x  =  new Arith();
					x.setVisible(true);
					x.setSize(400,400);
					
			}	
    
}
