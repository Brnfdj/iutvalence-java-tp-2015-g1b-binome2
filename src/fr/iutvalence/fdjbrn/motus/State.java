package fr.iutvalence.fdjbrn.motus;

/**
 * Letter's State class which determinate if a letter is in a word or not.
 *
 * @author breynaty
 * @version 18052015
 */
public enum State {
    /** Well positioned character. */
    RED("RED"),
    /** Incorrectly positioned character. */
    YELLOW("YEL"),
    /** Character not. */
    WHITE("WHI"),
    /** Default state. */
    NORMAL("SEC");
    
    /** Color is a state's attribute. */
    private final String color;

    /** State's constructor. */
    State(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
