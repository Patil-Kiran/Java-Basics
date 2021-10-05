import java.util.Scanner;
/*
 * 2. Write a java program to read 10 numbers from keyboard and find their  sum and average?
 */
public class SumAvgInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num=10;
		int sum=0;
		int n=0;
		double avg;
		
		for(int i=1;i<=num;i++) {
			n=scan.nextInt();
			sum=sum+n;
			
		}
		System.out.printf("\nThe sum of %d natural numbers= "+sum,num);
		avg = sum/10;
		System.out.printf("\nThe Average of %d natural numbers =" +avg,num);
	}

}
