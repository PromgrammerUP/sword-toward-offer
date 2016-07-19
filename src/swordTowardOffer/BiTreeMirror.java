package swordTowardOffer;

import java.util.Stack;

public class BiTreeMirror {
	public static void main(String[] args) {
		BinaryTreeNode root1=new BinaryTreeNode();
		BinaryTreeNode node1=new BinaryTreeNode();
		BinaryTreeNode node2=new BinaryTreeNode();
		BinaryTreeNode node3=new BinaryTreeNode();
		BinaryTreeNode node4=new BinaryTreeNode();
		BinaryTreeNode node5=new BinaryTreeNode();
		BinaryTreeNode node6=new BinaryTreeNode();
		root1.leftNode=node1;
		root1.rightNode=node2;
		node1.leftNode=node3;
		node1.rightNode=node4;
		node4.leftNode=node5;
		node4.rightNode=node6;
		root1.value=8;
		node1.value=8;
		node2.value=7;
		node3.value=9;
		node4.value=2;
		node5.value=4;
		node6.value=7;
		BiTreeMirror test = new BiTreeMirror();
		test.printTree(root1);
		System.out.println();
		test.mirror(root1);
		test.printTree(root1);
	}
	public void printTree(BinaryTreeNode root){
		BinaryTreeNode p = root;
		if(p==null){
			return;
		}
		System.out.print(p.value+" ");
		if(p.leftNode!=null){
			
			printTree(p.leftNode);
		}
		if(p.rightNode!=null){
			
			printTree(p.rightNode);
		}
	}
	public void mirrorRecursively(BinaryTreeNode root){
		if(root==null||(root.leftNode==null&&root.rightNode==null)){
			return;
		}
		BinaryTreeNode temp = new BinaryTreeNode();
		temp = root.leftNode;
		root.leftNode = root.rightNode;
		root.rightNode = temp;
		if(root.leftNode!=null){
			mirrorRecursively(root.leftNode);
		}
		if(root.rightNode!=null){
			mirrorRecursively(root.rightNode);
		}
	}
	public void mirror(BinaryTreeNode root){
		if(root==null||(root.leftNode==null&&root.rightNode==null)){
			return;
		}
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		while(root!=null||!stack.isEmpty()){
			while(root!=null){
				BinaryTreeNode temp = new BinaryTreeNode();
				temp = root.leftNode;
				root.leftNode = root.rightNode;
				root.rightNode = temp;
				stack.push(root);
				root = root.leftNode;
			}
			root=stack.pop();
			root = root.rightNode;
		}
		
	}
}
