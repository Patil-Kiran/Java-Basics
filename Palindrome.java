import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	int num ;
	int sum=0;
	num=scan.nextInt();
	int temp =num;
	scan.close();
	
	while(temp !=0) {
		int digit =temp%10;
		sum=(sum*10)+digit;
		temp=temp/10;
		}
	if(sum==num) {
	System.out.printf("The number %d is Palindrome",num);
	}
	else {
		System.out.printf("The number %d is not Palindrome",num);
	}
		
	}

}
