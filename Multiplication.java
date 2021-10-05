import java.util.Scanner;

/*
 * Write a programme to print table of 5!
 */

public class Multiplication {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int num=scan.nextInt();
		for(int i=1; i<=10 ; i++ ) {
			System.out.printf("\n %d X %d ="+num*i,num,i);
		}

	}

}
