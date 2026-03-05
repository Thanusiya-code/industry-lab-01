package ictgradschool.industry.introtojava.basics;

import java.sql.SQLOutput;

/**
 *  This exercise is used to practice basic variables
 *
 *  Run this program to view the output in the console then
 *  complete the steps outline in the 'Variables' lab exercise
 *
 * */

public class VariablesMain {

    public void start(){

        // TODO: When you first open this class, try running it and check to see that you can see the output in the console

        // TODO Step 1) add an age after the '=' operator to assign a value to the variable then run the code to test it
        int age = 1;
        // The System.out... statement outputs the age combined with the String literal "The age is "
        System.out.println("The age is :" + age);

        // TODO Step 2) Create a second int variable called monthsSinceBirthday and assign a number of months between 1-11
        int monthsSinceBirthday = 7;
        // TODO Step 3) Create a 'System.out...' statement to output the monthsSinceBirthday variable with an appropriate message
        System.out.println("Months since Birthday :"+ monthsSinceBirthday);
        // TODO  Step 4) Follow the instructions in the lab to calculate the value of the 'daysOnEarth' variable
        int daysOnEarth = (age * 365) +monthsSinceBirthday *30;
        System.out.println("Days on earth: "  + daysOnEarth);


    }

    public static void main(String[] args) {

        VariablesMain program = new VariablesMain();
        program.start();

    }

}
