package Classes.Inheritance;

public class ChildClass_football extends ParentClass{
    /* Child Class
	    >> now the childClass has access to all of the methods that we created in the parentClass.
	    >> In addition to what's inherited, the child class can have additional things that are specific to it.

        public class childClass extends parentClass{}

        Note: When a subclass inherits from a superclass, not everything is inherited:
        1. Constructors are not technically members of a class and therefore they are not inherited.
        2. the private methods and fields are not inherited.
            but All the public and protected methods and fields in a superclass, those are indeed inherited
        3.  if there are any final methods, meaning methods that have the word final in the header, these are inherited but cannot be overridden.

     */

    private int numOfPlayers;

    public int getNumOfPlayers() {
        return numOfPlayers;
    }

    public void setNumOfPlayers(int num) {
        numOfPlayers = num;
    }

    /* overriding:
    >> subclass inherits the members of its parent, however, a subclass may want to change the functionality of a method that it inherited.
    >> how you override a method — use the exact same signature but change the body.

	**Override Annotation
        It's encouraged that you use the override annotation, which is the @ symbol followed by the word Override — @Override.
        This is not required, but it's strongly encouraged. This lets Java know that your intention is to override the method that you inherited from your super class.


      Summary:
         - overloading >> 2 method with same name but parameter list is different
         - overriding >> 2 methods with same name and same parameter list (polymorphism)
     */

    @Override
    public void print() {
        System.out.println(nameOfGame +" has a " + numOfPlayers + " players");
    }

}
