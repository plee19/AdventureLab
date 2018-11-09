/**
 * Sword decorator concrete class to extend CharacterDecorator.
 * @author plee19
 * @version 1.0
 */

public class Sword extends CharacterDecorator {
    /**
     * Sword constructor method requiring a Character instance.
     * @param tempCharacter Character instance to be wrapped by Sword
     */
    public Sword(Character tempCharacter) {
        super(tempCharacter);
    }

    /**
     * Character's Name getter method as required by Character, with custom output for Sword.
     * @return String name of Sword handler character
     */
    public String getName() {
        return tempCharacter.getName() + " The Sword Handler";
    }

    /**
     * Character's Health getter method as required by Character, with custom output for Sword.
     * @return double health of Sword handler character
     */
    public double getHealth() {
        return tempCharacter.getHealth() + 10;
    }
}