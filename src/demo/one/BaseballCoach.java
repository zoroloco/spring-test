package demo.one;

public class BaseballCoach implements Coach{
	private FortuneService fs;
	
	public BaseballCoach(FortuneService fs){
		this.fs = fs;
	}
	
	public String getDailyWorkout(){
		return "Spend 30 minutes doing batting practice!";
	}

	@Override
	public String getDailyFortune() {
		return this.fs.getFortune();
	}
}
