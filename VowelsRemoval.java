package NewPrgms;

import java.util.Scanner;

public class VowelsRemoval 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str1=sc.next();
		StringBuffer st1=new StringBuffer(str1);
		StringBuffer st2=st1.reverse();
		String str2=st2.toString();
		char rep=' ';
		String res=" ";
		for(int i=0;i<str2.length();i++)
		{
			rep=str2.charAt(i);
			if( (rep=='a') || (rep=='e') || (rep=='i') || (rep=='o') || (rep=='u'))
			{
				rep=' ';
			}
			res=res+rep;
				
		}
		String ans[]=res.split(" ");
		String str3="";
		for(int i=0;i<ans.length;i++)
		{
		str3=str3+ans[i];
		}
		System.out.println(str3);
		
		sc.close();
	}

}
