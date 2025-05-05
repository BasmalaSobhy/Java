package Classes.Abstraction;

public abstract class AbstractParent {
    /* Abstraction
        >> is defined as something that exists in theory but does not have a concrete existence.
        >> It is used when you want to define a template for a class or a method, but do not intend for it to be used as is.

        public abstract class className {       // abstract keyword, which is a non-access modifier

        }

        Abstract Method
        >> An abstract method has no body, only the signature of the method is defined, and it is not designed to be run as is.
                >> It's designed to be overridden by a subclass.
	    >> This is meant to be a template to set a standard that any subclass of that parent should provide behavior for this method.

        public abstract returnType methodName();

     Note: abstract class can have both abstract methods and normal methods
           normal class can't have abstract method
     */


    public abstract void name();

    /*Notes:
         abstract class >> can have both abstract methods and normal methods
         normal class >> can only have normal methods
         interface >> can only have abstract methods
    */


    public void x() {
        System.out.println("This is normal method in abstract class");
    }
}
