package Classes.Interface;

public class ChildClass implements InterfaceClass{
    /*
        Note: you can't inherit an interface class, you implements it

        public class childClass implements InterfaceClass {

        }

        >>  Any class that implements an interface must implement all of its methods

     */

    @Override
    public void name() {
        System.out.println("This is a class that implements an interface class");
    }
}
