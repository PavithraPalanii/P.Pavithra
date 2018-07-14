import java. util.Scanner;
public class student {
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int b=0;
	int fact=1;
	
	while(n!=0)
	{
		b=n%10;
		n=n/10;
		fact=fact*b;
	}
	
	System.out.println(fact);
	
		}  
}		
