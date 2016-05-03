package us.iptaylor.tell;

public class Set implements Instruction {
	
	Thing thing;
	To to;
	
	public Set(Thing thing, To to){
		this.thing = thing;
		this.to = to;
	}

	public void go() {
		thing.set(to);
	}
}
