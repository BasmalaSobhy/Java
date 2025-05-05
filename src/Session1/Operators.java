package Session1;

public class Operators {

    public static void main(String[] args) {

    /* Arithmetic Operator
        +    -      *    /    %

    Note: order of execution
        1. ()    >> from left to right
        2. *  /  >> from left to right
        3. +  -  >> from left to right
     */

        System.out.println((5+7)+2*12/4+2);
        /*
            1. (5+7) = 12 >> 12+2*12/4+2
            2. 2*12 = 24 >> 12+24/4+2
            3. 24/4 = 6 >> 12+6+2
            4. 12+6 = 18 >> 18+2
            5. 18+2 = 20

            The result = 20
         */



    /* Increment and Decrement Operators

        **given i = 5

        1. Increment Operator (i+1)

            pre-increment >> ++i >> ++5
                            >> increase by 1 then do the statement
                            >> 5+1 = 6 then work with i = 6

            post-increment >> i++
                            >> do the statement then increase by 1
                            >> work with i = 5 then 5+1 = 6


        2. Decrement Operator (i-1)

            pre-decrement >> --i
                            >> decrease by 1 then do the statement
                            >> 5-1 = 4 then work with i = 4

            post-decrement >> i--
                            >> do the statement then decrease by 1
                            >> work with i = 5 then 5-1 = 4

     */
        int i = 5, j=5;

        System.out.println((++i)*2); // 5+1 = 6 >> 6*2 = 12 >> print (do the statement at the end)

        System.out.println((j++)*2); // 5*2 = 10 >> print (do the statement before increase)>> 5+1 = 6

        System.out.println(j); //6

        int k = 5, l=5;

        System.out.println((--k)*2); // 5-1 = 4 >> 4*2 = 8 >> print (do the statement at the end)

        System.out.println((l--)*2); // 5*2 = 10 >> print (do the statement before decrease)>> 5-1 = 4

        System.out.println(l); //4



    /* Assignment Operator " = " */

        int a = 5, b=4;
        a = b; // the value stored in b "4" will be assigned to a

        System.out.println(a); // The result will be 4


    /* Comparison Operators
        used to compare 2 values

        *  > <
        *  >= <=
        *  == != (not equal)
    */

        if (2>1)
            System.out.println("2>1");

        if(1<2)
            System.out.println("1<2");

        if(2<=2)
            System.out.println("2<=2");

        if(2>=2)
            System.out.println("2>=2");

        if(2==2)
            System.out.println("2==2");

        if(2!=1)
            System.out.println("2!=1");


    /* Logical Operator
        used to combine 2 conditions to result to one boolean result

        * && "and" >> the result is true, if both conditions are true
        * || "or" >> the result is true, if at least one condition is true
        * ! "not" >> the result is true, if the condition is false
     */

        if(1<2 && 3>2) // true and true = true
            System.out.println("true because both conditions are true");

        if(1>2 && 3>2) // false and true = false
            System.out.println("false because '1>2 is false' so this won't get printed");

        if(1>2 || 3>2) // false and true = true
            System.out.println("true because '3>2 is true'");

        if(!(1>2)) // not false = true
            System.out.println("true because the condition is false");

        if(!(1<2)) // not true = false
            System.out.println("false because the condition is true so this won't get printed");
    }
}