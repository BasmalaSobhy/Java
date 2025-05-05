package Classes.Inheritance;

public class Main {
    public static void main(String args[]) {

        // create object from the child "football"
        ChildClass_football football = new ChildClass_football();

        // parent's methods
        football.setName("Football Game");
        football.setTeamGame(true);

        // child's methods
        football.setNumOfPlayers(11);

        football.print();

        // create object from the child "tennis"
        ChildClass_Tennis tennis = new ChildClass_Tennis();

        tennis.print();
    }
}
