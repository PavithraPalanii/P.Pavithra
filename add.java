import java. util.Scanner;
public class student {
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int k=s.nextInt();
	int a[]=new int[n];
	int b=0;
	for(int i=0;i<n;i++)
	{
	a[i]=s.nextInt();	
}
	for(int i=0;i<k;i++)
	{
	b=b+a[i];
	}
	System.out.print(b);
	
}
}
