package us.iptaylor.tell;

public class SetFactory {
	
	public SetFactory(){
		
	}

	public static Set make(Thing thing, To to){
		return new Set(thing, to);
	}
}
