package fr.iutvalence.fdjbrn.motus;

/**
 * Letter class.
 * A letter is defined with a character and a state
 *
 * @author breynaty
 * @version 18052015
 */
public class Letter {
    /** A letter is defined with a character. */
    private char  character;
    /** A letter is defined with a state. */
    private State state;

    /** Letter's constructor. */
    public Letter(char character) {
        this.character = character;
        this.state = State.NORMAL;
    }
    

    /** Character's getter. */
    public char getCharacter() {
        return this.character;
    }

    /** State's getter. */
    public State getState() {
        return this.state;
    }

    /**
     * State's setter.
     * @param state
     */
    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return String.format("%s  %s  |", this.state, this.character);
    }
}
