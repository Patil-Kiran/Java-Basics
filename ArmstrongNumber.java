import java.util.Scanner;


public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int Cube_sum=0;
		int num;
		System.out.print("The Given Number =");
		num=scan.nextInt();
        int temp=num;	
		
		while(temp !=0) {
			int digit=temp%10;
			Cube_sum=Cube_sum+ Cube(digit);
			temp=temp/10;
			}
		
		
		scan.close();
		if(num==Cube_sum) {
			System.out.printf("The %d is an Armstrong Number",num);
		}
		else {
			System.out.printf("The %d is not an Armstrong Number",num);
		}
		
	}
	static int Cube(int num ) {
		
	   int 	Cube =num*num*num;
		
	   return Cube;
	}
}