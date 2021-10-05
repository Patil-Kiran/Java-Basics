import java.util.Scanner;
/*
 * The sum and average of 10 numbers given by user as input !!! using while loop!! 
 */

public class Que2_Whileloop {

	public static void main(String[] args) {
		Scanner scan = new  Scanner(System.in);
		int sum=0;
		int num=10;
		int n=0;
		double avg;
		int i=1;
		while(i<=num) {
			n=scan.nextInt();
			sum=sum+n;
			i++;
			}
		avg =sum/num;
		System.out.printf("\nThe sum of %d natural numbers ="+sum,num);
		System.out.printf("\nThe Average of %d natural numbers =" +avg,num);
	}

}
