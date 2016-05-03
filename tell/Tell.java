package us.iptaylor.tell;

import java.util.ArrayList;
import java.util.HashMap;

import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;

public class Tell {

	String[] args;
	EntityPlayer player;
	String method;
	
	private HashMap<String, Object> theList = new HashMap<String, Object>();
	private ArrayList<String> commands = new ArrayList<String>();
	
	public Tell(EntityPlayer player){
		theList.put("self", player);
		theList.put("set", new SetFactory());
		theList.put("time", new Time());
		theList.put("y", new Y(player));
		theList.put("xplevel", new XPLevel(player));
		theList.put("kill", new Kill(player));
		theList.put("do", new DoFactory());
		
		commands.add("set");
	}
	
	public void dispatch(String[] args){
		
		System.out.println("dispatching command");
		
		boolean cmdGiven = commands.contains(args[0]);
		
		if(args[0].equals("set")){
			((SetFactory) theList.get("set")).make(
					(Thing)theList.get(args[1]), 
					new Number(2 < args.length ? Integer.parseInt(args[2]) : 0)
			)
			.go();
		}else if(args[0].equals("do")){
			((DoFactory) theList.get("do")).make(
					(Thing)theList.get(args[1])
			)
			.go();
		}else{
			((SetFactory) theList.get("set")).make(
					(Thing)theList.get(args[0]), 
					new Number(1 < args.length ? Integer.parseInt(args[1]) : 0)
			)
			.go();
		}
	}
	
}
