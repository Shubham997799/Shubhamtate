import java.util.*;
class Student
{
		public static void main(String ar[])
		{
				int n,i;
				float max=0.0f;
				Scanner sc = new Scanner(System.in);
				String name=null;
				float per;
				HashMap<String ,Float> x = new HashMap<String ,Float>();
				System.out.println("enter n");
				n = sc.nextInt();
				
				for(i=1;i<=n;i++)
				{
						System.out.println("enter name and percentage");
						name = sc.next();
						per = sc.nextFloat();
						x.put(name,per);
				}	
			
				System.out.println(x);
				Set<String> s = x.keySet();
				for(String k :s)
				{
						float v = x.get(k);
						System.out.println(k+ " : " + v); 
				}

				System.out.println("Display student whose names ends with esh");

				for(String k:s)
				{
						float v = x.get(k);
						if(k.endsWith("esh"))
						{
								System.out.println(k+"  :  " + v);
						}
				}

				System.out.println("Display student whose percentage > 70");
				for(String k:s)
				{
						float v = x.get(k);
						if(v>70)
						{
								System.out.println(k+"  :  " + v);
						}
				}

				int flag = 0;

				for(String k : s)
				{
						float v = x.get(k);
						if(flag == 0)
						{
								name = k;
								max = v;
								flag = 1;
						}
						else
						{
								if(max < v)
								{
										name = k;
										max = v;
								}
						}
					
				}
			
				System.out.println("Max Percentage Student");
				System.out.println(name + "   "+ max);
		}
}