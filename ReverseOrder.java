import java.util.Scanner;

public class ReverseOrder {
	public static void main(String args[]) {
		Scanner scan =new Scanner(System.in);
		int sum=0;
		System.out.print("The given number=");
		int num=scan.nextInt();
		int temp =num;
		scan.close();
		while(temp !=0) {
			int	digit =temp%10;
			sum=(sum*10)+digit;
			temp=temp/10;
		}
		System.out.printf("The reverse of %d is"+" "+sum,num);
	}
	

}
