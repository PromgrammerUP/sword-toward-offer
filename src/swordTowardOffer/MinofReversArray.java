package swordTowardOffer;

public class MinofReversArray {
	public static void main(String[] args) throws Exception {
		MinofReversArray test = new MinofReversArray();
		int [] a1 = {3,4,5,1,2};
		int [] a2= {1,0,1,1};
		int [] a3 = {1,1,1,0,1};
		System.out.println(test.min(a3));
	}
	public int min(int[] numbers) throws Exception{
		if(numbers==null){
			throw new Exception("ÊäÈë²ÎÊı´íÎó");
		}
		int index1 = 0;
		int index2 = numbers.length-1;
		int mid = index1;
		while(numbers[index1]>=numbers[index2]){
			if(index2-index1==1){
				mid = index2;
				break;
			}
			mid = (index1+index2)/2;
			if(numbers[index1]==numbers[index2]&&numbers[index1]==numbers[mid]){
				return minInorder(numbers,index1,index2);
			}else if(numbers[index1]<=numbers[mid]){
				index1 = mid;
			}else if(numbers[index2]>=numbers[mid]){
				index2 = mid;
			}
			
		}
		return numbers[mid];
		
	}
	public int minInorder(int [] numbers,int index1,int index2){
		int result=numbers[index1];
		for(int i = index1+1;i<=index2;i++){
			if(result>numbers[i]){
				result = numbers[i];
			}
		}
		return result;
	}
}
