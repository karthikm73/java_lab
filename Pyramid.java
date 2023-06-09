	import java.util.Scanner;
	public class pyramid {
		public static void main(String[] args)
		{
			Scanner in=new Scanner(System.in);
			System.out.println("enter the number of levels for the number pyramid :");
			int levels=in.nextInt();
			for(int row=1;row<levels+1;row++)
			{
				for(int space=row;space<levels;space++)
				{
					System.out.print(" ");
				}
				for(int col=row;col<=2*row-1;col++)
				{
					System.out.print(col+"");
				}
				for(int k=2*row-2;k>=row;k--)
				{
					System.out.print(k+"");
				}
				System.out.println();
			}
			
		}
	}
