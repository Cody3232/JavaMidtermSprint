package MidtermSprint;

import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        // Initialize System
        MedicationTrackingSystem system = new MedicationTrackingSystem();
        System.out.println("Medication Tracking System Initialized\n");

        // 1. Adding Doctors
        Doctor doctor1 = new Doctor(1, "Dr. House", 45, "709-555-1234", "Internal Medicine");
        system.addDoctor(doctor1);
        System.out.println("Doctor Added: " + doctor1.getName());

        // 2. Adding Patients
        Patient patient1 = new Patient(101, "John Doe", 30, "709-555-5678");
        system.addPatient(patient1);
        System.out.println("Patient Added: " + patient1.getName());

        // 3. Adding Medications
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2023, Calendar.MARCH, 28);
        Date expiredDate = calendar1.getTime();

        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2026, Calendar.JUNE, 15);
        Date futureDate = calendar2.getTime();

        Medication med1 = new Medication(201, "Aspirin", "500mg", 50, expiredDate); // Expired Date
        Medication med2 = new Medication(202, "Ibuprofen", "200mg", 100, futureDate); // Future Date

        system.addMedication(med1);
        system.addMedication(med2);
        System.out.println("Medications Added: Aspirin, Ibuprofen");

        // 4. Accept Prescription
        Prescription prescription1 = new Prescription(301, doctor1, patient1, med2);
        system.acceptPrescription(prescription1);
        System.out.println("Prescription Accepted for: " + patient1.getName());

        // 5. Restocking Medications
        system.restockMedications();
        System.out.println("Medications Restocked");

        // 6. Expired Medication Report
        system.checkExpiredMedications();

        // 7. Search Patient by Name
        system.searchPatientByName("John Doe");

        // 8. Generate System Report
        system.generateSystemReport();

        System.out.println("\nTest Complete.");
    }
}
