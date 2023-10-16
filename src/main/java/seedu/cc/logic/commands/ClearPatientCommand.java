package seedu.cc.logic.commands;

import static java.util.Objects.requireNonNull;

import seedu.cc.model.ClinicBook;
import seedu.cc.model.NewModel;

/**
 * Clears the address book.
 */
public class ClearPatientCommand extends ClinicCommand {

    public static final String COMMAND_WORD = "clear";
    public static final String MESSAGE_SUCCESS = "Address book has been cleared!";


    @Override
    public CommandResult execute(NewModel model) {
        requireNonNull(model);
        model.setClinicBook(new ClinicBook());
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
