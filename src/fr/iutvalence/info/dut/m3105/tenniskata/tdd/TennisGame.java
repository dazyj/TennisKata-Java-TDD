package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{
	public String score;
	
	public TennisGame()
	{
		this.score = "Love - all";
	}
	
	public String getScore()
	{
		return this.score;
	}

	public void serverScored() 
	{
		this.score = "Fifteen - love";
	}

	public void receiverScored() 
	{
		// TODO Auto-generated method stub	
	}
}
