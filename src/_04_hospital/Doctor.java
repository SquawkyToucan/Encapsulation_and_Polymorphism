package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	// Specialties
	boolean isSurgeon;
	boolean makesHouseCalls;
	Doctor() {
		isSurgeon = false;
		makesHouseCalls = false;
	}
	public boolean performsSurgery() {
		return isSurgeon;
	}
	public boolean makesHouseCalls() {
		return makesHouseCalls;
	}
	// Patients
	ArrayList<Patient> patients = new ArrayList<>();
	public void assignPatient(Patient p) throws DoctorFullException {
		if(patients.size() < 3) {
			patients.add(p);
		}
		else {
			throw new DoctorFullException();
		}
	}
	public ArrayList<Patient> getPatients() {
		return patients;
	}
	// Medicine
	public void doMedicine() {
		for(Patient p: patients) {
			p.checkPulse();
		}
	}
}
