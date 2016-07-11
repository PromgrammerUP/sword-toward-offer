package swordTowardOffer;

public class Print1ToMaxofDigits {
	public static void main(String[] args) {
		Print1ToMaxofDigits test = new Print1ToMaxofDigits();
		test.printToMaxofDigits(2);
	}
	public void printToMaxofDigits(int n){
		int [] array = new int[n];
		if(n<0){
			return;
		}
		printArray(array, 0);
	}
	public void printArray(int [] array,int index){
		for(int i=0;i<10;i++){
			if(index!=array.length){
				array[index] = i;
				printArray(array, index+1);
			}else{
				boolean isFirstNo0 = false;
				for(int j=0;j<array.length;j++){
					if(array[j]!=0){
						System.out.print(array[j]);
						if(!isFirstNo0){
							isFirstNo0=true;
						}
					}else{
						if(isFirstNo0){
							System.out.print(array[i]);
						}
					}
				}
				System.out.println();
				return;
			}
		}
	}
}
