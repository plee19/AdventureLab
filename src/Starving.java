/**
 * Starving decorator concrete class to extend CharacterDecorator.
 * @author plee19
 * @version 1.0
 */
public class Starving extends CharacterDecorator {
    /**
     * Starving constructor method requiring a Character instance.
     * @param tempCharacter Character instance to be wrapped by Starving
     */
    public Starving(Character tempCharacter) {
        super(tempCharacter);
    }

    /**
     * Character's Name getter method as required by Character, with custom output for Starving.
     * @return String name of Starving character
     */
    public String getName() {
        return tempCharacter.getName() + " The Hungry";
    }

    /**
     * Character's Health getter method as required by Character, with custom output for Starving.
     * @return double health of Starving character
     */
    public double getHealth() {
        return tempCharacter.getHealth() - 2;
    }
}
