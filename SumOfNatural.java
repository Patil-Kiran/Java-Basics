import java.util.Scanner;

public class SumOfNatural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int num=10;
		int sum =0;
		//num=scan.nextInt();
		for(int i=0;i<=num; i++) {
			sum=sum+i;
			
		}
		System.out.printf("The sum of first %d natural numbers =" +sum,num);

	}

}
