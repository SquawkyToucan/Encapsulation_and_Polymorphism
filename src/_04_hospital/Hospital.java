package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	// Doctors ArrayList + getters and setters
	ArrayList<Doctor> doctors = new ArrayList<>();
	ArrayList<Zombie> zombies = new ArrayList<>();
	public void addDoctor(Doctor d) {
		doctors.add(d);
	}
	public void addZombie(Zombie z) {
		zombies.add(z);
		if(patients.size() > 0) {
			patients.remove(patients.size()-1);
		}
		System.out.println("Zombie size = " + zombies.size() + ", patient size: " + patients.size());
	}
	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}
	public ArrayList<Zombie> getZombies() {
		return zombies;
	}
	// Patients ArrayList + getters and setters
	ArrayList<Patient> patients = new ArrayList<>();
	public void addPatient(Patient p) {
		patients.add(p);
		System.out.println("Patient size: " + patients.size());
	}
	public ArrayList<Patient> getPatients() {
		return patients;
	}
	// Assign
	public void assignPatientsToDoctors() {
		if ((patients.size()/3) > doctors.size()) {
			System.err.println("There are too many patients to be assigned to doctors so some may be unassigned after this.");
		}
		int i = 0;
		boolean destroy = false;
		for (int k = 0; k < doctors.size(); k++) {
			for(int j = 0; j < 3; j++) {
				try {
					doctors.get(k).assignPatient(patients.get(i));
				} catch (DoctorFullException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				i++;
				if(i >= patients.size()) {
					destroy = true;
					break;
				}
			}
			if(destroy) {
				break;
			}
		}
	}
	public void makeDoctorsWork() {
		for(Doctor d: doctors) {
			d.doMedicine();
		}
	}
	public Hospital thisHospital() {
		return this;
	}
}
