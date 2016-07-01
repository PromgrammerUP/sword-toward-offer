package swordTowardOffer;

public class QuickSort {
	public static void main(String[] args) {
		int [] n = {27,48,35,65,13,78,54,97};
		QuickSort q = new QuickSort();
		q.quickSort(n, 0, n.length-1);
	}
	public int partation(int [] n,int left,int right){
		int p = n[left];
		while(left<right){
			while(left<right&&n[right]>=p){
				right--;
			}
			if(left<right){
				n[left++]=n[right];
			}
			while(left<right&&n[left]<=p){
				left++;
			}
			if(left<right){
				n[right--]=n[left];
			}	
		}
		n[left] = p;
		System.out.println(p);
		for (int i : n) {
			System.out.print(i+",");
		}
		System.out.println();
		return left;
	}
	public void quickSort(int [] n,int left,int right){
		int dp ; 
		if(left<right){
			dp = partation(n, left, right);;
			quickSort(n,left,dp-1);
			quickSort(n,dp+1,right);
			
		}
		
	}
}
