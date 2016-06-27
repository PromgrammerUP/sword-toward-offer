package swordTowardOffer;

import java.util.Arrays;

public class ReconstructBinaryTree {
	public static void main(String[] args) {
		ReconstructBinaryTree test = new ReconstructBinaryTree();
		int[] preSort={1,2,4,7,3,5,6,8};
		int[] inSort={4,7,2,1,5,3,8,6};
		BinaryTreeNode root = test.constructCore(preSort, inSort);
	}
	public BinaryTreeNode constructCore(int[] preOrder,int[] inOrder){
		if(preOrder==null||inOrder ==null){
			return null;
		}
		if(preOrder.length!=inOrder.length){
			System.out.println("输入的两个序列长度不合法");
		}
		BinaryTreeNode root = new BinaryTreeNode();
		for(int i=0;i<inOrder.length;i++){
			if(inOrder[i]==preOrder[0]){
				root.value = inOrder[i];
				System.out.println(root.value);
				root.leftNode = constructCore(Arrays.copyOfRange(preOrder, 1,i+1), Arrays.copyOfRange(inOrder, 0, i));
				root.rightNode = constructCore(Arrays.copyOfRange(preOrder, i+1, preOrder.length), Arrays.copyOfRange(inOrder, i+1, inOrder.length));
			}
		}
		return root;
	}
}
