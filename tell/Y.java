package us.iptaylor.tell;

import net.minecraft.entity.player.EntityPlayer;

public class Y implements Thing {

	EntityPlayer player;
	
	public Y(EntityPlayer player){
		this.player = player;
	}
	
	@Override
	public void set(To to) {
		System.out.println("Should move player up by " + to.getInt());
		
		player.setPosition(0, to.getInt(), 0);

	}

	@Override
	public void Do() {
		// TODO Auto-generated method stub
		
	}

}
