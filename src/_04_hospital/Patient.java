package _04_hospital;

public class Patient {
	// Constructor and member variables
	boolean isCaredFor;
	Patient() {
		isCaredFor = false;
	}
	// Feels cared for
	public void checkPulse() {
		isCaredFor = true;
	}
	public boolean feelsCaredFor() {
		return isCaredFor;
	}
}
