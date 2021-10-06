import java.util.Scanner;
public class StrongNumber {

	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	int num;
	num=scan.nextInt();
	int Fact_Sum=0;
	int temp =num;
	while(temp !=0) {
		int digit = temp %10;
		Fact_Sum=Fact_Sum+fact(digit);
		temp =temp/10;
		}
	if (Fact_Sum==num) {
		System.out.printf("The %d is Strong Number",num);
	}
	else {
		System.out.printf("The %d is not Strong Number",num);
	}
	}
	static int fact(int num) {
		int fact=1;
		for(int i=1; i<=num; i++) {
			fact=fact*i;
		}
	 return fact;
	}
}
