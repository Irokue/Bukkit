package org.bukkit.event.player;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

public class PlayerQuestAskEvent extends PlayerEvent {

	private static final HandlerList handlers = new HandlerList();
	
	public PlayerQuestAskEvent(String questTitle, String questDesc, String questObjectives, String questRewards, Player who) {
		super(who);
		this.questTitle = questTitle;
		this.questDesc = questDesc;
		this.questObjectives = questObjectives;
		this.questRewards = questRewards;
	}
	
	public String getQuestTitle(){
		return this.questTitle;
	}
	public String getQuestDesc(){
		return this.questDesc;
	}
	public String getQuestObjectives(){
		return this.questObjectives;
	}
	public String getQuestRewards(){
		return this.questRewards;
	}
	
	public void setQuestTitle(String s){
		this.questTitle = s;
	}
	public void setQuestDesc(String s){
		this.questDesc = s;
	}
	public void setQuestObjectives(String s){
		this.questObjectives = s;
	}
	public void setQuestRewards(String s){
		this.questRewards = s;
	}

	public static HandlerList getHandlerList(){
		return handlers;
	}
	
	@Override
	public HandlerList getHandlers() {
		// TODO Auto-generated method stub
		return handlers;
	}
	
	private String questTitle;
	private String questDesc;
	private String questObjectives;
	private String questRewards;

}
