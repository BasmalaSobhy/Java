package Classes.Inheritance;

public class ParentClass {

    /* Inheritance is where one class becomes an extension of another class,
            >> therefore inheriting the members of that class.

        >>There are two parties involved in an inheritance.
            1. The parent is known as the superclass, or sometimes also referred to as the parent class or base class.
            2. The child is known as the subclass, or sometimes referred to as the child class or the derived class.

        >>When an inheritance relationship is created between these two classes,
        then the child class inherits the members of the parent class.
        This allows classes to reuse data that already exists within other classes.
        Subclasses should be a more specialized form of the superclass that they inherit from.
     */

    protected String nameOfGame;
    protected boolean teamGame;


    public void setName(String name) {
        nameOfGame = name;
    }

    public void setTeamGame(boolean team) {
        teamGame = team;
    }

    public String getNameOfGame() {
        return nameOfGame;
    }

    public boolean getTeamGame() {
        return teamGame;
    }

    public void print() {
        System.out.println("This is parent Class");
    }
}
