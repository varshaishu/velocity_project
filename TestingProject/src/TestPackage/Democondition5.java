package TestPackage;

public class Democondition5 {
	public static void main(String[] args) {
		int a=30;
		int b=45;
		int c=20;
		int d=60;
		
		System.out.println("start");
		if(a<b)
		{
			if(a<c) 
			{
				System.out.println("a is grater" );
			}
			else
			{
				if(b<c) 
				{
					System.out.println("c is greater" +c);
				}
				else
				{
					if(b<d)
					{
						System.out.println("d is graeter" +d);
					} 
					else
					{
						System.out.println("b is graeter" +b);
					}
				}
			}
				
		}
	}

}
