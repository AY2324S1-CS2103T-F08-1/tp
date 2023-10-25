package seedu.cc.testutil;

import seedu.cc.model.medicalhistory.Date;
import seedu.cc.model.medicalhistory.MedicalCondition;
import seedu.cc.model.medicalhistory.MedicalHistory;
import seedu.cc.model.medicalhistory.MedicalHistoryEvent;
import seedu.cc.model.medicalhistory.Treatment;

/**
 * A utility class to help with building MedicalHistoryEvent objects.
 */
public class MedicalHistoryEventBuilder {

    private static final String DEFAULT_DATE = "2023-10-23";
    private static final String DEFAULT_MEDICAL_CONDITION = "Heart Attack";
    private static final String DEFAULT_TREATMENT = "Heart Surgery";

    private Date date;
    private MedicalCondition medicalCondition;
    private Treatment treatment;

    /**
     * Creates a {@code MedicalHistoryEventBuilder} with the default details.
     */
    public MedicalHistoryEventBuilder() {
        date = new Date(DEFAULT_DATE);
        medicalCondition = new MedicalCondition(DEFAULT_MEDICAL_CONDITION);
        treatment = new Treatment(DEFAULT_TREATMENT);
    }

    /**
     * Sets the {@code Date} of the {@code MedicalHistoryEvent} that we are building.
     */
    public MedicalHistoryEventBuilder withDate(String date) {
        this.date = new Date(date);
        return this;
    }

    /**
     * Sets the {@code MedicalCondition} of the {@code MedicalHistoryEvent} that we are building.
     */
    public MedicalHistoryEventBuilder withMedicalCondition(String medicalCondition) {
        this.medicalCondition = new MedicalCondition(medicalCondition);
        return this;
    }

    /**
     * Sets the {@code Treatment} of the {@code MedicalHistoryEvent} that we are building.
     */
    public MedicalHistoryEventBuilder withTreatment(String treatment) {
        this.treatment = new Treatment(treatment);
        return this;
    }

    public MedicalHistoryEvent build() {
        return new MedicalHistoryEvent(medicalCondition, treatment, date);
    }

    /**
     * Builds a {@code MedicalHistory} with the {@code MedicalHistoryEvent} that we are building.
     */
    public MedicalHistory buildMedicalHistory() {
        MedicalHistory medicalHistory = new MedicalHistory();
        medicalHistory.addMedicalHistoryEvent(new MedicalHistoryEvent(medicalCondition, treatment, date));
        return medicalHistory;
    }
}
