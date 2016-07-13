package swordTowardOffer;

public class ReverseLink {
	public static void main(String[] args) {
		ReverseLink test = new ReverseLink();
		LinkNode head = new LinkNode();
		for(int i=1;i<=10;i++){
			LinkNode l = new LinkNode();
			l.value=i;
			l.next = head.next;
			head.next = l;
		}
		LinkNode p = head;
		while(p!=null){
			System.out.print(p.value);
			System.out.print(" ");
			p= p.next;
		}
		System.out.println();
		LinkNode nulV = null;
		LinkNode reverse = test.reverseLink(nulV);
		while(reverse!=null){
			System.out.print(reverse.value);
			System.out.print(" ");
			reverse= reverse.next;
		}
	}
	public LinkNode reverseLink(LinkNode head){
		if(head==null){
			return null;
		}
		if(head.next==null){
			return head;
		}
		LinkNode reverseHead = null;
		LinkNode p = head;
		LinkNode pre = null;
		while(p!=null){
			LinkNode next = p.next;
			if(next==null){
				reverseHead = p;
			}
			p.next=pre;
			pre = p;
			p = next;
		}
		return reverseHead;
	}
}
