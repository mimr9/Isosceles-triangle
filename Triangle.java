import java.util.Scanner;
public class Triangle
{
	static int num;
	static int s;
	static int y;
	public static void star()
	{
		System.out.print("*");
	}
	public static void space()
	{
		System.out.print(" ");
	}
	public static void in()
	{
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		s = num + (num - 1);
		y = (s/2) + 1;
	}
	public static void one () 
	{
		for (int i = 1; i <= s; i++)
		{
			if ( i == y)
			star();
			else 
			space();
		}
	}
	public static void end()
	{
		for (int i = 1; i <= s; i++)
			star();
	}
	public static void body()
	{
		for (int z = 1; z <= y-2; z++)
		{
			for (int b = 1; b <= s; b++)
			{
				if( b == y+z || b == y-z)
				{star();}
				else
				{space();}
			}
		System.out.print("\n");	
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Enter your number : ");
		in();
		one();
		System.out.print("\n");
		body();
		end();
		System.out.println(" ");
		System.out.println("Do you want that again?(y/n)");
		Scanner input = new Scanner(System.in);
		String dess = input.nextLine();
		if(dess.equals("y"))
		while(dess.equals("y"))
		{
		System.out.println("Enter your number : ");
                in();
                one();
                System.out.print("\n");
                body();
                end();
                System.out.println(" ");
		System.out.println("Do you want that again?(y/n)");
                dess = input.nextLine();

	} 
		System.out.println("Thank you!");

}
}
