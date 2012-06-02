package org.bukkit.event.player;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

public class PlayerJobAskEvent extends PlayerEvent {

	private static final HandlerList handlers = new HandlerList();
	
	public PlayerJobAskEvent(String job, int jobLevel, int jobExperience, int jobMaxExperience, Player who) {
		super(who);
		this.job = job;
		this.jobLevel = jobLevel;
		this.jobExperience = jobExperience;
		this.jobMaxExperience = jobMaxExperience;
	}

	public static HandlerList getHandlerList(){
		return handlers;
	}
	
	public int getJobLevel(){
		return this.jobLevel;
	}
	public int getJobExperience(){
		return this.jobExperience;
	}
	public int getJobMaxExperience(){
		return this.jobMaxExperience;
	}
	
	public void setJobLevel(int jobLevel){
		this.jobLevel = jobLevel;
	}
	public void setJobExperience(int jobExperience){
		this.jobExperience = jobExperience;
	}
	public void setJobMaxExperience(int jobMaxExperience){
		this.jobMaxExperience = jobMaxExperience;
	}
	
	public void setJob(String job){
		this.job = job;
	}
	public String getJob(){
		return job;
	}
	
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
	
	private String job;
	private int jobLevel;
	private int jobExperience;
	private int jobMaxExperience;

}
