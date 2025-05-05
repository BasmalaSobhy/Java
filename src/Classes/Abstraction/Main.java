package Classes.Abstraction;

public class Main {
    public static void main(String args[]) {
        //AbstractParent obj = new AbstractParent(); >> This gets an error >> 'AbstractParent' is abstract; cannot be instantiated

        Child child = new Child();
        child.name();
        child.x();
    }
}
