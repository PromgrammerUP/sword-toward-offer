package swordTowardOffer;

import java.util.Stack;

public class TwoStackQueue {
	Stack stack1 =new Stack<>();
	Stack stack2 = new Stack<>();
	public void appendTail(Object obj){
		stack1.push(obj);
	}
	public Object deleteHead() throws Exception{
		if(stack2.isEmpty()){
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
		}
		if(stack2.isEmpty()){
			throw new Exception("╤сапн╙©у");
		}
		return stack2.pop();
	}
	public static void main(String[] args) throws Exception {
		TwoStackQueue test = new TwoStackQueue();
		test.appendTail("1");
		test.appendTail("2");
		test.appendTail("3");
		Object s = test.deleteHead();
		System.out.println(s);
		test.appendTail("s");
		Object s1 = test.deleteHead();
		test.deleteHead();
		Object s3 = test.deleteHead();
		System.out.println(s3);
		test.deleteHead();
	}
}
