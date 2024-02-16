package javaOne;
import java.awt.*;
import java.awt.event.*;

public class MaxMin {

	
		{
			Label l1,l2,l3;
			TextField t1,t2,t3;
			Button b1,b2;

			MaxMin();
			{
					Font f = new Font("verdana",Font.BOLD,26);
					l1 = new Label("No1  :   ");
					
					l2 = new Label("No2  :   ");
					l3 = new Label("Ans  :   ");
					t1 = new TextField(20);
					t2 = new TextField(20);
					t3 = new TextField(20);
					b1 = new Button("Max");
					b2 = new Button("Min");
					setLayout(new FlowLayout());
					l1.setFont(f);
					l2.setFont(f);
					l3.setFont(f);
					t1.setFont(f);
					t2.setFont(f);
					t3.setFont(f);
					b1.setFont(f);
					b2.setFont(f);
					add(l1);
					add(t1);
					add(l2);
					add(t2);
					add(l3);
					add(t3);

					add(b1);
					add(b2);
					b1.setBackground(Color.blue);
					ActionListener max = new ActionListener()
					{
							public void actionPerformed(ActionEvent e)
							{
									int a,b;
									a = Integer.parseInt(t1.getText());
									b = Integer.parseInt(t2.getText());
									if(a>b)
									{
											t3.setText(a+"");			
									}
									else
									{
											t3.setText(b+"");	
									}
							}
					};
					ActionListener min = new ActionListener()
					{
							public void actionPerformed(ActionEvent e)
							{
									int a,b;
									a = Integer.parseInt(t1.getText());
									b = Integer.parseInt(t2.getText());
									if(a<b)
									{
											t3.setText(a+"");			
									}
									else
									{
											t3.setText(b+"");	
									}
							}
					};
					b1.addActionListener(max);
					b2.addActionListener(min);
			
		}

			
	
}
public static void main(String[] args) {
	
	MaxMin x = new MaxMin();
	x.setVisible(true);
	x.setBackground(Color.red);
	x.setSize(400,400);
}
}
			
			
			






			
			
		

