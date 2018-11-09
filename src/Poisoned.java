/**
 * Poisoned decorator concrete class to extend CharacterDecorator.
 * @author plee19
 * @version 1.0
 */

public class Poisoned extends CharacterDecorator {
    /**
     * Poisoned constructor method requiring a Character instance.
     * @param tempCharacter Character instance to be wrapped by Poisoned
     */
    public Poisoned(Character tempCharacter) {
        super(tempCharacter);
    }

    /**
     * Character's Name getter method as required by Character, with custom output for Poisoned.
     * @return String name of Poisoned character
     */
    public String getName() {
        return tempCharacter.getName() + " The Poisoned";
    }

    /**
     * Character's Health getter method as required by Character, with custom output for Poisoned.
     * @return double health of Poisoned character
     */
    public double getHealth() {
        return tempCharacter.getHealth() - 2;
    }
}