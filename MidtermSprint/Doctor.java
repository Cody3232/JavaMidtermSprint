package MidtermSprint;

import java.util.ArrayList;

// Doctor class inheriting from Persons
public class Doctor extends Person {
    private String specialization;                 // Doctor's field of specialization
    private ArrayList<Patient> patients;          // List of patients assigned to this doctor

    // Constructor
    public Doctor(int id, String name, int age, String phoneNumber, String specialization) {
        super(id, name, age, phoneNumber);        // Call parent constructor
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    // Getter for Specialization
    public String getSpecialization() {
        return specialization;
    }

    // Setter for Specialization
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // Add Patient to Doctor's List
    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient added to Dr. " + getName() + "'s list: " + patient.getName());
    }

    // Display Patients
    public void displayPatients() {
        System.out.println("Patients under Dr. " + getName() + " (" + specialization + ")");
        if (patients.isEmpty()) {
            System.out.println("No patients assigned.");
        } else {
            for (Patient p : patients) {
                System.out.println("- " + p.getName());
            }
        }
    }

    // Display Doctor Info
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization: " + specialization);
        System.out.println("Number of Patients: " + patients.size());
    }
}
