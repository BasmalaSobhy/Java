package Session2;

public class Methods {
    public static void main(String[] args) {

        /* Functions = Methods
            >> used to write a block of code that will be executed only when the function is called
                >> this reduces writing the same code multiple times >> you write it once and use it multiple times

                public static returnType methodName(parameterList) {   // method header

                    code;   // method body

                    return -----; // if needed
                }

         Note: methodName and parameterList are known as method signature

           >> to call / invoke a function you write the methodName followed by list of arguments
                    >> parameters are in the method header - arguments in the method call

                methodName(arguments);
         */

        noReturnFunction(); // calling the void function

        System.out.println(fullName("Basmala", "Sobhy"));

        // calling all overloaded methods
        sum();
        sum(5,6);
        sum(5.5,6);
        sum(5,6,7);
    }

    /* return function

        this function send data back to the main method
            >> the type of this data will determine the return type of the function
     */

    public static int returnFunction() {
        return 5;
    }


    /* void function

        this function has no return statement since it doesn't send any kind of data to the main method

        Note : void is a return type however it determines that there is no return statement
     */
    public static void noReturnFunction () {
        System.out.println("Hi from noReturnFunction");
    }



    /* parameter list

        Function with list of data to be used within the method
     */

    public static String fullName(String firstName, String lastName) {

        String fullName = firstName + " " + lastName;
        return fullName;
    }

    /* Method overloading
        Having more than one method with the same name
            >> we can achieve that by changing the parameterList

        Note >> changing the returnType of the method won't work, it will still see them as the same function

        public static double sum(int num1, int num2) {
            return (num1 + num2);
        }
        >> This method will cause an error as it's not method overloading
     */

    public static void sum(int num1, int num2) { // having 2 parameters of type int
        System.out.println("2 int numbers " + (num1 + num2));
    }

    public static void sum(int num1, int num2, int num3) { // having 3 parameters of type int
        System.out.println("3 int numbers " + (num1 + num2 + num3));
    }

    public static void sum(double num1, int num2) { // changing the type of a parameter from int to double
        System.out.println("double num + int num " + (num1 + num2));
    }

    public static void sum() { // having no parameters
        System.out.println("no parameter summation " + (5+6));
    }
}