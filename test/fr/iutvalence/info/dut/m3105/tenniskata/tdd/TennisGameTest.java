package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	@Test
	public void gameIsStarting()
	{
		TennisGame gameOfTennis = new TennisGame();
		Assert.assertEquals(gameOfTennis.getScore(), "Love - all");
	}

	@Test
	public void serverPoint()
	{
		TennisGame gameOfTennis = new TennisGame();
		gameOfTennis.serverScored();
		Assert.assertEquals(gameOfTennis.getScore(), "Fifteen - love");
	}
	
	@Test
	public void receiverPoint()
	{
		TennisGame gameOfTennis = new TennisGame();
		gameOfTennis.receiverScored();
		Assert.assertEquals(gameOfTennis.getScore(), "Love - fifteen");
	}
	
	@Test
	public void serverPointAndReceiverPoint()
	{
		TennisGame gameOfTennis = new TennisGame();
		gameOfTennis.serverScoredAndReceiverScored();
		Assert.assertEquals(gameOfTennis.getScore(), "Fifteen - all");
	}
	
}
