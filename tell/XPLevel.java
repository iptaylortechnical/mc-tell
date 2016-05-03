package us.iptaylor.tell;

import net.minecraft.entity.player.EntityPlayer;

public class XPLevel implements Thing{

	EntityPlayer player;
	
	public XPLevel(EntityPlayer player){
		this.player = player;
	}
	
	@Override
	public void set(To to) {
		player.addExperienceLevel(to.getInt());
	}

	@Override
	public void Do() {
		// TODO Auto-generated method stub
		
	}

}
