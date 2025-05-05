package Classes;

public class Main {
    public static void main(String args[]) {

        // using the first constructor that have no parameters
        Classes rectangle1 = new Classes();

        rectangle1.setLength(6);
        rectangle1.setWidth(5);

        int length1 = rectangle1.getLength();
        int width1 = rectangle1.getWidth();

        int area1 = length1*width1;
        System.out.println("area of the first rectangle = " + area1);


        // using the second constructor that have 2 parameters (len and wid)
        Classes rectangle2 = new Classes(3,4);;

        int length2 = rectangle2.getLength();
        int width2 = rectangle2.getWidth();

        int area2 = length2*width2;
        System.out.println("area of the second rectangle = " + area2);

        // using the static method
        Classes.staticMethod();
    }
}
