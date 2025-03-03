package MidtermSprint;

import java.util.ArrayList; // Import ArrayList to store medications and prescriptions

// Patient class inheriting from Person
public class Patient extends Person {
    private ArrayList<Medication> medications;    // List of medications the patient is taking
    private ArrayList<Prescription> prescriptions; // List of prescriptions active in the pharmacy

    // Constructor to initialize Patient with inherited attributes
    public Patient(int id, String name, int age, String phoneNumber) {
        super(id, name, age, phoneNumber); // Call the parent constructor
        this.medications = new ArrayList<>();
        this.prescriptions = new ArrayList<>();
    }

    // Add medication to the patient's list
    public void addMedication(Medication medication) {
        medications.add(medication);
        System.out.println("Medication added: " + medication.getName());
    }

    // Add prescription to the patient's list
    public void addPrescription(Prescription prescription) {
        prescriptions.add(prescription);
        System.out.println("Prescription added for medication: " + prescription.getMedication().getName());
    }

    // Display all medications
    public void displayMedications() {
        System.out.println("Medications for: " + getName());
        if (medications.isEmpty()) {
            System.out.println("No medications found.");
        } else {
            for (Medication med : medications) {
                System.out.println("- " + med.getName());
            }
        }
    }

    // Display all prescriptions
    public void displayPrescriptions() {
        System.out.println("Prescriptions for: " + getName());
        if (prescriptions.isEmpty()) {
            System.out.println("No prescriptions found.");
        } else {
            for (Prescription p : prescriptions) {
                System.out.println("- Prescription ID: " + p.getPrescriptionId()
 + " | Medication: " + p.getMedication().getName());
            }
        }
    }
}
