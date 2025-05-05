package Classes;

public class Classes {

        /* Class
            >> It's basically used as a blueprint that you can use however you want.
            >> class does not have a main method.
                We're not interested in executing any of the methods inside of this class itself.
                This class is made to be a general representation.
            >> Components of a Class
                1. fields - attributes - data
                2. methods - functions


            Object
            >> An instance of the class, it uses all attributes and methods of the class
            >> To create an object of the class, It's done on the main method not inside the class itself
                    >>ClassName objName = new ClassName();
            >> To access attributes and methods of the class, we use the dot operator (.)
                    >> objName.methodName();

         */

        /* OOP Principles:

        1. Encapsulation
            >> is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
                    * declare class variables/attributes as private
                    * provide public get and set methods to access and update the value of a private variable

        2. Inheritance
            >> inherit attributes and methods from one class to another.
                    * subclass (child) - the class that inherits from another class
                    * superclass (parent) - the class being inherited from

        3. Polymorphism
            >> means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
            >> polymorphism is where a subclass can define their own unique behaviors, and yet share some of the same behaviors of their superclass.

        4. Abstraction
            >> is defined as something that exists in theory but does not have a concrete existence.
            >> It is used when you want to define a template for a class or a method, but do not intend for it to be used as is.
         */

        /* Access Modifier
            used to control who can access the attributes or methods

            1. public
                >> can be accessed from anywhere in the project.

            2. private
                >> can't be accessed outside of this class

            3. protected
                >> can be accessed
                    1. in this class
                    2. any class within the same package
                    3. all child class of this class

            Note: with no access modifier, only classes within the same package can access these methods.
         */

        private int length;
        private int width;

        /* Constructor
            >>  Is a special method that is used to initialize objects, so they don't have a return type
            >> You can have however many constructors you want. All of their names must be exactly as the class name.
                What differs is the parameters that they accept.
            >> constructor is called when a new object is created from the class
            >> All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you.


        accessModifier className(){

        }

        Note: Having multiple constructor, the one that is called is whichever one matches the parameter list.

        */

        public Classes() {
            length = 5;
            width = 6;
        }

        public Classes(int len, int wid) {
            length = len;
            width = wid;
        }

        /* Setters and Getters
            >> We can create a method that will allow anyone who wants to use an object to set or get a value if they want to read it

            public void setMethod(dataType varName) {
                classVariable = varName;
            }

            public dataType getMethod() {
                return classVariable;
            }
         */

        public void setLength(int len) {
            length = len;
        }

        public void setWidth(int wid) {
            width = wid;
        }

        public int getLength() {
            return length;
        }

        public int getWidth() {
            return width;
        }


        /* Static
           >> Static is a Non-Access Modifier
           >> Static is used for members of a class which can be accessed by the class itself not an object from the class
               >> className.staticMethodName();

           Note: attributes and methods that are not static cannot be used directly in static methods
         */

        public static int test = 5;

        public static void staticMethod() {
            //System.out.println(length); >> This gets an error >> Non-static field 'length' cannot be referenced from a static context
            System.out.println("This is a static integer " + test);
        }

}
