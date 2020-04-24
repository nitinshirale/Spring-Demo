package com.nitinshirale.spring.demo;

public class CricketCoach implements Coach {
private FortuneService fortuneSer;
private String emailAddress;
private String team;
CricketCoach(){
	System.out.println("I am in Construtor");
}

// Setter method 

	public String getEmailAddress() {
	return emailAddress;
}

public void setEmailAddress(String emailAddress) {
	System.out.println("Email Address:I am in Setter Methods");
	this.emailAddress = emailAddress;
}

public String getTeam() {
	return team;
}

public void setTeam(String team) {
	System.out.println("Team:I am in Setter Methods ");
	this.team = team;
}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice Batting for 30 minutes";
	}

	public void setFortuneSer(FortuneService fortuneSer) {
		System.out.println("I am in Setter Methods");
		this.fortuneSer = fortuneSer;
		
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneSer.getFortune();
	}

}
