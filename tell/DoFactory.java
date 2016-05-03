package us.iptaylor.tell;

public class DoFactory {
	public static Do make(Thing thing){
		return new Do(thing);
	}
}
