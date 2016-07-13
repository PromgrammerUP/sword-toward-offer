package swordTowardOffer;

public class PrintKthToTail {
	public static void main(String[] args) {
		PrintKthToTail test = new PrintKthToTail();
		LinkNode head = new LinkNode();
		for(int i=1;i<=10;i++){
			LinkNode l = new LinkNode();
			l.value=i;
			l.next = head.next;
			head.next = l;
		}
		LinkNode kth = test.printKthTotail(head, 0);
		System.out.println(kth.value);
	}
	public LinkNode printKthTotail(LinkNode head,int k){
		if(head==null || k==0){
			return null;
		}
		LinkNode front = head;
		LinkNode back = null;
		for(int i=0;i<k-1;i++){
			if(front.next!=null){
				front = front.next;
			}else{				//链表中的节点数小于k个
				return null;
			}
		}
		back = head;
		while(front.next!=null){
			front = front.next;
			back = back.next;
		}
		return back;
	}
}
