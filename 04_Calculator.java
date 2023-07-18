package javalab;

import java.util.*;
public class calc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op1,op2;
		char oper;
		System.out.println("enter one operand");
		op1=sc.nextInt();
		System.out.println("enter operator + - * or /");
		oper=sc.next().charAt(0);
		System.out.println("enter another operand");
			op2=sc.nextInt();
			int res=0;
			switch(oper)
			{
			case '+' : res= op1 + op2;
			break;
			case '-' : res= op1 - op2;
			break;
			case '*' : res= op1 * op2;
			break;
			case '/' : res= op1 / op2;
			break;
			default: System.out.println("invalid operator");
			System.exit(0);
			break;
			}
		System.out.println("result = "+ res);
		
	}

}
