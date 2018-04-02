package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	// Doctors ArrayList + getters and setters
	ArrayList<Doctor> doctors = new ArrayList<>();
	public void addDoctor(Doctor d) {
		doctors.add(d);
	}
	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}
	// Patients ArrayList + getters and setters
	ArrayList<Patient> patients = new ArrayList<>();
	public void addPatient(Patient p) {
		patients.add(p);
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
		for (int k = 0; k < doctors.size(); k++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("Assigning patient " + patients.get(i) + " to " + doctors.get(k));
				try {
					doctors.get(k).assignPatient(patients.get(i));
				} catch (DoctorFullException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				i++;
				if(i >= patients.size()) {
					break;
				}
			}
		}
	}
}
