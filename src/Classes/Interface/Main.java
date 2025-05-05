package Classes.Interface;

public class Main {
    public static void main(String[] args) {

        //InterfaceClass interfaceClass = new InterfaceClass(); //This gets an error >> 'InterfaceClass' is abstract; cannot be instantiated

        ChildClass childClass = new ChildClass();
        childClass.name();
    }
}
