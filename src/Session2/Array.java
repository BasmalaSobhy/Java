package Session2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        /* Array
            used to store multiple values of the same data type in a single variable

            dataType[] arrName = new dataType[length];

                    >> length indicates how many elements the array will have

           To add or access values to this array, you need to specify where to put this value or where this value is
                >> to specify the place, we use index.

                >> index starts with 0
                >> the last index = length-1

                arrName[0] = "value"; >> this is the first place in that array
                                        >> here we specify to put this "value" in the first place of the array


                arrName[0]; >> access the first place in the array to get the value stored in it
         */

        int[] arrName = new int[5];

        arrName[0] = 1;
        arrName[1] = 5;
        arrName[2] = 7;
        arrName[3] = 4;
        arrName[4] = 1;

        /* for loop
            used to loop over the array to access its index.

            for(int i=0; i<arrName.length; i++) {
                arrName[i];
            }

       >> here we can specify the length manually or using arrName.length which will get the length of the array automatically
         */
        for(int i =0; i<5; i++) {   // specify the length manually
            System.out.println(arrName[i]);
        }

        System.out.println("length of the array = " + arrName.length); // To make sure the length = 5

        for(int i =0; i<arrName.length; i++) {    // specify the length using .length
            System.out.println(arrName[i]);
        }

        /*
            Also, we can add values to the array using this way

            int[] arr = {value, value, ........};

         */

        int[] arr = {8,3,5,7,6};
        System.out.println(arr[2]); // this will get us the third value in our array which will be 5

        /* using Scanner to get the values of an array

            int[] arrName = new int[length];

            for(int i=0; i<length; i++) {
                System.out.println("enter the value of index number " + i);
                arrName[i] = scan.nextInt();
            }
         */

        Scanner scan = new Scanner(System.in);

        int[] arr2 = new int[4];

        for(int i=0; i<4; i++) {
            System.out.println("enter the value of index number " + i);
            arr2[i] = scan.nextInt();
        }

        scan.close();

        for(int i=0; i<4; i++) {
            System.out.println("The value stored in index number " + i + " = " + arr2[i]);
        }

        /* Dynamic length vs constant length

            1. Dynamic length
                >> we can let the user enter the number of values he wants the array to store

            int len = scanner.nextInt();
            int[] arrName = new int[len];
                >> len is the integer value that represents how many values does the user want the array to store

            2. constant length
                >> we can set a length for the array that no one can change

                final int len = 5;
                int[] arrName = new int[len];

                >> final represent that this is a constant that no one can change this value

         */

        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int[] arr3 = new int[len];

        for(int i=0; i<arr3.length; i++) {
            System.out.println("please enter index of " + i);
            arr3[i] = scanner.nextInt();
        }

        System.out.println("The array has these values");
        for(int i=0; i<arr3.length; i++) {
            System.out.println(arr3[i]);
        }

        scanner.close();

        final int length = 3;
        int[] arr4 = new int[length];
        // length = 6; >> this will result this error >> Cannot assign a value to final variable 'length'


        /* Two Dimensional Array
            Array of arrays
                >> It's an array that each element in it is also an array

                dataType[][] arrName = new dataType[rows][columns];

                dataType[][] arrName = { {value, value,.....},
                                         {value, value,.....},
                                         {value, value,.....},.......}


             >> To get the number of rows of 2D array = arrName.length
             >> To get the number of rows of 2D array = arrName[0].length

         */

        int[][] D2 = new int[2][3];  // 2D array of 2 rows and 3 columns
        int[][] D3 = {{1, 2, 3},
                      {4, 5, 6}};

        System.out.println("The number of rows of D2 array = " + D2.length);
        System.out.println("The number of columns of D2 array = " + D2[0].length);

        for(int i =0; i<D2.length; i++) { // rows 0
            for(int j=0; j<D2[0].length; j++){ // columns 1

                System.out.println("please enter a value for row "+ i + " column " + j);
                D2[i][j] = scan.nextInt();
            }
        }

        for(int i =0; i<D2.length; i++) { // rows 0
            for(int j=0; j<D2[0].length; j++){ // columns 1

                System.out.println("The value stored in row number " + i + " and column number " + j + " = " + D2[i][j]);
            }
        }
    }
}
