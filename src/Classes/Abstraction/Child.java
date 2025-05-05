package Classes.Abstraction;

public class Child extends AbstractParent{
    /*  this class inherits the abstract class
        >> so it has to implement all the abstract methods in the parent class
            >> we use @Override annotation

     */

    @Override
    public void name() {
        System.out.println("child");
    }
}
