package _04_hospital;

public class Zombie extends Patient {
	String timeOfDeath;
	Zombie(String dateOfDeath) {
		timeOfDeath = dateOfDeath;
	}
	public String getTimeOfDeath() {
		return timeOfDeath;
	}
}
