package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	// Specialties
	Hospital myHospital = new Hospital();
	boolean isSurgeon;
	boolean makesHouseCalls;
	boolean isOnDarkSide;
	Doctor() {
		isSurgeon = false;
		makesHouseCalls = false;
		isOnDarkSide = false;
	}
	Doctor(String s) {
		isSurgeon = false;
		makesHouseCalls = false;
		if(s.equalsIgnoreCase("666")) {
			isOnDarkSide = true;
		}
		else {
			isOnDarkSide = false;
		}
	}
	Doctor(String s, Hospital h) {
		isSurgeon = false;
		makesHouseCalls = false;
		if(s.equalsIgnoreCase("666")) {
			isOnDarkSide = true;
		}
		else {
			isOnDarkSide = false;
		}
		h.addDoctor(this);
		myHospital = h;
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
		System.out.println(this + " " + isOnDarkSide);
		if(isOnDarkSide) {
			for(int i = 0; i < patients.size(); i++) {
				patients.get(i).kill();
				myHospital.addZombie(new Zombie("June 1"));
			}
		}
		else {
			for(int i = 0; i < patients.size(); i++) {
				patients.get(i).checkPulse();
			}
		}
	}
	public boolean isEvil() {
		return isOnDarkSide;
	}
	public void joinTheDarkSide() {
		isOnDarkSide = true;
	}
	public Hospital getHospital() {
		return myHospital;
	}
}
