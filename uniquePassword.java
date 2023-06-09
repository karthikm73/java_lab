import java.util.Scanner;

public class uniquePassword {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    String pw=new String();
		int rem,sum=0;
		System.out.println("Enter the name: ");
		String name=s.next();
		System.out.println("Enter room no.: ");
		int rno=s.nextInt();
		int rno1=rno;
		System.out.println("Enter phone num: ");
		long ph=s.nextLong();
		char [] symb= {')','!','@','#','$','%','^', '&', '*','('};
		do
		{
			while(rno!=0)
			{
				rem=rno%10;
				sum=sum+rem;
				rno=rno/10;
			}
			if(sum>=10)
			{
				rno=sum;
				sum=0;
			}
		}
		while(rno!=0);
		int c=rno1/100;
		int len=name.length();
		int pos=0;
		for(int i=0;i<=len;i++)
		{
			if(c==i)
			{
				pos=i;
				System.out.println("Password is: ");
			}
		}
		pw=""+name.charAt(0)+(ph%10)+sum+symb[c]+name.charAt(len-1);
		System.out.println(pw);
	}

}
