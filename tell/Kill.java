package us.iptaylor.tell;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;

public class Kill implements Thing {
	
	EntityPlayer player;
	
	public Kill(EntityPlayer player){
		this.player = player;
	}
	
	public void Do(){
		player.onKillCommand();
	}

	@Override
	public void set(To to) {
		// TODO Auto-generated method stub
		
	}

}
