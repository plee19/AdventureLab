/**
 * Wounded decorator concrete class to extend CharacterDecorator.
 * @author plee19
 * @version 1.0
 */

public class Wounded extends CharacterDecorator {
    /**
     * Wounded constructor method requiring a Character instance.
     * @param tempCharacter Character instance to be wrapped by Wounded
     */
    public Wounded(Character tempCharacter) {
        super(tempCharacter);
    }

    /**
     * Character's Name getter method as required by Character, with custom output for Wounded.
     * @return String name of Wounded character
     */
    public String getName() {
        return tempCharacter.getName() + " The Wounded";
    }
    /**
     * Character's Health getter method as required by Character, with custom output for Wounded.
     * @return double health of Wounded character
     */
    public double getHealth() {
        return tempCharacter.getHealth() - 2;
    }
}