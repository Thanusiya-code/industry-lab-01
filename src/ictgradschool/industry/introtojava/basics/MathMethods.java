package ictgradschool.industry.introtojava.basics;

public class MathMethods {

    public void start(){

        /* use Math.max() to return the highest score out of `playerOneScore` and `playerTwoScore`
        and assign the result to the variable highestScore */

        double p1Score = 87;
        double p2Score = 92;
        /* Replace the '0' on the line  below with the Math.max() method using p1Score and p2Score
        as the arguments in the call to the Math.max() method; e.g., Math.max(p1Score, p2Score)
        This will return the highest of the two variables and assign the returned value to the
        highestScore variable */

        double highestScore = 0;

        /* Run the code and check that the highest of the two scores is output to the console with the message below */
        System.out.println("The highest score is: " + highestScore);

        /* Repeat these steps to use Math.min() to calculate the lowest score
        * and output it using System.out... */

        // TODO: your new code here:



    }

    public static void main(String[] args) {
        MathMethods program = new MathMethods();
        program.start();
    }

}
