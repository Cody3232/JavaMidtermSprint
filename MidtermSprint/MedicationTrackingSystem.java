package MidtermSprint;

import java.util.ArrayList;

public class MedicationTrackingSystem {
    private ArrayList<Patient> patients;         // List of Patients
    private ArrayList<Doctor> doctors;           // List of Doctors
    private ArrayList<Medication> medications;   // List of Medications
    private ArrayList<Prescription> prescriptions; // List of Prescriptions

    // Constructor
    public MedicationTrackingSystem() {
        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
        this.medications = new ArrayList<>();
        this.prescriptions = new ArrayList<>();
    }

    // Add Patient
    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient added: " + patient.getName());
    }

    // Add Doctor
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        System.out.println("Doctor added: " + doctor.getName());
    }

    // Add Medication
    public void addMedication(Medication medication) {
        medications.add(medication);
        System.out.println("Medication added: " + medication.getName());
    }

    // Accept Prescription (Link Prescription to System)
    public void acceptPrescription(Prescription prescription) {
        prescriptions.add(prescription);
        prescription.getPatient().addPrescription(prescription);
        prescription.getPatient().addMedication(prescription.getMedication());
        System.out.println("Prescription Accepted: " + prescription.getMedication().getName() + " for " + prescription.getPatient().getName());
    }

    // Search for Patient by Name
    public void searchPatientByName(String name) {
        Patient patient = findPatient(name);
        if (patient != null) {
            patient.displayInfo();
        } else {
            System.out.println("Patient not found.");
        }
    }

    // Finder Methods 🔍
    public Patient findPatient(String name) {
        for (Patient p : patients) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public Doctor findDoctor(String name) {
        for (Doctor d : doctors) {
            if (d.getName().equalsIgnoreCase(name)) {
                return d;
            }
        }
        return null;
    }

    public Medication findMedication(String name) {
        for (Medication m : medications) {
            if (m.getName().equalsIgnoreCase(name)) {
                return m;
            }
        }
        return null;
    }

    // Restock Medications (Random Amount)
    public void restockMedications() {
        for (Medication m : medications) {
            int stock = (int) (Math.random() * 50) + 1; // Random stock between 1 and 50
            m.setQuantity(m.getQuantity() + stock);
            System.out.println("Restocked " + m.getName() + " by " + stock + " units.");
        }
    }

    // Check for Expired Medications
    public void checkExpiredMedications() {
        System.out.println("\nChecking for Expired Medications...");
        boolean expiredFound = false;
        for (Medication m : medications) {
            if (m.isExpired()) {
                System.out.println("Expired Medication: " + m.getName());
                expiredFound = true;
            }
        }
        if (!expiredFound) {
            System.out.println("No expired medications found.");
        }
    }

    // Generate System Report
    public void generateSystemReport() {
        System.out.println("\n--- Medication System Report ---");

        System.out.println("\nPatients:");
        for (Patient p : patients) {
            p.displayInfo();
        }

        System.out.println("\nDoctors:");
        for (Doctor d : doctors) {
            d.displayInfo();
        }

        System.out.println("\nMedications:");
        for (Medication m : medications) {
            m.displayInfo();
        }

        checkExpiredMedications();
        System.out.println("--- End of Report ---\n");
    }

    // Edit Patient Details
    public void editPatient(String name, String newName, int newAge, String newPhone) {
        Patient patient = findPatient(name);
        if (patient != null) {
            patient.setName(newName);
            patient.setAge(newAge);
            patient.setPhoneNumber(newPhone);
            System.out.println("Patient details updated.");
        } else {
            System.out.println("Patient not found.");
        }
    }

    // Edit Doctor Details
    public void editDoctor(String name, String newName, int newAge, String newPhone, String newSpecialization) {
        Doctor doctor = findDoctor(name);
        if (doctor != null) {
            doctor.setName(newName);
            doctor.setAge(newAge);
            doctor.setPhoneNumber(newPhone);
            doctor.setSpecialization(newSpecialization);
            System.out.println("Doctor details updated.");
        } else {
            System.out.println("Doctor not found.");
        }
    }

    // Edit Medication Details
    public void editMedication(String name, String newName, String newDosage, int newQuantity) {
        Medication medication = findMedication(name);
        if (medication != null) {
            medication.setName(newName);
            medication.setDosage(newDosage);
            medication.setQuantity(newQuantity);
            System.out.println("Medication details updated.");
        } else {
            System.out.println("Medication not found.");
        }
    }

    // Print Prescriptions by Doctor
    public void printPrescriptionsByDoctor(String doctorName) {
        System.out.println("\nPrescriptions by Doctor: " + doctorName);
        boolean found = false;
        for (Prescription p : prescriptions) {
            if (p.getDoctor().getName().equalsIgnoreCase(doctorName)) {
                System.out.println("- Prescription ID: " + p.getPrescriptionId() + " | Medication: " + p.getMedication().getName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No prescriptions found for Dr. " + doctorName);
        }
    }
}
