import java.util.Scanner;
/*
 14. Write a program to display the first n terms of Fibonacci series. 

Fibonacci series 0 1 2 3 5 8 13 .....
Test Data :
Input number of terms to display : 10
Expected Output :
Here is the Fibonacci series upto to 10 terms :
0 1 1 2 3 5 8 13 21 34

 */

public class Fibonnaci {
	public static void main(String args[]) {
		Scanner scan =new Scanner(System.in);
		int num=scan.nextInt();
		int sum=0;
		int n1 =0;
		int n2=1;
		int n3;
		System.out.print(n1+" "+n2);
		for(int i=2;i<=num;i++) {
			n3=n1+n2;
			
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		
	}
}
