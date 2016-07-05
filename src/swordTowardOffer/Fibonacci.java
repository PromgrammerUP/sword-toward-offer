package swordTowardOffer;

public class Fibonacci {
	public static void main(String[] args) {
		Fibonacci test = new Fibonacci();
		System.out.println(test.fibN(10));
	}
	public long fibRecursive(int n){
		if(n==0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		
		return fibRecursive(n-1)+fibRecursive(n-2);
		
	}
	public long fibN(int n){//时间复杂度为n的算法
		int [] result={0,1};
		if(n<2){
			return result[n];
		}
		int fibOne = 0;
		int fibTwo = 1;
		int fibN=0;
		for (int i = 2; i <=n; i++) {
			fibN = fibOne+ fibTwo;
			fibOne = fibTwo;
			fibTwo = fibN;
		}
		return fibN;
	}
}
