package us.iptaylor.tell;

import net.minecraft.server.MinecraftServer;

public class Time implements Thing {
	
	public void set(To to) {
		System.out.println("setting time");
		int intval = to.getInt();
		
		setTime(intval);
	}
	
	/**
     * Set the time in the server object.
     */
    protected void setTime(int time)
    {
        for (int i = 0; i < MinecraftServer.getServer().worldServers.length; ++i)
        {
            MinecraftServer.getServer().worldServers[i].setWorldTime((long)time);
        }
    }

	@Override
	public void Do() {
		
	}

}
