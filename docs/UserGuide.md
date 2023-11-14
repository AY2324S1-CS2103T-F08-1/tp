---
layout: page
title: User Guide
---

* Table of Contents 
{:toc}

---

# 1. Introduction 🎯

**CareCentral** is built specifically for medical staffs — including doctors, nurses, and hospital staff aged between 25-60 years. Optimized for fast typists, it streamlines the management of patients' medical journeys.

<div style="background-color: #DFF0D8; padding: 10px; margin-bottom: 10px; border-left: 5px solid #4CAE4C;">
  <em>Note: You can download our latest release from <a href="https://github.com/AY2324S1-CS2103T-F08-1/tp/releases/tag/v1.3.1" target="_blank">here</a>.</em>
</div>

# 2. Quick Start Guide ⚡️
Here's how to get started with CareCentral quickly:

1. Ensure you have Java 11 installed in your Computer.
2. Download the latest `carecentral.jar` from [here](https://github.com/AY2324S1-CS2103T-F08-1/tp/releases/tag/v1.3.1) if you have not downloaded it yet.
3. Copy the file to the folder you want to use as the home folder for CareCentral.
4. Double-click the file to start the app. The GUI similar to the below should appear in a few seconds.
   ![Ui](images/Ui.png)
5. Alternatively, you can also go to the folder where the `carecentral.jar` is located and type `java -jar carecentral.jar` in the command box to start the app.
6. For Mac users who are unable to open the file or encountering this issue, follow this [guide](https://nus-cs2103-ay2223s2.github.io/website/admin/programmingLanguages.html).
![Error](images/mac_issue.png)
7. Type the command in the command box and press Enter to execute it.
   e.g. typing `help` and pressing Enter will open the help window.
   Some example commands you can try:
    * `add-patient n/John Doe ic/S1234567A p/98765432 e/johnd@example.com a/25 t/Diabetic`
    * `list-patients`
    * `delete-patient 1`
    * `exit`

<div style="background-color: #E3F2FD; padding: 10px; margin-top: 10px; border-left: 5px solid #64B5F6;">
  <strong>🌟 Congratulations on starting with CareCentral!</strong> The next sections will guide you through more features to fully utilize the app.
</div>

<div style="page-break-after: always;"></div>

# 3. GUI components 🖥️

## 3.1. Main screen 🌟
<img width="600" height="400" src="images/UiWithDescriptions.png" alt="Main Screen">

## 3.2. Sidebar 🗂️
The sidebar contains the following tabs:
* Patients
* Medical History
* Appointments

Users can switch between the tabs by clicking on the respective tabs, using the switch command (see [here](#641-switch-tabs-%EF%B8%8F)) or using Ctrl+T.

## 3.3. Panel 📋
There are 3 panels in the main screen:
* Patient List Panel
* Medical History Panel
* Appointment Panel

Users can switch between the panels by switching between the respective tabs by using `Ctrl + T`.

## 3.4. Result Display Box 📬
The result display box displays the result of the command executed.

## 3.5. Command Box ⌨️
The command box is where the user can type in commands to be executed.

<div style="page-break-after: always;"></div>

# 4. Common Parameters 🔍
Below is a table of parameters you'll commonly use in CareCentral, along with their explanations and constraints:

| Parameters              | Explanation                                                                                                         | Constraints                                                                                                                            |
|-------------------------|---------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------|
| `n/NAME`                | Full name of the patient                                                                                            | Must only contain **alphanumeric characters and spaces**, and it should not be blank                                                   |
| `p/PHONE_NUMBER`        | Phone number of the patient                                                                                         | Must be **entirely numeric** and exactly 8 digits long                                                                                 |
| `ic/NRIC`               | NRIC of the patient                                                                                                 | Must be alphanumeric as per **Singapore standards**. [Details here](https://en.wikipedia.org/wiki/National_Registration_Identity_Card) |
| `a/AGE`                 | Age of the patient                                                                                                  | Must be a **positive integer**                                                                                                         |
| `e/EMAIL`               | Email address of the patient                                                                                        | Must be a **valid email** address                                                                                                      |
| `[t/TAG]…`              | Information that is related to the patient                                                                          | Must only contain **alphanumeric characters**, and it should not be blank                                                              |
| `APPOINTMENT_INDEX`     | Index of the appointment in the displayed appointment list                                                          | Must be a **positive integer**                                                                                                         |
| `d/DATE`                | Date of appointment or event                                                                                        | Must be in the format **YYYY-MM-DD**                                                                                                   |
| `t/TIME`                | Time of appointment or event                                                                                        | Must be in the format **HH:MM (24-hour format)**                                                                                       |
| `pi/PATIENT_INDEX`      | Index of the patient in the displayed patient list. Can refer to patients tab to find out about the patient’s index | Must be a **positive** integer                                                                                                         |
| `MEDICAL_HISTORY_INDEX` | Index of the medical history in the displayed medical history list                                                  | Must be a **positive** integer                                                                                                         |
| `mc/MEDICAL_CONDITION`  | Medical condition of the patient                                                                                    | Must only contain **alphanumeric characters and spaces**, and it should not be blank                                                   |
| `t/TREATMENT`           | The treatment prescribed or administered for the medical condition. If no treatment, you can write 'None'           | Must only contain **alphanumeric characters and spaces**, and it should not be blank                                                   |
| `mn/MEDICATION_NAME`    | Name of the medication prescribed                                                                                   | Must only contain **alphanumeric characters**, and it should not be blank                                                              |
| `KEYWORD`               | The name or part of the name you're using to search for a patient.                                                  | Must be a string                                                                                                                       |
| `TAB_NUMBER`            | The target tab to switch to.<br/>1: Patients Tab<br/>2: Medical History Tab<br/>3: Appointments Tab                 | Must only be integer                                                                                                                   |

<div style="page-break-after: always;"></div>

# 5. Glossary 📚
The following terms are used throughout the CareCentral user guide:

| Word           | Meaning                                                                                                                                                  |
|----------------|----------------------------------------------------------------------------------------------------------------------------------------------------------|
| `CLI`          | **Command Line Interface** - A text-based interface used for entering commands. In CareCentral, you'll use the CLI to input your actions quickly.        |
| `GUI`          | **Graphical User Interface** - A visual interface with graphical elements. CareCentral's GUI is designed for ease of navigation and information display. |
| `NRIC`         | **National Registration Identity Card** number - A unique identifier for Singaporean residents.                                                          |
| `Prescription` | **Medicine prescribed by a medical professional** - CareCentral allows you to manage and track prescriptions for each patient.                           |

<div style="page-break-after: always;"></div>

# 6. Features ⭐️
<div style="background-color: #f9f9f9; border-left: 5px solid #009688; padding: 5px; margin-bottom: 10px; border-radius: 5px; box-shadow: 0 2px 4px rgba(0,0,0,0.1);">
<p style="color: #009688; font-size: 20px;">:information_source: Notes about the command format:</p>
    <ul>
        <li><strong>Words in <code>UPPER_CASE</code></strong> are the parameters to be supplied by the user.<br>
            For example, in <code>add n/NAME</code>, <code>NAME</code> is a parameter which can be used as <code>add n/John Doe</code>.</li>
        <li><strong>Optional items</strong> are in square brackets.<br>
            For example, <code>n/NAME [t/TAG]</code> can be used as <code>n/John Doe t/friend</code> or as <code>n/John Doe</code>.</li>
        <li><strong>Repeating items</strong> marked with <code>…</code> can be used multiple times.<br>
            For example, <code>[t/TAG]…</code> can be used as <code>t/malaria</code>, <code>t/asthma t/malaria</code> or not at all.</li>
        <li><strong>Parameters can be in any order.</strong><br>
            For instance, <code>n/NAME p/PHONE_NUMBER</code> is also acceptable as <code>p/PHONE_NUMBER n/NAME</code>.</li>
        <li><strong>Extraneous parameters</strong> for commands that do not require them such as <code>help</code> <code>exit</code> and <code>clear</code> will be ignored.<br>
            For instance, <code>help 123</code> will be interpreted as <code>help</code>.</li>
    </ul>
    <p style="color: #d9534f;"><strong>❗Warning:</strong> The <code>clear</code> command will erase all data from the .json file and the action <strong>cannot be undone</strong>. Please use with caution.</p>
    <p><strong>💡Tip for PDF users:</strong> Be mindful when copying and pasting commands from the PDF as spaces around line breaks may be lost.</p>
</div>


## 6.1. Patients Related Features 🚑
### 6.1.1. Create Patient Record 📝🚑

**What it does**  <br>
This feature lets you add a new patient record into the CareCentral system, keeping track of all the essential details for each patient.

**Command Format**  <br>
Type the command below to create a new patient entry: <br>
`add-patient n/NAME ic/NRIC a/AGE p/PHONE_NUMBER e/EMAIL [t/TAG]…`

**Example Commands** <br>
Here's an example to add a patient named John Doe: <br>
`add-patient n/John Doe ic/S0123456A a/45 p/12341234 e/johndoe@example.com`

**Parameters:** <br>

| Parameters       | Explanation                                | Constraints                                                                                                                            |
|------------------|--------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------|
| `n/NAME`         | Full name of the patient                   | Must only contain **alphanumeric characters and spaces**, and it should not be blank                                                   |
| `ic/NRIC`        | NRIC of the patient                        | Must be alphanumeric as per **Singapore standards**. [Details here](https://en.wikipedia.org/wiki/National_Registration_Identity_Card) |
| `a/AGE`          | Age of the patient                         | Must be a **positive integer**                                                                                                         |
| `p/PHONE_NUMBER` | Phone number of the patient                | Must be **entirely numeric** and exactly 8 digits long                                                                                 |
| `e/email`        | Email address of the patient               | Must be a **valid email** address                                                                                                      |
| `[t/TAG]...`     | Information that is related to the patient | **Alphanumeric characters** only and no spaces                                                                                         |

---
### 6.1.2. List Patients 📋🚑

**What it does** <br>
Ready to see your whole roster of patients? This command gives you the big picture, listing out all patients currently saved in the CareCentral system.

**Command Format** <br>
Just type this simple command to get the full list: <br>
`list-patients`

---

### 6.1.3. Edit Patient Record ✏️🚑

**What it does:** <br>
Edits existing patient information at the specified `PATIENT_INDEX` in the system.

**Command Format:** <br>
`edit-patient PATIENT_INDEX [n/NAME] [ic/NRIC] [a/AGE] [p/PHONE_NUMBER] [e/EMAIL] [t/TAG]…`

**Example Commands:** <br>
`edit-patient 5 n/John Doe ic/S0123456A a/45 p/12341234 e/johndoe@example.com t/critical`<br>
*This example edits the patient record at **index 5** and update the name to **John Doe**, NRIC to **S0123456A**, age to **45**, phone number to **12341234**, and email to **johndoe@example.com**. It also sets the patient tag to **critical**.*

<div style="background-color: #cce7ff; padding: 10px; margin-bottom: 10px; border-left: 5px solid #3385ff;">
  <strong>:scroll: Additional Info<br></strong>
  Editing patient tags will override all the patient's existing tags. <br>
  e.g. <code>edit-patient 5 t/critical</code> will remove all the patient's existing tags and replace it with <code>critical</code>.
</div>

**Parameters:** <br>
Let's break down what each part of the command means:

| Parameters         | Explanation                                                                                                         | Constraints                                                                                                                            |
|--------------------|---------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------|
| `PATIENT_INDEX`    | Index of the patient in the displayed patient list. Can refer to patients tab to find out about the patient’s index | Must be a **positive** integer                                                                                                         |
| `[n/NAME]`         | Full name of the patient                                                                                            | Must only contain **alphanumeric characters and spaces**, and it should not be blank                                                   |
| `[p/PHONE_NUMBER]` | Phone number of the patient                                                                                         | Must be **entirely numeric** and exactly 8 digits long                                                                                 |
| `[ic/NRIC]`        | NRIC of the patient                                                                                                 | Must be alphanumeric as per **Singapore standards**. [Details here](https://en.wikipedia.org/wiki/National_Registration_Identity_Card) |
| `[a/AGE]`          | Age of the patient                                                                                                  | Must be a **positive integer**                                                                                                         |
| `[e/EMAIL]`        | Email address of the patient                                                                                        | Must be a **valid email** address                                                                                                      |
| `[t/TAG]...`       | Information that is related to the patient                                                                          | **Alphanumeric characters** only and no spaces                                                                                         |

---

### 6.1.4. Delete Patient Record 🗑️🚑

**What it does** <br>
Removes a patient's record from the system. The specific patient is found by the `PATIENT_INDEX` as shown in the list from `list-patients`. **Be aware: This action will permanently erase the patient's record, including all related appointments and medical history.**

**Command Format** <br>
`delete-patient PATIENT_INDEX`

**Example Commands** <br>
`delete-patient 2`<br>
*In this example, `delete-patient 2` will delete the patient record at index 2 from the list of patients. <strong>Make sure to confirm the index number before proceeding to prevent accidental deletion.</strong>*

**Parameters** <br>
Let's break down what each part of the command means:

| Parameters      | Explanation                                                                                                         | Constraints                    |
|-----------------|---------------------------------------------------------------------------------------------------------------------|--------------------------------|
| `PATIENT_INDEX` | Index of the patient in the displayed patient list. Can refer to patients tab to find out about the patient’s index | Must be a **positive** integer |

---

### 6.1.5. Find Patient Record 🔎🚑

**What it does** <br>
Helps you to locate a patient's record in the system by searching for a keyword. The search functionality is designed to match complete or starting fragments of the name. For instance, searching for `John` will show `John Doe` but not `Johnny`.

**Command Format** <br>
`find KEYWORD`

**Example Commands** <br>
This example means that it will fetch the record for any patient named `John Doe`: <br>
`find John Doe`

**Parameters** <br>
Let's break down what each part of the command means:

| Parameters | Explanation                                                        | Constraints      |
|------------|--------------------------------------------------------------------|------------------|
| `KEYWORD`  | The name or part of the name you're using to search for a patient. | Must be a string |

---

## 6.2. Appointments Related Features 📅

<div style="background-color: #fff3e0; padding: 5px; border-left: 5px solid #ffa726;">
  <strong>📝 Notes from the Developers<br></strong>
  Our system supports recording of both past and future appointments to facilitate comprehensive schedule management. This functionality is crucial for maintaining accurate records of patient visits and planning ahead for future appointments.
</div>

### 6.2.1. Add Appointment 📝📅
**What it does** <br>
Enables the scheduling of new appointments for patients.

**Command Format** <br>
`add-appt PATIENT_INDEX d/DATE t/TIME`

**Example Commands** <br>
This example schedules an appointment for the patient at **index 1 for October 1st, 2023, at 2:00 PM**:<br>
`add-appt 1 d/2023-10-01 t/14:00`

**Parameters**

| Parameters      | Explanation                                                                                                         | Constraints                                      |
|-----------------|---------------------------------------------------------------------------------------------------------------------|--------------------------------------------------|
| `PATIENT_INDEX` | Index of the patient in the displayed patient list. Can refer to patients tab to find out about the patient’s index | Must be a **positive** integer                   |
| `d/DATE`        | Date of the appointment                                                                                             | Must be in the format **YYYY-MM-DD**             |
| `t/TIME`        | Time of the appointment                                                                                             | Must be in the format **HH:MM (24-hour format)** |

---

### 6.2.2. List All Appointments 📋📅
<div style="background-color: #ffffcc; padding: 10px; border-left: 3px solid #ffeb3b; margin-bottom: 10px;">
  <strong>:warning: Things To Note <br></strong>
   This feature is dependent on having existing patient records. For example, using <code>list-appointments 1</code> will show all appointments for the patient with index 1. If no patients are recorded, please add a patient to the system first.<br>
</div>

**What it does**
Displays a list of all appointments for a specific patient.

**Command Format**
`list-appointments PATIENT_INDEX`

**Example Commands**
To view all appointments for the patient at index 1, use:<br>
`list-appointments 1`

**Parameters:**

| Parameters      | Explanation                                                                                                         | Constraints                    |
|-----------------|---------------------------------------------------------------------------------------------------------------------|--------------------------------|
| `PATIENT_INDEX` | Index of the patient in the displayed patient list. Can refer to patients tab to find out about the patient’s index | Must be a **positive** integer |

**Final Reminder** <br>
When using this command, ensure that the patient index corresponds to a valid patient in your system to view their appointment details.

---

### 6.2.3. Edit Appointment ✏️📅
<div style="background-color: #ffffcc; padding: 10px; border-left: 3px solid #ffeb3b; margin-bottom: 10px;">
  <strong>:warning: Things To Note <br></strong>
   <ol>
      <li>This command should only be used after <code>list-appointments PATIENT_INDEX.</code></li>
      <li>Make sure to select the correct patient's appointments with <code>list-appointments PATIENT_INDEX</code> before attempting an edit.</li>
   </ol>
  </div>

**What it does** <br>
Edits **existing** appointment details. The appointment to be edited is identified by the index number shown in the displayed list of appointments by `list-appointments`.

**Command Format** <br>
`edit-appt APPOINTMENT_INDEX pi/patient-index [d/DATE] [t/TIME]`

**Example Commands** <br>
To change the details of the <strong>second appointment for the patient at index 7 to October 5th, 2023, at 4:00 PM</strong>:<br>
`edit-appt 2 pi/7 d/2023-10-05 t/16:00`

<div style="background-color: #cce7ff; padding: 10px; margin-bottom: 10px; border-left: 3px solid #3385ff;">
  <strong>:scroll: Additional Info<br></strong>
 To ensure you are editing the correct appointment: <br>
 <ol>
    <li>Use <code>list-appointments PATIENT_INDEX</code> to view a specific patient's appointments.</li>
    <li>The command <code>edit-appt 2 pi/1 d/2023-10-05 t/16:00</code> will update the second-listed appointment for patient index 1.</li>
    <li>To edit appointments for a different patient, first list their appointments using their unique patient index with the command <code>list-appointments PATIENT_INDEX</code>.</li>
    <li>The patient index can be confirmed via the patients tab.</li>
  </ol>
</div>

**Parameters:**

| Parameters          | Explanation                                                                                                         | Constraints                                      |
|---------------------|---------------------------------------------------------------------------------------------------------------------|--------------------------------------------------|
| `APPOINTMENT_INDEX` | Index of the appointment in the displayed appointment list                                                          | Must be a **positive integer**                   |
| `pi/PATIENT_INDEX`  | Index of the patient in the displayed patient list. Can refer to patients tab to find out about the patient’s index | Must be a **positive** integer                   |
| `[d/DATE]`          | Date of the appointment                                                                                             | Must be in the format **YYYY-MM-DD**             |
| `[t/TIME]`          | Time of the appointment                                                                                             | Must be in the format **HH:MM (24-hour format)** |

**Final Reminder** <br>
Remember to verify the appointment index and patient index before making changes to prevent any unintended schedule updates.

---

### 6.2.4. Delete Appointment 🗑️📅
<div style="background-color: #ffffcc; padding: 10px; border-left: 3px solid #ffeb3b; margin-bottom: 10px;">
  <strong>:warning: Things To Note <br></strong>
  Make sure to select the correct patient's appointments with <code>list-appointments PATIENT_INDEX</code> before attempting a deletion.
</div>

**What it does**
Removes an appointment from the system. The appointment to be deleted is identified by the index number shown in the displayed list of appointments by `list-appointments`.

**Command Format**
`delete-appt APPOINTMENT_INDEX pi/patient-index`

**Example Commands**
To delete the **third appointment for the patient at index 2**:<br>
`delete-appt 3 pi/2`

**Parameters:**

| Parameters          | Explanation                                                                                                         | Constraints                    |
|---------------------|---------------------------------------------------------------------------------------------------------------------|--------------------------------|
| `APPOINTMENT_INDEX` | Index of the appointment in the displayed appointment list                                                          | Must be a **positive integer** |
| `pi/PATIENT_INDEX`  | Index of the patient in the displayed patient list. Can refer to patients tab to find out about the patient’s index | Must be a **positive** integer |

**Final Reminder** <br>
Please double-check the appointment and patient indexes before executing this command to avoid removing the wrong appointment.

---

### 6.2.5. Add Prescription 📝💊
<div style="background-color: #ffffcc; padding: 10px; border-left: 3px solid #ffeb3b; margin-bottom: 10px;">
  <strong>:warning: Things To Note <br></strong>
   <ol>
      <li>This command should only be used after <code>list-appointments PATIENT_INDEX</code></li>
      <li>This feature is dependent on having existing patient records & appointments. For example, using <code>list-appointments 1</code> will show all appointments for the patient with index 1. If no patients are recorded, please add a patient to the system first. Similarly, if there is no appointments associated with the patient, please add an appointment to the selected patient first.<br></li>
   </ol>
</div>

**What it does:**
Allows you to add one or multiple medications to a patient's appointment record. The appointment to be edited is identified by the index number shown in the displayed list of appointments by `list-appointments`.

**Command Format:**
`add-prescription APPOINTMENT_INDEX pi/PATIENT_INDEX mn/MEDICATION_NAME...`

**Example Commands:**
To add **Paracetamol and Albuterol to the first appointment for the patient at index 1**:<br>
`add-prescription 1 pi/1 mn/Paracetamol mn/Albuterol`

**Parameters:**

| Parameters           | Explanation                                                                                                         | Constraints                                                                                         |
|----------------------|---------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------|
| `APPOINTMENT_INDEX`  | Index of the appointment in the displayed appointment list                                                          | Must be a **positive integer**                                                                      |
| `pi/PATIENT_INDEX`   | Index of the patient in the displayed patient list. Can refer to patients tab to find out about the patient’s index | Must be a **positive** integer                                                                      |
| `mn/MEDICATION_NAME` | Name of the medication prescribed                                                                                   | must only contain alphanumeric characters, and it should not be blank, can have multiple medication |

---

### 6.2.6. Edit Prescription ✏️💊
<div style="background-color: #ffffcc; padding: 10px; border-left: 3px solid #ffeb3b; margin-bottom: 10px;">
  <strong>:warning: Things To Note <br></strong>
   <ol>
      <li>This command should only be used after <code>list-appointments PATIENT_INDEX</code></li>
      <li>This feature is dependent on having existing patient records & appointments. For example, using <code>list-appointments 1</code> will show all appointments for the patient with index 1. If no patients are recorded, please add a patient to the system first. Similarly, if there is no appointments associated with the patient, please add an appointment to the selected patient first.<br></li>
   </ol>
</div>

**What it does** <br>
Edits a prescription of a patient. The prescription to be edited is identified by the index number shown in the displayed list of appointments by `list-appointments`.

**Command Format** <br>
`edit-prescription APPOINTMENT_INDEX pi/PATIENT_INDEX mn/MEDICATION_NAME...`

**Example Commands** <br>
To revise the prescription details for the **first appointment of patient index 1 to include Panadol, Paracetamol, and Albuterol**: <br>
`edit-prescription 1 pi/1 mn/Panadol mn/Paracetamol mn/Albuterol`

<div style="background-color: #cce7ff; padding: 10px; margin-bottom: 10px; border-left: 3px solid #3385ff;">
  <strong>:scroll: Additional Info<br></strong>
  <ol>
    <li>Prescriptions are linked to specific appointments and can be edited for those <strong>displayed</strong> from the patient's appointment list.</li>
    <li>Editing a prescription will replace any existing medication list for that appointment with the new entries you provide.</li>
  </ol>
</div>

**Parameters**

| Parameters           | Explanation                                                                                                         | Constraints                                                                                         |
|----------------------|---------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------|
| `APPOINTMENT_INDEX`  | Index of the appointment in the displayed appointment list                                                          | Must be a **positive integer**                                                                      |
| `pi/PATIENT_INDEX`   | Index of the patient in the displayed patient list. Can refer to patients tab to find out about the patient’s index | Must be a **positive** integer                                                                      |
| `mn/MEDICATION_NAME` | Name of the medication prescribed                                                                                   | Must only contain alphanumeric characters, and it should not be blank, can have multiple medication |

---

### 6.2.7. Delete Prescription 🗑️💊
<div style="background-color: #ffffcc; padding: 10px; border-left: 3px solid #ffeb3b; margin-bottom: 10px;">
  <strong>:warning: Things To Note <br></strong>
   <ol>
      <li>This command should only be used after <code>list-appointments PATIENT_INDEX</code></li>
      <li>This feature is dependent on having existing patient records & appointments. For example, using <code>list-appointments 1</code> will show all appointments for the patient with index 1. If no patients are recorded, please add a patient to the system first. Similarly, if there is no appointments associated with the patient, please add an appointment to the selected patient first.<br></li>
   </ol>
</div>

**What it does** <br>
Removes a prescription from the system. The appointment to be deleted is identified by the index number shown in the displayed list of appointments by `list-appointments`.

**Command Format** <br>
`delete-prescription APPOINTMENT_INDEX pi/PATIENT_INDEX`

**Example Commands** <br>
For example, to delete the prescription linked to the **first appointment for patient index 1**, you would use: <br>
`delete-prescription 1 pi/1`

**Parameters**

| Parameters          | Explanation                                                                                                         | Constraints                    |
|---------------------|---------------------------------------------------------------------------------------------------------------------|--------------------------------|
| `APPOINTMENT_INDEX` | Index of the appointment in the displayed appointment list                                                          | Must be a **positive integer** |
| `pi/PATIENT_INDEX`  | Index of the patient in the displayed patient list. Can refer to patients tab to find out about the patient’s index | Must be a **positive** integer |

**Final Reminder** <br>
Ensure correct usage of appointment and patient indices to avoid accidental deletion of the wrong prescription.

---

## 6.3. Medical History Related Features 📜

### 6.3.1. Add Medical History 📝📜

<div style="background-color: #ffffcc; padding: 10px; border-left: 3px solid #ffeb3b; margin-bottom: 10px;">
  <strong>:warning: Things To Note <br></strong>
   <ol>
      <li>This command should only be used when there is patient(s) in the patient list.</li>
      <li>For instance, <code>add-medical-history 1 d/2023-10-01 mc/asthma t/ventolin</code> adds the medical history asthma with ventolin as the treatment for the patient with index 1. Make sure to register patients into CareCentral prior to adding their medical records.</li>
      <li>For dates, we allow it to be in the past, up until today's date, but not future dates.</li>
   </ol>
</div>

**What it does** <br>
Adds a medical history to a patient record.

**Command Format** <br>
`add-medical-history PATIENT_INDEX d/DATE mc/MEDICAL_CONDITION t/TREATMENT`

**Example Commands** <br>
To add an asthma condition treated with Ventolin on October 1st, 2023, for patient index 1: <br>
`add-medical-history 1 d/2023-10-01 mc/asthma t/ventolin`

**Parameter**

| Parameters             | Explanation                                                                                                         | Constraints                                                                          |
|------------------------|---------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------|
| `PATIENT_INDEX`        | Index of the patient in the displayed patient list. Can refer to patients tab to find out about the patient’s index | Must be a **positive** integer                                                       |
| `d/DATE`               | The recorded date when the medical condition was diagnosed or noted                                                 | Must be in the format **YYYY-MM-DD**. Can only be dates earlier than today or today  |
| `mc/MEDICAL_CONDITION` | Medical condition of the patient                                                                                    | Must only contain **alphanumeric characters and spaces**, and it should not be blank |
| `t/TREATMENT`          | The treatment prescribed or administered for the medical condition. If no treatment, you can write 'None'           | Must only contain **alphanumeric characters and spaces**, and it should not be blank |

---

### 6.3.2. List Medical History 📋📜
<div style="background-color: #ffffcc; padding: 10px; border-left: 3px solid #ffeb3b; margin-bottom: 10px;">
  <strong>:warning: Things To Note <br></strong>
   <ol>
      <li>This command should only be used when there is patient(s) in the patient list.</li>
      <li>For instance, <code>list-medical-history 1</code> retrieves the medical history for the patient with index 1. Make sure to register patients into CareCentral prior to accessing their medical records.</li>
   </ol>
</div>

**What it does** <br>
Lists the medical history of a patient, including past diagnoses and treatments.

**Command Format** <br>
`list-medical-history PATIENT_INDEX`

**Example Commands** <br>
To view the complete medical history for the patient at index 1: <br>
`list-medical-history 1`

**Parameters**

| Parameters      | Explanation                                                                                                         | Constraints                    |
|-----------------|---------------------------------------------------------------------------------------------------------------------|--------------------------------|
| `PATIENT_INDEX` | Index of the patient in the displayed patient list. Can refer to patients tab to find out about the patient’s index | Must be a **positive** integer |

**Final Reminder** <br>
Ensure the patient index corresponds to a valid entry in your patient registry to retrieve accurate medical history information.

---

### 6.3.3. Edit Medical History ✏️📜

<div style="background-color: #ffffcc; padding: 10px; border-left: 3px solid #ffeb3b; margin-bottom: 10px;">
  <strong>:warning: Things To Note <br></strong>
   <ol>
      <li>This command should only be used when there is patient(s) in the patient list.</li>
      <li>For instance, <code>edit-medical-history 1 d/2022-10-01</code> will override the current medical history with the date diagnosed to 1st October 2022 for the patient with index 1. Make sure to register patients into CareCentral prior to adding their medical records.</li>
   </ol>
</div>

**What it does** <br>
Edits a medical history of a patient. The medical history to be edited is identified by the index number shown in the displayed list of medical history by `list-medical-history`.

**Command Format** <br>
`edit-medical-history MEDICAL_HISTORY_INDEX pi/PATIENT_INDEX [d/DATE] [mc/MEDICAL_CONDITION] [t/TREATMENT]`

**Example Commands** <br>
To edit an existing medical history entry for **patient index 1, changing the condition to asthma and the treatment to Levabuterol on October 1st, 2023**: <br>
`edit-medical-history 1 pi/1 d/2023-10-01 mc/asthma t/Levabuterol`
<div style="background-color: #cce7ff; padding: 10px; margin-bottom: 10px; border-left: 3px solid #3385ff;">
  <strong>:scroll: Additional Information</strong><br>
  The medical history of the patient that you plan to edit must be currently displayed:
  <ol>
    <li>Use <code>list-medical-history PATIENT_INDEX</code> to find the medical history entry you need to edit.</li>
    <li>The command <code>edit-medical-history 2 pi/1 d/2023-10-01 mc/asthma t/Levabuterol</code> will modify the second medical history for the patient at index 1.</li>
    <li>To edit records for a different patient, use their specific patient index to list their medical history first.</li>
    <li>Patient indices are available in the patients tab.</li>
    <li>Edited medical history details will replace the previous entries, so verify the information before editing.</li>
  </ol>
</div>

**Parameters:**

| Parameters               | Explanation                                                                                                         | Constraints                                                                          |
|--------------------------|---------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------|
| `MEDICAL_HISTORY_INDEX`  | Index of the medical history in the displayed medical history list                                                  | Must be a **positive** integer                                                       |
| `pi/PATIENT_INDEX`       | Index of the patient in the displayed patient list. Can refer to patients tab to find out about the patient’s index | Must be a **positive** integer                                                       |
| `[d/DATE]`               | The recorded date when the medical condition was diagnosed or noted                                                 | Must be in the format **YYYY-MM-DD**. Can only be dates earlier than today or today  |
| `[mc/MEDICAL_CONDITION]` | Medical condition of the patient                                                                                    | Must only contain **alphanumeric characters and spaces**, and it should not be blank |
| `[t/TREATMENT]`          | The treatment prescribed or administered for the medical condition. If no treatment, you can write 'None'           | Must only contain **alphanumeric characters and spaces**, and it should not be blank |

**Final Reminder** <br>
Make sure to verify all information for accuracy before updating a patient's medical history record.

---

### 6.3.4. Delete Medical History 🗑️📜
<div style="background-color: #ffffcc; padding: 10px; border-left: 3px solid #ffeb3b; margin-bottom: 10px;">
  <strong>:warning: Things To Note <br></strong>
  This command should only be used after <code>list-medical-history PATIENT_INDEX</code>
</div>

**What it does** <br>
Deletes a medical history of a patient. The medical history to be deleted is identified by the index number shown in the displayed list of medical history by `list-medical-history`.

**Command Format** <br>
`delete-medical-history MEDICAL_HISTORY_INDEX [pi/PATIENT_INDEX]`

**Example Commands** <br>
To delete the **first medical history entry for the patient at index 1**: <br>
`delete-medical-history 1 pi/1`

**Parameters**

| Parameters              | Explanation                                                                                                         | Constraints                    |
|-------------------------|---------------------------------------------------------------------------------------------------------------------|--------------------------------|
| `MEDICAL_HISTORY_INDEX` | Index of the medical history in the displayed medical history list                                                  | Must be a **positive** integer |
| `pi/PATIENT_INDEX`      | Index of the patient in the displayed patient list. Can refer to patients tab to find out about the patient’s index | Must be a **positive** integer |


**Final Reminder** <br>
Be cautious and verify the indexes accurately before deleting to avoid unintended data loss.

---

## 6.4. System Related Features ⚙️
### 6.4.1. Switch Tabs ⏩⚙️

**What it does** <br>
Switches between the different tabs in the sidebar.

**Command Format** <br>
`switch TAB_NUMBER`

**Example Command** <br>
To jump to the **Patients tab**: <br>
`switch 1`

**Parameters**

| Parameters   | Explanation                                                                                         | Constraints          |
|--------------|-----------------------------------------------------------------------------------------------------|----------------------|
| `TAB_NUMBER` | The target tab to switch to.<br/>1: Patients Tab<br/>2: Medical History Tab<br/>3: Appointments Tab | Must only be integer |

---

### 6.3.2 Help❓⚙️

**What it does** <br>
Displays the help page.

**Command Format** <br>
`help`

**Example Command** <br>
`help`

---

### 6.3.3 Clear Data 🗑️⚙️

<div style="background-color: #f9f9f9; border-left: 5px solid #d9534f; padding: 5px; margin-bottom: 10px; border-radius: 5px; box-shadow: 0 2px 4px rgba(0,0,0,0.1);">
   <p style="color: #d9534f;"><strong>❗Warning:</strong> The <code>clear</code> command will erase all data from the .json file and the action <strong>cannot be undone</strong>. Please use with caution.</p>
</div>

**What it does** <br>
Clears all data from the system. **This action will permanently erase all data, including all patient records, appointments, and medical history.**

**Command Format** <br>
`clear`

**Example Command** <br>
`clear`

---
<div style="page-break-after: always;"></div>

# 7. Command Summary 📚

| Action                     | Format                                                                                                      | Examples                                                                    |
|----------------------------|-------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------|
| **Add Patient**            | `add-patient n/NAME ic/NRIC a/AGE p/PHONE_NUMBER e/email [t/TAG]…`                                          | `add-patient n/John Doe ic/S0123456A a/45 p/12341234 e/johndoe@example.com` |
| **List Patients**          | `list-patients`                                                                                             | `list-patients`                                                             |
| **Edit Patient**           | `edit-patient PATIENT_INDEX [n/NAME] [ic/NRIC] [a/AGE] [p/PHONE_NUMBER] [e/EMAIL] [t/TAG]…`                 | `edit-patient 5 n/John Doe ic/S0123456A a/45 p/12341234`                    |
| **Delete Patient**         | `delete-patient PATIENT_INDEX`                                                                              | `delete-patient 2`                                                          |
| **Find Patient**           | `find KEYWORD`                                                                                              | `find John Doe`                                                             |
| **Add Appointment**        | `add-appt PATIENT_INDEX d/DATE t/TIME`                                                                      | `add-appt 1 d/2023-10-01 t/14:00`                                           |
| **List Appointments**      | `list-appointments PATIENT_INDEX`                                                                           | `list-appointments 1`                                                       |
| **Edit Appointment**       | `edit-appt APPOINTMENT_INDEX pi/patient-index [d/DATE] [t/TIME]`                                            | `edit-appt 2 pi/7 d/2023-10-05 t/16:00`                                     |
| **Delete Appointment**     | `delete-appt APPOINTMENT_INDEX pi/patient-index`                                                            | `delete-appt 3 pi/2`                                                        |
| **Add Prescription**       | `add-prescription APPOINTMENT_INDEX pi/PATIENT_INDEX mn/MEDICATION_NAME...`                                 | `add-prescription 1 pi/1 mn/Panadol`                                        | 
| **Edit Prescription**      | `edit-prescription APPOINTMENT_INDEX pi/PATIENT_INDEX mn/MEDICATION_NAME...`                                | `edit-prescription 1 pi/1 mn/Panadol mn/Paracetamol mn/Albuterol`           |
| **Delete Prescription**    | `delete-prescription APPOINTMENT_INDEX pi/PATIENT_INDEX`                                                    | `delete-prescription 1 pi/1`                                                |
| **Add Medical History**    | `add-medical-history PATIENT_INDEX d/DATE [mc/MEDICAL_CONDITION t/TREATMENT`                                | `add-medical-history 1 d/2023-10-01 mc/asthma t/ventolin`                   |
| **List Medical History**   | `list-medical-history PATIENT_INDEX`                                                                        | `list-medical-history 1`                                                    |
| **Edit Medical History**   | `edit-medical-history MEDICAL_HISTORY_INDEX pi/PATIENT_INDEX [d/DATE] [mc/MEDICAL_CONDITION] [t/TREATMENT]` | `edit-medical-history 1 pi/1 mc/asthma t/ventolin`                          |
| **Delete Medical History** | `delete-medical-history MEDICAL_HISTORY_INDEX [pi/PATIENT_INDEX]`                                           | `delete-medical-history 1 pi/1`                                             |
| **Switch Tabs**            | `switch TAB_NUMBER`                                                                                         | `switch 1`                                                                  |

---
