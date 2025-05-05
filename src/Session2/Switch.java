package Session2;

public class Switch {
    public static void main(String[] args) {
    /*
        Control Statement which is equal to if-else if
        Check for the equality between the expression and the case
            >> if the expression doesn't match any case, then the default code will be executed

        switch(Expression){
            case ---- :
                    code;
                    break;

            case ---- :
                    code;
                    break;

             default:
                    code;
        }
     */

        String grade = "B";

        switch (grade) {
            case "A+":
                System.out.println("Excellent");
                break;

            case "B":
                System.out.println("Very Good");
                break;

            case "C":
                System.out.println("Good");
                break;

            case "F":
                System.out.println("Fail");
                break;

            default:
                System.out.println("Wrong grade");
        }


        /*
        Note: if you forget to write the break statement, the matched case will be executed along with all cases after  it
         */

        switch (grade) {
            case "A+":
                System.out.println("Excellent");

            case "B":
                System.out.println("Very Good");

            case "C":
                System.out.println("Good");

            default:
                System.out.println("Failed");
        }

    }
}