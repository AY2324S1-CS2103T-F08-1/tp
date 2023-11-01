package seedu.cc.logic.commands;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.cc.logic.parser.CliSyntax.PREFIX_AGE;
import static seedu.cc.logic.parser.CliSyntax.PREFIX_DATE;
import static seedu.cc.logic.parser.CliSyntax.PREFIX_EMAIL;
import static seedu.cc.logic.parser.CliSyntax.PREFIX_MEDICAL_CONDITION;
import static seedu.cc.logic.parser.CliSyntax.PREFIX_NAME;
import static seedu.cc.logic.parser.CliSyntax.PREFIX_NRIC;
import static seedu.cc.logic.parser.CliSyntax.PREFIX_PATIENT_INDEX;
import static seedu.cc.logic.parser.CliSyntax.PREFIX_PHONE;
import static seedu.cc.logic.parser.CliSyntax.PREFIX_TAG;
import static seedu.cc.logic.parser.CliSyntax.PREFIX_TREATMENT;
import static seedu.cc.testutil.Assert.assertThrows;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import seedu.cc.commons.core.index.Index;
import seedu.cc.logic.commands.exceptions.CommandException;
import seedu.cc.logic.commands.medhisteventcommands.EditMedicalHistoryEventCommand;
import seedu.cc.model.ClinicBook;
import seedu.cc.model.Model;
import seedu.cc.model.patient.Patient;
import seedu.cc.model.patient.PatientNameContainsKeywordsPredicate;
import seedu.cc.testutil.EditMedicalHistoryEventDescriptorBuilder;
import seedu.cc.testutil.EditPatientDescriptorBuilder;

/**
 * Contains helper methods for testing commands.
 */
public class CommandTestUtil {

    public static final String VALID_NAME_AMY = "Amy Bee";
    public static final String VALID_NAME_BOB = "Bob Choo";
    public static final String VALID_NRIC_AMY = "S1234568A";
    public static final String VALID_NRIC_BOB = "S1234568B";
    public static final String VALID_PHONE_AMY = "11111111";
    public static final String VALID_PHONE_BOB = "22222222";
    public static final String VALID_EMAIL_AMY = "amy@example.com";
    public static final String VALID_EMAIL_BOB = "bob@example.com";
    public static final String VALID_AGE_AMY = "Block 312, Amy Street 1";
    public static final String VALID_AGE_BOB = "Block 123, Bobby Street 3";
    public static final String VALID_TAG_HUSBAND = "husband";
    public static final String VALID_TAG_FRIEND = "friend";

    public static final String NAME_DESC_AMY = " " + PREFIX_NAME + VALID_NAME_AMY;
    public static final String NAME_DESC_BOB = " " + PREFIX_NAME + VALID_NAME_BOB;
    public static final String NRIC_DESC_AMY = " " + PREFIX_NRIC + VALID_NRIC_AMY;
    public static final String NRIC_DESC_BOB = " " + PREFIX_NRIC + VALID_NRIC_BOB;
    public static final String PHONE_DESC_AMY = " " + PREFIX_PHONE + VALID_PHONE_AMY;
    public static final String PHONE_DESC_BOB = " " + PREFIX_PHONE + VALID_PHONE_BOB;
    public static final String EMAIL_DESC_AMY = " " + PREFIX_EMAIL + VALID_EMAIL_AMY;
    public static final String EMAIL_DESC_BOB = " " + PREFIX_EMAIL + VALID_EMAIL_BOB;
    public static final String AGE_DESC_AMY = " " + PREFIX_AGE + VALID_AGE_AMY;
    public static final String AGE_DESC_BOB = " " + PREFIX_AGE + VALID_AGE_BOB;
    public static final String TAG_DESC_FRIEND = " " + PREFIX_TAG + VALID_TAG_FRIEND;
    public static final String TAG_DESC_HUSBAND = " " + PREFIX_TAG + VALID_TAG_HUSBAND;

    public static final String INVALID_NAME_DESC = " " + PREFIX_NAME + "James&"; // '&' not allowed in names
    public static final String INVALID_PHONE_DESC = " " + PREFIX_PHONE + "911a"; // 'a' not allowed in phones
    public static final String INVALID_EMAIL_DESC = " " + PREFIX_EMAIL + "bob!yahoo"; // missing '@' symbol
    public static final String INVALID_AGE_DESC = " " + PREFIX_AGE; // empty string not allowed for agees
    public static final String INVALID_TAG_DESC = " " + PREFIX_TAG + "hubby*"; // '*' not allowed in tags

