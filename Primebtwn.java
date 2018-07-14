import java. util.Scanner;
public class student {
public static void main(String[] args)
{
	int a=0,i=0,p;
	String  a1 = "";
	for(a=1;a<=10;a++)
	{
	p=0;

				for(i=a; i>=1; i--)
				{
					if(a%i==0)
				    {
					p++;
					}
				}
				if(p==2)
				  {
					a1= a1 +a + " ";
				  }
			}
	
      System.out.println("primeNumbers");
      System.out.println(a1);  

	}

}
