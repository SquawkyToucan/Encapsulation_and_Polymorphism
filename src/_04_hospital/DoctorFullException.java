package _04_hospital;

@SuppressWarnings("serial")
public class DoctorFullException extends Exception {
	DoctorFullException() {
		System.err.println("This doctor has too many patients, so this one could not be added.");
	}
}
