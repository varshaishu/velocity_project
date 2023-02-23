package TestPackage;

public class Pattern2 {

	public static void main(String[] args) { 
		int line=10;
	for(int b=1; b<=line;b++)
	{
		for(int a=line-1; a>=b ; a--)
		{
			System.out.print(" ");
		}
		for(int a=1;a<=b;a++)
		{
			System.out.print("*");
		}
		for(int a=1;a<=5;a++)
		{
			System.out.print("   ");
			
		}
		for(int a=1;a<=b;a++)
		{
			System.out.print("*");
		}
		
		System.out.println(); 
	}

	for(int b=line-1; b>=1;b--)
	{
		for(int a=line-1; a>=b ; a--)
		{
			System.out.print(" ");
		}
		for(int a=1;a<=b;a++)
		{
			System.out.print("*");
			
		}
		for(int a=1;a<=5;a++)
		{
			System.out.print("   ");
			
		}
		for(int a=1;a<=b;a++)
		{
			System.out.print("*");
		}
		System.out.println();
	} 
		// TODO Auto-generated method stub

	}

}
