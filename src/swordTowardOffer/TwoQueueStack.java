package swordTowardOffer;

import java.util.ArrayList;
import java.util.Queue;

public class TwoQueueStack {
	ArrayList<Object> queue1 = new ArrayList<>();
	ArrayList<Object> queue2 = new ArrayList<>();
	public void enqueue(Object obj) throws Exception{
		if(queue1.isEmpty()&queue2.isEmpty()){
			queue1.add(obj);
		}else if(!queue1.isEmpty()&queue2.isEmpty()){
			queue1.add(obj);
		}else if(!queue2.isEmpty()&queue1.isEmpty()){
			queue2.add(obj);
		}else {
			throw new Exception("∂”¡–¥ÌŒÛ");
		}
	}
	public Object dequeue(){
		if(!queue1.isEmpty()&queue2.isEmpty()){
			int count = queue1.size();
			for(int i=0;i<count-1;i++){
				Object o = queue1.remove(0);
				queue2.add(o);
			}
			return queue1.remove(0);
		}else if(!queue2.isEmpty()&queue1.isEmpty()){
			int count = queue2.size();
			for(int i=0;i<count-1;i++){
				Object o = queue2.remove(0);
				queue1.add(o);
			}
			return queue2.remove(0);
		}else {
			return null;
		}
	}
	public static void main(String[] args) throws Exception {
		TwoQueueStack test = new TwoQueueStack();
		test.enqueue("1");
		test.enqueue("2");
		test.enqueue("3");
		for(int i=0;i<2;i++){
			Object s = test.dequeue();
			System.out.println(s);
		}
		test.enqueue("4");
		for(int i=0;i<2;i++){
			Object s = test.dequeue();
			System.out.println(s);
		}
	}
	
}
