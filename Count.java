import java. util.Scanner;
public class student {
public static void main(String[] args)
{
int count=0,num=1234;

	while(num!=0)
	{
		num=num/10;
		
		count++;
	}
	System.out.print("number of digits;" + count);
}
}
