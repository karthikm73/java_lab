package javalab;
import java.util.*;

public class lexico {

	public static void main(String[] args) {
		/*to accept 5 strings from user and print them in lexicographical order*/
		Scanner sc= new Scanner(System.in);
		String[] ls = new String[5];
		System.out.println("Enter 5 strings: ");
		ls[0]=sc.next();	
		ls[1]=sc.next();
		ls[2]=sc.next();
		ls[3]=sc.next();
		ls[4]=sc.next();
		int i;
		System.out.println("Order of input: ");
		for(i=0;i<5;i++)
		{
			System.out.print(ls[i]+ ", ");
		}
		System.out.println();
		Arrays.sort(ls);
		System.out.println("Lexico order: ");
		for(i=0;i<5;i++)
		{
			System.out.print(ls[i]+ ", ");
		}
	}

}
