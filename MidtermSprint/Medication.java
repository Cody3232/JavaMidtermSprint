package MidtermSprint;

import java.util.Date;

public class Medication {
    private int medicationId;    // Unique ID
    private String name;         // Medication name
    private String dosage;       // Dosage instructions
    private int quantity;        // Quantity in stock
    private Date expiryDate;     // Expiration date

    // Constructor to initialize medication attributes
    public Medication(int medicationId, String name, String dosage, int quantity, Date expiryDate) {
        this.medicationId = medicationId;
        this.name = name;
        this.dosage = dosage;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
    }

    // Getters
    public int getMedicationId() {
        return medicationId;
    }

    public String getName() {
        return name;
    }

    public String getDosage() {
        return dosage;
    }

    public int getQuantity() {
        return quantity;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    // Setters
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name; // ✅ Needed for the EDIT functionality!
    }

    public void setDosage(String dosage) {
        this.dosage = dosage; // ✅ Needed for the EDIT functionality!
    }

    // Check if the medication is expired
    public boolean isExpired() {
        Date today = new Date();
        return expiryDate.before(today);
    }

    // Display medication information
    public void displayInfo() {
        System.out.println("Medication ID: " + medicationId);
        System.out.println("Name: " + name);
        System.out.println("Dosage: " + dosage);
        System.out.println("Quantity: " + quantity);
        System.out.println("Expiry Date: " + expiryDate);
    }
}
