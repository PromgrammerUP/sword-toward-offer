package swordTowardOffer;

import java.util.Stack;

public class PrintListReverse {
	public class ListNode {
		public int data;
		public ListNode next;
	}
	public static void main(String[] args) {
		PrintListReverse test = new PrintListReverse();
		ListNode node1 = test.new ListNode();
		ListNode node2 = test.new ListNode();
		ListNode node3 = test.new ListNode();
		node1.next = node2;
		node2.next = node3;
		node3.next = null;
		node1.data = 3;
		node2.data= 5;
		node3.data = 10;
		test.printListReverseIteratively(node1);
		test.printListReverseRecursively(node1);
	}
	public void printListReverseIteratively(ListNode headNode){
		Stack<ListNode> stack = new Stack<>();
		while(headNode!=null){
			stack.push(headNode);
			headNode = headNode.next;
		}
		while(!stack.isEmpty()){
			System.out.println(stack.pop().data);
		}
		
}
public void printListReverseRecursively(ListNode headNode){
	if(headNode !=null){
		if(headNode.next!=null){
			printListReverseIteratively(headNode.next);
		}
	}
	System.out.println(headNode.data);
}
}