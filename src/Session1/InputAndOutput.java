package Session1;

import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) { // shortcut >> psvm + tab or enter
    /* Output
        used to print out something

    Note : sout + tab >> is a shortcut for System.out.println()
    */
        System.out.println("Print and move the cursor to a new line");
        System.out.print("Print and leave the cursor at the last word of this sentence");
        System.out.println("It will print the net sentence right after the new one");

    /* output of the previous code + "|" which is showing where the cursor is after printing each sentence

    Print and move the cursor to a new line
    |Print and leave the cursor at the last word of this sentence|It will print the net sentence right after the new one
    |
    */


    /* Input
        used to allow the user to enter data to the system

    *Scanner is like a door which is opened for the users to enter data
        Scanner scan = new Scanner(System.in);


    *I have to determine the type of data which will be entered
        scan.next-----();


    *Usually we should save the entered data in a variable in case we need to use it later
        int num = scan.nextInt();

    *After finishing entering data, we should close the door again to free the memory
        scan.close();
     */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a string 'whole sentence' ex:Hello World");
        scan.nextLine();

        System.out.println("Please enter a string 'a single word' ex:Hello");
        scan.next(); /* used to enter one word only
        if you enter a sentence with multiple words it will stop at the first word (first white space)
        example : you entered "Hello World" it will only take "Hello" and stops at the space " " between hello and world
        */

        System.out.println("Please enter an integer number ex:5");
        scan.nextInt();
            // short  5 >> int 10 >> long 20
        System.out.println("Please enter a float number ex:5.5");
        scan.nextFloat();

        System.out.println("Please enter a double number ex:5.5");
        scan.nextDouble();

        System.out.println("Please enter a short number ex:5");
        scan.nextShort();

        System.out.println("Please enter a long number ex:5");
        scan.nextLong(); // used to enter long value

        System.out.println("Please enter a boolean value >> true - false");
        scan.nextBoolean();


        scan.close();
    }


}