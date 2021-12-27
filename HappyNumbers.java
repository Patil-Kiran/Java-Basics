
public class HappyNumbers {

	public static void main(String[] args) {
				HappyNumbers h1 = new HappyNumbers();
				boolean ans =h1.isHappy(130);
				h1.isHappy(1303);
				System.out.println(ans);
	}
    public boolean isHappy(int n) {
        int result = sumOfSquares(n);
        System.out.println("sum"+result);
        int data =0;
        while(result/10>0){
            result = data+sumOfSquares(result);
        }
        if(result%10==1 || result%10==7){
        	return true;
        }

        
        return false;
    }
    
    public int sumOfSquares(int num){
        int temp = num;
        int sum =0;
        while(temp>0){
            sum +=(temp%10)*(temp%10);
            temp = temp/10;
        }
        return sum;
    }

}
