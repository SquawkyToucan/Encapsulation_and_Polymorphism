package _04_hospital;

public class Patient {
	// Constructor and member variables
	boolean isCaredFor;
	boolean isLiving;
	Patient() {
		isCaredFor = false;
		isLiving = true;
	}
	// Feels cared for
	public void checkPulse() {
		isCaredFor = true;
	}
	public boolean feelsCaredFor() {
		return isCaredFor;
	}
	public void kill() {
		isLiving = false;
	}
	public boolean isAlive() {
		return isLiving;
	}
}
