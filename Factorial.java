/*
 * Find The Factorial of given number
 */

import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int fact=1;
		if (num==0) {
		System.out.println("The factorial of 0 =1");
		}
		else {
			for(int i=num; i>=1; i--){
				
				fact=fact*i;
			}
		System.out.printf("\nThe factorial of %d = " +fact,num);
		}
	}
	

}
