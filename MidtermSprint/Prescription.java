package MidtermSprint;

// Represents a prescription issued by a doctor for a patient
public class Prescription {
    private int prescriptionId;  // Unique Prescription ID
    private Doctor doctor;       // Doctor issuing the prescription
    private Patient patient;     // Patient receiving the prescription
    private Medication medication; // Medication prescribed

    // Constructor
    public Prescription(int prescriptionId, Doctor doctor, Patient patient, Medication medication) {
        this.prescriptionId = prescriptionId;
        this.doctor = doctor;
        this.patient = patient;
        this.medication = medication;
    }

    // Getters
    public Medication getMedication() {
        return medication;
    }

    public int getPrescriptionId() {
        return prescriptionId;
    }

    public Patient getPatient() {
        return patient;
    }

    // **NEW** Getter for Doctor
    public Doctor getDoctor() {
        return doctor;
    }

    public void displayInfo() {
        System.out.println("Prescription ID: " + prescriptionId);
        System.out.println("Doctor: " + doctor.getName());
        System.out.println("Patient: " + patient.getName());
        System.out.println("Medication: " + medication.getName());
    }
}
