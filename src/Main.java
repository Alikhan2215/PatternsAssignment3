public class Main {
    public static void main(String[] args) {
        Character warrior = new WarriorAdapter();
        Character mage = new MageAdapter();

        System.out.println("Warrior's actions:");
        warrior.attack();
        warrior.defend();
        warrior.scouting();

        System.out.println();

        System.out.println("Mage's actions:");
        mage.attack();
        mage.defend();
        mage.scouting();
    }
}