import java.util.ArrayList;
import java.util.Scanner;

public class PoisonStory {

    public static void main(String[] args) {
        Character sam = new Shield(new BasicCharacter("Sam Gamgee"));
        Character frodo = new Sword(new BasicCharacter("Frodo Baggins"));
        Character pippin = new Shield(new BasicCharacter("Pippin Took"));
        ArrayList<Character> party = new ArrayList<>();
        party.add(sam);
        party.add(frodo);
        party.add(pippin);
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Party:");
        for (Character ch : party) {
            System.out.println(ch.getName() + ", Health: " + ch.getHealth());
        }
        System.out.println(sam.getName() + ", " + pippin.getName() + " and " + frodo.getName() + " are wandering through Farmer Maggot's fields, " +
                "searching for mushrooms. They come across a patch. Which mushroom should they take?");
        System.out.println("1. The normal looking one\n2. The purple one");
        int mushColor = keyboard.nextInt();
        System.out.println("Who eats it?");
        System.out.println("1. Sam\n2. Frodo\n3. Pippin");
        int charEats = keyboard.nextInt();
        switch (mushColor) {
            case 1:
                System.out.println(party.get(charEats - 1).getName() + " is well-fed!");
                party.set(charEats-1, new WellFed(party.get(charEats-1)));
                break;
            case 2:
                System.out.println(party.get(charEats - 1).getName() + " has been poisoned!");
                party.set(charEats-1, new Poisoned(party.get(charEats-1)));
                break;
        }
        System.out.println("New party status: ");
        for (Character ch : party) {
            System.out.println(ch.getName() + ", Health: " + ch.getHealth());
        }
    }
}