package TestPackage;

public class Democondition6 {

	public static void main(String[] args) {
		int a=5;
		int b=17;
		int c=9;
		int d=45;
		if((a>b)&&(a>c)&&(a>d))
		{
			System.out.println(a);
		}
		else
		{
			if((b>c)&&(b>d))
			{
				System.out.println(b);
				
			}
			
			else
			{
				if(c>d)
				{
					System.out.println(c);
				}
				else
				{
					System.out.println(d);
				}
			}
		}
	}

}
