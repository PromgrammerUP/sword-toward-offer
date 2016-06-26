package swordTowardOffer;

public class ReplaceBlank {
	public static void main(String[] args) {
		String str = new ReplaceBlank().replaceBlank("we are happy!");
		System.out.println(str);
	}
  public String replaceBlank(String str){
	  if(str==null){
		  return null;
	  }
	  StringBuffer buffer = new StringBuffer();
	  for(int i=0;i<str.length();i++){
		  if(str.charAt(i)==' '){
			  buffer.append("%");
			  buffer.append("2");
			  buffer.append("0");
		  }else {
			  buffer.append(String.valueOf(str.charAt(i)));
		  }
	  }
	  return new String(buffer);
  }
}

