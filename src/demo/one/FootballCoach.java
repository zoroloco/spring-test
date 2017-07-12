package demo.one;

public class FootballCoach implements Coach {
	private FortuneService fs;

	public FootballCoach(FortuneService fs){
		this.fs = fs;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Go get in to some trouble!";
	}

	@Override
	public String getDailyFortune() {
		return this.fs.getFortune();
	}

}
