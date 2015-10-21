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
	
	
	
	

	
}
