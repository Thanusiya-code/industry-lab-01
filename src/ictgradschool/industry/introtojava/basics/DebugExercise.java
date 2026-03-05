package ictgradschool.industry.introtojava.basics;


/**
 * This class has an example of a runtime bug in the code.
 *
 * Try running this class before editing it to observe what happens
 * when code with a bug is run.
 *
 * This bug is caused by the code trying to divide a variable
 * containing a reference to an integer by a variable that contains
 * a reference to another integer that happens to be zero.
 *
 * */

public class DebugExercise {

    public void start(){
        System.out.println("3) Inside of the start method");

        System.out.println("4) Create a variable called integerOne and set it to 5");
        int integerOne = 5;
        System.out.println("5) Create a variable called integerTwo and set it to 0");
        int integerTwo = 0;

        System.out.println("6) Add integerOne and integerTwo together and assign the result to a new variable");
        int resultOne = integerOne + integerTwo;
        System.out.println("7) The result is: " + resultOne);

        System.out.println("8) Divide integerOne by integerTwo and assign the result to a new variable");
        int resultTwo = integerOne / integerTwo;
        System.out.println("9) The result is: " + resultTwo);

    }

    public static void main(String[] args) {
        System.out.println("1) Create an instance of the DebugExercise class");
        DebugExercise program = new DebugExercise();
        System.out.println("2) Call the start method of the program instance");
        program.start();
    }

}
