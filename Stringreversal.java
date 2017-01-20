package string;

import java.util.Scanner;

public class Stringreversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original,reverse="";
		Scanner v=new Scanner(System.in);
		System.out.println("Enter the string");
		original=v.nextLine();
		int length=original.length();
		for(int i=length-1;i>=0;i--)
		reverse=reverse+original.charAt(i);
		System.out.println("reverse of string is "+ reverse);

	}

}
