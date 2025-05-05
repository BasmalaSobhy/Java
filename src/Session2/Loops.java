package Session2;

public class Loops {
    public static void main(String[] args) {

        /*
        Loops >> used to repeat a condition multiple times

            - condition-controlled loop >> repeat depending on a certain condition, if will repeat until the condition is false
            - counter-controlled loop >> repeat depending on a counter (determines how many times it will repeat)
         */

        /* While loop

            while (condition) {
                code;
            }

         */
        int num = 10;

        while(num <= 50) { // it will stop when the condition becomes false >> num becomes more than 50
            System.out.println(num);
            num+=5; // num = num + 5
        }

        /* do while

            do {
                code;
            } while (condition);

            note: since the code is written before the condition,
                the code will be executed first then check the condition if its true, it will repeat
                if the condition is false, it will not repeat

                >> so do while code will be executed at least once however the condition is true or false


         */

        do {
            System.out.println("This is do code although the while condition is false");
        } while (false);


        /* for

            for( initialize counter; counter condition; increment)

            for(int i = 0; i< -- ; i++) {
                code;
            }


         */

        for (int i = 0; i<10; i++) {
            System.out.println(i);
        }

        /* Nested For
            For loop inside another for loop

            for(int i = 0; i< -- ; i++) {

                for(int i = 0; i< -- ; i++) {
                code;
                }

            }
         */

        for (int i = 0; i<5; i++) {

            for (int j = 4; j>=0; j--) {
                System.out.println("i = " + i + " and j = " + j);
            }
        }


        /* Break and Continue

            break >> is used to end the loop even if the condition is still true
                >> all the statement after the break won't be executed and the remaining loops will be skipped too

            Continue >> is used to skip the remaining statements in this iteration
                    >> it will stop the iteration and start the next one
         */

        for(int i=0; i<10; i++) {
            System.out.println(i);

            if(i == 3) {
                System.out.println("here i is equal 3 so the remaining statement will be ignored this time");
                continue;
            }
            System.out.println("if this statement is printed then i is not equal 3");

            if(i==5) {
                System.out.println("This is the last statement before break which will end the loop");
                break;
            }
            System.out.println("when i=5 this statement won't be printed");
        }
    }
}
