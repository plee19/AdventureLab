/**
 * WellFed decorator concrete class to extend CharacterDecorator.
 * @author plee19
 * @version 1.0
 */

public class WellFed extends CharacterDecorator {
    /**
    * WellFed constructor method requiring a Character instance.
    * @param tempCharacter Character instance to be wrapped by WellFed
    */
    public WellFed(Character tempCharacter) {
        super(tempCharacter);
    }

    /**
    * Character's Name getter method as required by Character, with custom output for WellFed.
    * @return String name of Sword handler character
    */
    public String getName() {
            return tempCharacter.getName() + " The Well-Fed";
        }
    /**
     * Character's Health getter method as required by Character, with custom output for WellFed.
     * @return double health of WellFed character
     */
    public double getHealth() {
            return tempCharacter.getHealth() + 5;
        }
}