    public static final String PREAMBLE_WHITESPACE = "\t  \r  \n";
    public static final String PREAMBLE_NON_EMPTY = "NonEmptyPreamble";
    public static final String VALID_MEDICAL_CONDITION_CANCER = "Cancer";
    public static final String VALID_TREATMENT_CANCER = "Chemotherapy";
    public static final String VALID_DATE_CANCER = "2020-10-10";
    public static final String VALID_MEDICAL_CONDITION_DIABETES = "Diabetes";
    public static final String VALID_TREATMENT_DIABETES = "Insulin";
    public static final String VALID_DATE_DIABETES = "2020-10-11";
    public static final String VALID_PATIENT_INDEX = "1";
    public static final String MEDICAL_CONDITION_DESC_CANCER = " " + PREFIX_MEDICAL_CONDITION
            + VALID_MEDICAL_CONDITION_CANCER;
    public static final String TREATMENT_DESC_CANCER = " " + PREFIX_TREATMENT + VALID_TREATMENT_CANCER;
    public static final String DATE_DESC_CANCER = " " + PREFIX_DATE + VALID_DATE_CANCER;
    public static final String MEDICAL_CONDITION_DESC_DIABETES = " " + PREFIX_MEDICAL_CONDITION
            + VALID_MEDICAL_CONDITION_DIABETES;
    public static final String TREATMENT_DESC_DIABETES = " " + PREFIX_TREATMENT + VALID_TREATMENT_DIABETES;
    public static final String DATE_DESC_DIABETES = " " + PREFIX_DATE + VALID_DATE_DIABETES;
    public static final String PATIENT_INDEX_DESC = " " + PREFIX_PATIENT_INDEX + VALID_PATIENT_INDEX;



    public static final EditMedicalHistoryEventCommand.EditMedicalHistoryEventDescriptor MEDICAL_CONDITION_DESC;
    public static final EditCommand.EditPatientDescriptor DESC_AMY;
    public static final EditCommand.EditPatientDescriptor DESC_BOB;

    static {
        DESC_AMY = new EditPatientDescriptorBuilder().withName(VALID_NAME_AMY).withNric(VALID_NRIC_AMY)
                .withPhone(VALID_PHONE_AMY).withEmail(VALID_EMAIL_AMY).withAge(VALID_AGE_AMY)
                .withTags(VALID_TAG_FRIEND).build();
        DESC_BOB = new EditPatientDescriptorBuilder().withName(VALID_NAME_BOB).withNric(VALID_NRIC_AMY)
                .withPhone(VALID_PHONE_BOB).withEmail(VALID_EMAIL_BOB).withAge(VALID_AGE_BOB)
                .withTags(VALID_TAG_HUSBAND, VALID_TAG_FRIEND).build();
        MEDICAL_CONDITION_DESC = new EditMedicalHistoryEventDescriptorBuilder()
                .withMedicalCondition(VALID_MEDICAL_CONDITION_CANCER)
                .withTreatment(VALID_TREATMENT_CANCER).withDate(VALID_DATE_CANCER).build();

    }

    /**
     * Executes the given {@code command}, confirms that <br>
     * - the returned {@link CommandResult} matches {@code expectedCommandResult} <br>
     * - the {@code actualModel} matches {@code expectedModel}
     */
    public static void assertCommandSuccess(Command command, Model actualModel, CommandResult expectedCommandResult,
                                            Model expectedModel) {
        try {
            CommandResult result = command.execute(actualModel);
            assertEquals(expectedCommandResult, result);
            assertEquals(expectedModel, actualModel);
        } catch (CommandException ce) {
            throw new AssertionError("Execution of command should not fail.", ce);
        }
    }

    /**
     * Convenience wrapper to {@link #assertCommandSuccess(Command, Model, CommandResult, Model)}
     * that takes a string {@code expectedMessage}.
     */
    public static void assertCommandSuccess(Command command, Model actualModel, String expectedMessage,
                                            Model expectedModel) {
        CommandResult expectedCommandResult = new CommandResult(expectedMessage);
        assertCommandSuccess(command, actualModel, expectedCommandResult, expectedModel);
    }

    /**
     * Executes the given {@code command}, confirms that <br>
     * - a {@code CommandException} is thrown <br>
     * - the CommandException message matches {@code expectedMessage} <br>
     * - the clinic book, filtered person list and selected person in {@code actualModel} remain unchanged
     */
    public static void assertCommandFailure(Command command, Model actualModel, String expectedMessage) {
        // we are unable to defensively copy the model for comparison later, so we can
        // only do so by copying its components.
        ClinicBook expectedClinicBook = new ClinicBook(actualModel.getClinicBook());
        List<Patient> expectedFilteredList = new ArrayList<>(actualModel.getFilteredPatientList());

        assertThrows(CommandException.class, expectedMessage, () -> command.execute(actualModel));
        assertEquals(expectedClinicBook, actualModel.getClinicBook());
        assertEquals(expectedFilteredList, actualModel.getFilteredPatientList());
    }

    /**
     * Updates {@code model}'s filtered list to show only the person at the given {@code targetIndex} in the
     * {@code model}'s clinic book.
     */
    public static void showPatientAtIndex(Model model, Index targetIndex) {
        assertTrue(targetIndex.getZeroBased() < model.getFilteredPatientList().size());

        Patient person = model.getFilteredPatientList().get(targetIndex.getZeroBased());
        final String[] splitName = person.getName().fullName.split("\\s+");
        model.updateFilteredPatientList(new PatientNameContainsKeywordsPredicate(Collections
                .singletonList(splitName[0])));

        assertEquals(1, model.getFilteredPatientList().size());
    }

}
