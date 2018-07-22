import java.util.Scanner;
public class Minimum {
public static void main(String[] args) {
	int n, temp;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter no. of elements you want in array:");
    n = s.nextInt();
    int b[] = new int[n];
    System.out.println("Enter all the elements:");
    for (int i = 0; i < n; i++) 
    {
        b[i] = s.nextInt();
    }
    for (int i = 0; i < n; i++) 
    {
        for (int j = i + 1; j < n; j++) 
        {
            if (b[i] >b[j]) 
            {
                temp = b[i];
                b[i] = b[j];
                b[j] = temp;
            }
        }
    }
    System.out.print("ascending Order:");
    for (int i = 0; i < n-1; i++) 
    {
        System.out.print(b[i] + ",");
    }
    System.out.println(b[n - 1]);
    System.out.println(b[n/2]);
}
}
