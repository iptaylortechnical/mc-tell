package us.iptaylor.tell;

public class Number implements To {

	int val;
	
	public Number(int val){
		this.val = val;
	}
	
	public Object get(){
		return val;
	}
	
	public int getInt(){
		return val;
	}
}
