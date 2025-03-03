# Pharmacy Management System 💊

This project is a **Pharmacy Management System** designed to manage patients, doctors, medications, and prescriptions using **Java** and **Object-Oriented Programming** principles.

---

## How to Run the Project 🚀

1. Open **Terminal**.
2. Navigate to the project folder:
```bash
cd MidtermSprint

Compile the project:
javac *.java
Run the project:
java MidtermSprint.Main
Classes Overview

Class Name	Description
Person	Base class for patients and doctors
Patient	Manages patient information, prescriptions, and medications
Doctor	Stores doctor information + list of patients
Medication	Represents drugs with expiry dates and stock
Prescription	Links doctors, patients, and medications
MedicationTrackingSystem	Manages all system functionalities
MainTesting + program execution

Feature	Description	Method
Add Doctor	Adds a doctor to the system	addDoctor()
Add Patient	Registers a new patient	addPatient()
Add Medication	Adds a new medication	addMedication()
Accept Prescription	Links prescription to patient + medication	acceptPrescription()
Restock Medications	Randomly restocks pharmacy inventory	restockMedications()
Check Expired Medications	Detects expired medications	checkExpiredMedications()
Generate System Report	Displays all data in the system	generateSystemReport()
How the Database Would Look ()

Table	Fields	Relationships
Patients	ID, Name, Phone	Linked to Prescriptions
Doctors	ID, Specialization	Linked to Patients
Medications	ID, Name, Expiry	Linked to Prescriptions
Prescriptions	ID, Doctor, Patient	Linked to Medications
Developer Notes 

