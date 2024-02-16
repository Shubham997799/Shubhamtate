import java.awt.*;
import java.awt.event.*;

class SalaryCalculationFocus extends Frame
{
		Label l1,l2,l3,l4,l5;
		TextField t1,t2,t3,t4,t5;
		
		SalaryCalculationFocus()
		{
				l1 = new Label("Basic");
				l2 = new Label("HRA");
				l3 = new Label("DA");
				l4 = new Label("Tax");
				l5 = new Label("Net Salary");
				t1 = new TextField();
				t2 = new TextField();
				t3 = new TextField();
				t4 = new TextField();
				t5 = new TextField();
				setLayout(new GridLayout(5,2));
				add(l1);
				add(t1);
				add(l2);
				add(t2);
				add(l3);
				add(t3);
				add(l4);
				add(t4);
				add(l5);
				add(t5);
				Font f = new Font("arial",Font.BOLD,24);
				l1.setFont(f);
				l2.setFont(f);
				l3.setFont(f);
				l4.setFont(f);
				l5.setFont(f);
				t1.setFont(f);
				t2.setFont(f);
				t3.setFont(f);
				t4.setFont(f);
				t5.setFont(f);
				FocusListener fa = new FocusListener()
				{
							public void  focusGained(FocusEvent e)
							{
							}
							public void  focusLost(FocusEvent e)
							{
									String s = t1.getText();	
									float basic,hra,da,tax,net;

									if(s.equals(""))
									{
											t2.setText("");
											t3.setText("");
											t4.setText("");
											t5.setText("");
									}
									else
									{
											basic = Float.parseFloat(s);
											hra = basic * 0.07f;
											da = basic * 0.05f;
											tax = basic * 0.03f;
											net = basic + hra + da - tax;
											t2.setText(hra+"");
											t3.setText(da+"");
											t4.setText(tax+"");
											t5.setText(net+"");
								}	
							}
				};
				
				t1.addFocusListener(fa);
		}
		
		public static void main(String ar[])
		{
				SalaryCalculationFocus x = new SalaryCalculationFocus();
				x.setVisible(true);
				x.setSize(400,400);
		}
}