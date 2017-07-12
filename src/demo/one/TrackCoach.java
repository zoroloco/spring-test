package demo.one;

public class TrackCoach implements Coach {
    private FortuneService fs;
    
    public TrackCoach(FortuneService fs){
    	this.fs = fs;
    }
	
	@Override
	public String getDailyWorkout() {
		return "Go run around for 20k!";
	}

	@Override
	public String getDailyFortune() {
		return "TRACK COACH - "+this.fs.getFortune();
	}

}
