package swordTowardOffer;

public class NumberOf1 {
	public int numberOf1(int n){
		int count = 0;
		while(n!=0){
			count++;
			n = (n-1)&n;
		}
		return count;
	}
	public static void main(String[] args) {
		NumberOf1 test = new NumberOf1();
		System.out.println(test.numberOf1(32));
	}
}
