class PrimeExample
{
		public static void main(String arp[])
		{
				int no=2,c = 0,i,flag;

				while(c<=50)
				{
						flag = 0;
						for(i=2;i<no;i++)
						{
								if(no%i  == 0)
								{
										flag = 1;
										break;
								}
			
						}
						if(flag == 0)
						{
								System.out.print(no+ "     " );
								c++;
						}

						no++;
				}
		}
}