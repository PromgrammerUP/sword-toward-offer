package swordTowardOffer;

public class ReorderOddEven {
	public static void main(String[] args) {
		ReorderOddEven test = new ReorderOddEven();
		int [] array = {1,2,3,4,5};
		test.reoder(array);
		for(int i:array){
			System.out.print(i);
		}
	}
	public void reoder(int [] array){
		if(array==null||array.length==0){
			return;
		}
		int pre = 0; 
		int end = array.length-1;
		while(pre<end){
			while(pre<end && !isEven(array[pre])){
				pre++;
			}
			while(pre<end && isEven(array[end])){
				end--;
			}
			int temp = array[pre];
			array[pre] = array[end];
			array[end]  = temp;
		}
	}
	boolean isEven(int i){
		return ((i&1)==0);
	}
}
