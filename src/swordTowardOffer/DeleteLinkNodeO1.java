package swordTowardOffer;

public class DeleteLinkNodeO1 {
	public static void main(String[] args) {
		DeleteLinkNodeO1 test = new DeleteLinkNodeO1();
		LinkNode first = new LinkNode();
		LinkNode second = new LinkNode();
		LinkNode third = new LinkNode();
		first.value=1;
		second.value=2;
		third.value = 3;
		first.next = second;
		second.next = third;
		third.next = null;
		test.deleteNode(first, third);
		System.out.println(first.next.value);
	}
	
	public void deleteNode(LinkNode head,LinkNode deNode){
		if(deNode == null ||head==null){
			return;
		}
		if(deNode.next!=null){
			LinkNode temp = deNode.next;
			deNode.value  = temp.value;
			deNode.next = temp.next;
			temp = null;
		}
		else if(head == deNode){
			deNode =null;
			head =null;
		}else{
			LinkNode pointNode = head;
			while(pointNode.next!=deNode){
				pointNode = pointNode.next;
			}
			pointNode.next=null;
		}
	}
}
class LinkNode{
	int value;
	LinkNode next;
}