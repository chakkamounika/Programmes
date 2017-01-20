package order;
import java.util.Scanner;

class Ascendingorder {
  public static void main(String []args) {
    int n, i, j, temp;
    Scanner ao = new Scanner(System.in);
 
    System.out.println("Enter n integers");
    n = ao.nextInt();
 
    int a[] = new int[n];
 
    System.out.println("Enter the integers: ");
    for (i = 0;i<n; i++) 
    	
      a[i] = ao.nextInt();
 
    for(i = 0; i<n- 1;i++) 
    {
    for (j = 0;j<n -i-1;j++) {
        if (a[j] > a[j+1]) 
        {
           temp = a[j];
           a[j] = a[j+1];
           a[j+1] = temp;
        }
      }
    }
 
    System.out.println("ascending order is");
 
    for (i=0;i<n; i++) 
    	
      System.out.println(a[i]);
  }
}