import java.util.ArrayList;
import java.util.Scanner;

public class WoundedStory {

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
                "searching for mushrooms. After a short while, they hear shouting. Farmer Maggot has spied them!" +
                "What do they do now?");
        System.out.println("1. RUN!\n2. Try to fight\n3. Apologize and return their stolen goods.");
        int action = keyboard.nextInt();
        switch (action) {
            case 1:
                System.out.println("The party abandons their food and runs, successfully evading Farmer Maggot's wrath.");
                for (int i = 0; i < party.size(); i++) {
                    System.out.println(party.get(i).getName() + " is starving!");
                    party.set(i, new Starving(party.get(i)));
                }
                break;
            case 2:
                System.out.println("Who tries to take Farmer Maggot down?");
                for (int i = 0; i < party.size(); i++) {
                    System.out.println(i + ". " + party.get(i).getName());
                }
                int attacker = keyboard.nextInt();
                System.out.println("The party tries to take Farmer Maggot down, but " + party.get(attacker - 1).getName() + " is wounded in the battle!\n" +
                        "They leave their haul in defeat.");
                party.set(attacker - 1, new Wounded(party.get(attacker - 1)));
                for (int i = 0; i < party.size(); i++) {
                    System.out.println(party.get(i).getName() + " is starving!");
                    party.set(i, new Starving(party.get(i)));
                }
                break;
            case 3:
                System.out.println("Farmer Maggot forgives the party, and lets them take what they need from his fields, just for today.");
                for (int i = 0; i < party.size(); i++) {
                    System.out.println(party.get(i).getName() + " is well-fed!");
                    party.set(i, new WellFed(party.get(i)));
                }
                break;
        }
        System.out.println("New party status: ");
        for (Character ch : party) {
            System.out.println(ch.getName() + ", Health: " + ch.getHealth());
        }
    }
}