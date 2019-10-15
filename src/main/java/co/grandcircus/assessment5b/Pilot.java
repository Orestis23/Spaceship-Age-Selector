package co.grandcircus.assessment5b;

import org.springframework.stereotype.Component;

@Component
public class Pilot {

	int ageOfPilot;

	public Pilot() {
		super();
	}

	public Pilot(int ageOfPilot) {
		super();
		this.ageOfPilot = ageOfPilot;
	}

	public int getAgeOfPilot() {
		return ageOfPilot;
	}

	public void setAgeOfPilot(int ageOfPilot) {
		this.ageOfPilot = ageOfPilot;
	}

	@Override
	public String toString() {
		return "Pilot [ageOfPilot=" + ageOfPilot + "]";
	}
	
}
