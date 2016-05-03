package us.iptaylor.tell;

public class Do implements Instruction {
	
	Thing thing;
	
	public Do(Thing thing){
		this.thing = thing;
	}
	
	@Override
	public void go() {
		thing.Do();
	}

}
