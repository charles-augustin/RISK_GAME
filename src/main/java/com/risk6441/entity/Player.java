package com.risk6441.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.risk6441.config.PlayerStrategy;
import com.risk6441.strategy.IStrategy;

/**
 * @author Nirav
 * This class defines Player and its properties such as id, name, armies and number of territories owned by player
 */
public class Player implements Serializable{
	
	
	private int id;
	private String name;
	private int armies;
	private List<Territory> assignedTerritory;
	private List<Card> cardList;
	private int numeberOfCardsExchanged;
	
	/**
	 * Player's Strategy For the Behavior 
	 */
	private IStrategy strategy;
	
	private PlayerStrategy playerStrategy;
	
	
	/**
	 * @return the strategy
	 */
	public IStrategy getStrategy() {
		return strategy;
	}

	/**
	 * @param strategy the strategy to set
	 */
	public void setStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * @return the playerStrategy
	 */
	public PlayerStrategy getPlayerStrategy() {
		return playerStrategy;
	}

	/**
	 * @param playerStrategy the playerStrategy to set
	 */
	public void setPlayerStrategy(PlayerStrategy playerStrategy) {
		this.playerStrategy = playerStrategy;
	}

	/**
	 * get cards of player
	 * @return the cardList
	 */
	public List<Card> getCardList() {
		return cardList;
	}

	/**
	 * set cards of the player
	 * @param cardList the cardList to set
	 */
	public void setCardList(List<Card> cardList) {
		this.cardList = cardList;
	}

	/**
	 * @param id id of the player eg. 1
	 * @param name name of the player
	 */
	public Player(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.assignedTerritory = new ArrayList<Territory>();
		this.cardList = new ArrayList<>();
		this.numeberOfCardsExchanged = 0;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the armies
	 */
	public int getArmies() {
		return armies;
	}
	
	/**
	 * @param armies the armies to set
	 */
	public void setArmies(int armies) {
		this.armies = armies;
	}
	
	/**
	 * @return the assignedTerritory
	 */
	public List<Territory> getAssignedTerritory() {
		return assignedTerritory;
	}
	
	/**
	 * @param assignedTerritory the assignedTerritory to set
	 */
	public void setAssignedTerritory(List<Territory> assignedTerritory) {
		this.assignedTerritory = assignedTerritory;
	}
	
	/**
	 * @return the numeberOfCardsExchanged
	 */
	public int getNumeberOfTimeCardsExchanged() {
		return numeberOfCardsExchanged;
	}

	/**
	 * @param numeberOfCardsExchanged the numeberOfCardsExchanged to set
	 */
	public void setNumeberOfTimesCardsExchanged(int numeberOfCardsExchanged) {
		this.numeberOfCardsExchanged = numeberOfCardsExchanged;
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {

		if (obj == this) {
			return true;
		}

		if (!(obj instanceof Player)) {
			return false;
		}

		Player player = (Player) obj;
		return player.getName().equalsIgnoreCase(name);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Player [name=" + name + ", playerStrategy=" + playerStrategy + "]";
	}
}
