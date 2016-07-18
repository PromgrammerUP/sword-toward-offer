package swordTowardOffer;

public class Merge {
	public static void main(String[] args) {
		Merge test = new Merge();
		LinkNode one = new LinkNode();
		LinkNode two = new LinkNode();
		LinkNode three = new LinkNode();
		LinkNode four = new LinkNode();
		LinkNode five = new LinkNode();
		LinkNode six = new LinkNode();
		one.value=1;
		one.next = three;
		three.value=3;
		three.next = five;
		five.next=null;
		five.value = 5;
		two.value = 2;
		two.next = four;
		four.value = 4;
		four.next = six;
		six.value=6;
		six.next = null;
		LinkNode nvl = null;
		LinkNode mergelink = test.merge(one, two);
		while(mergelink!=null){
			System.out.print(mergelink.value);
			System.out.print(" ");
			mergelink= mergelink.next;
		}
	}
	public LinkNode merge(LinkNode linkone,LinkNode linktwo){
		if(linkone==null){
			return linktwo;
		}
		if(linktwo==null){
			return linkone;
		}
		LinkNode mergeHead = null;
		if(linkone.value<linktwo.value){
			mergeHead = linkone;
			mergeHead.next = merge(linkone.next,linktwo);
		}else if(linktwo.value < linkone.value){
			mergeHead = linktwo;
			mergeHead.next = merge(linkone,linktwo.next);
		}
		return mergeHead;
	}
}
