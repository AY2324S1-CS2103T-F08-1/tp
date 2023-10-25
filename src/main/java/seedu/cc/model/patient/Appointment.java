package seedu.cc.model.patient;

import static java.util.Objects.requireNonNull;
import static seedu.cc.commons.util.AppUtil.checkArgument;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * Represents a Patient's appointment in the clinic book.
 * Guarantees: immutable; is valid as declared in {@link #isValidDate(String)} and {@link #isValidTime(String)}
 */
public class Appointment {
    public static final String DATE_MESSAGE_CONSTRAINTS = "Dates should be in the format YYYY-MM-DD.";
    public static final String TIME_MESSAGE_CONSTRAINTS = "Times should be in the format HH:MM (24-hour-format).";
    public static final String MESSAGE_CONSTRAINTS = "Appointments should have both a date and a time that adhere to the following constraints:\n"
            + "1. " + DATE_MESSAGE_CONSTRAINTS + "\n"
            + "2. " + TIME_MESSAGE_CONSTRAINTS + ".\n"
            + "The date and time should represent a valid future appointment time.";


    public final LocalDate date;
    public final LocalTime time;

//    /**
//     * Constructs an {@code Appointment}.
//     *
//     * @param date A valid date.
//     * @param time A valid time.
//     */
//    public Appointment(String date, String time) {
//        requireNonNull(date);
//        requireNonNull(time);
//        checkArgument(isValidDate(date), DATE_MESSAGE_CONSTRAINTS);
//        checkArgument(isValidTime(time), TIME_MESSAGE_CONSTRAINTS);
//        this.date = LocalDate.parse(date);
//        this.time = LocalTime.parse(time);
//    }

    /**
     * Constructs an {@code Appointment}.
     *
     * @param date A valid date.
     * @param time A valid time.
     */
    public Appointment(LocalDate date, LocalTime time) {
        requireNonNull(date);
        requireNonNull(time);
//        checkArgument(isValidDate(date), DATE_MESSAGE_CONSTRAINTS);
//        checkArgument(isValidTime(time), TIME_MESSAGE_CONSTRAINTS);
        this.date = date;
        this.time = time;
    }

    /**
     * Returns true if a given string is a valid date.
     */
    public static boolean isValidDate(String testDate) {
        try {
            LocalDate.parse(testDate, DateTimeFormatter.ISO_LOCAL_DATE);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    /**
     * Returns true if a given string is a valid time.
     */
    public static boolean isValidTime(String testTime) {
        try {
            LocalTime.parse(testTime, DateTimeFormatter.ofPattern("HH:mm"));
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Appointment Date: " +
                date.format(DateTimeFormatter.ISO_LOCAL_DATE) + " " +
                time.format(DateTimeFormatter.ofPattern("HH:mm"));
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof Appointment)) {
            return false;
        }

        Appointment otherAppointment = (Appointment) other;
        return date.equals(otherAppointment.date) && time.equals(otherAppointment.time);
    }

    @Override
    public int hashCode() {
        return date.hashCode() + time.hashCode();
    }
}
