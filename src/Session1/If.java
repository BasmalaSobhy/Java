package Session1;

public class If {
    public static void main(String[] args) {

    /* If
        A control statement which is used to check a condition if its correct then do something

        if(condition) {
            code;
        }

    Note: if the code is only one statement then there is no need to write it between {}
     */

        if (1 < 2) {
            System.out.println("correct 2 is greater than one");
        }
        // This equals this

        if (1 < 2)
            System.out.println("correct 2 is greater than one");



    /* If - else
        used to check if you have 2 paths
        >> if the condition is true, do something
        >> if the condition is false, do another thing

        if(condition) {
            code;
        } else {
            code;
        }
    */

        if (1 < 2) {
            System.out.println("correct 2 is greater than one");
        } else {
            System.out.println("false 1 is not greater than 2");
        }



    /* If - else if - else
        used to check if you have more than 2 paths
        >> if situation A occurs, do something
        >> else if situation B occurs, do another thing
        >> else if situation C occurs, do another thing
        >> else, do another thing

        if(condition) {
            code;
        } else if (condition) {
            code;
        } else {
            code;
        }
    */

        if (1 < 2) {
            System.out.println("correct 2 is greater than one");
        } else if(1 == 2) {
            System.out.println("false 1 is not equal 2");
        } else {
            System.out.println("false 1 is not greater than 2");
        }


    /* Nested If
        used to if their is a path inside a path
        >> If a certain situation occurs, check for the next situation.

        if(condition) {
            if(condition) {
                code;
            }
        } else {
            code;
        }

     Note: the else will go with the immediate if that it follows
    */

        if (1 <= 2) { // there is 2 options 1<2 and 1=2

            if(1 < 2) {
                System.out.println("correct 2 is greater than one");
            } else {
                System.out.println("false 1 is not equal 2");
            }

        } else {
            System.out.println("false 1 is not greater than 2");
        }

    }
}