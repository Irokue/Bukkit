package org.bukkit.event.player;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

public class PlayerGuildeAskEvent extends PlayerEvent {

	private static final HandlerList handlers = new HandlerList();
	
	public PlayerGuildeAskEvent(String guilde, String guildeRank, Player who) {
		super(who);
		this.guildeName = guilde;
		this.guildeRank = guildeRank;
	}

	public static HandlerList getHandlerList(){
		return handlers;
	}
	
	public String getGuildeRank(){
		return guildeRank;
	}
	
	public void setGuideRank(String guildeRank){
		this.guildeRank = guildeRank;
	}
	
	public static void setGuildeName(String guilde){
		guildeName = guilde;
	}
	
	public void setGuilde(String guilde){
		this.guildeName = guilde;
	}
	
	public String getGuilde(){
		return guildeName;
	}
	
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
	
	private static String guildeName;
	private String guildeRank;

}
