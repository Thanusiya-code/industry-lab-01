# Introduction to Java

## Overview
This is the source code and instructions for the Introduction to Java lab. Please read the instructions carefully.

For exercise one and two, you are required to create your own project. There is no source code for exercise three. You will find the code for the remaining exercises and the example code from the lecture under the `industry-lab01` folder. The `industry-lab01` folder is already set as an IntelliJ project, which allows you to open a Project from IntelliJ directly.

Before starting the exercises, don’t forget to watch the video on Canvas that demonstrates how to use IntelliJ and how to open an IntelliJ project. 

## Examples directory

This lab project contains an [examples](./src/ictgradschool/industry/introtojava/examples) directory which contains several classes that demonstrate various concepts from the lecture. It is suggested that you run these examples and view the output as a way of familiarising yourself with the concepts in the lecture.

## Exercise One: Create My First Java Program using IntelliJ 

You will be using IntelliJ IDEA throughout this course. Before practising on what you have learned, let’s start by doing the following:

- Launch IntelliJ IDEA and create a new Java project.
- Select the appropriate JDK from the Project SDK list.
- Don’t create a project from the template.
- Select the appropriate project location and name the project lab01.
- Click Finish. 

Once you have created the project, you can now create a new class.

- In the Project tool window, right click on the src folder, select New and then select Java Class.
- Name the class `MyFirstProgram` and click OK.
- You should now have the `MyFirstProgram` class in the Project tool window. Open the class and you should only have the following in the file: 

```java
public class MyFirstProgram { 
} 
```

- Add the following code to the class: 

```java
public class MyFirstProgram { 
    public void start() { 
        System.out.println("Hello World"); 
    } 
 
    public static void main(String[] args) { 
        MyFirstProgram p = new MyFirstProgram(); 
        p.start(); 
    } 
}
```
You can now compile and run the class by clicking on the green arrow icon next to the class name.  

### Questions:
1. What does this class do?
2. Where are the classes generated and stored by IntelliJ?
3. Where do you see the messages after running the program in IntelliJ?
4. What are the different ways of running this class in IntelliJ?
5. What are some of the useful shortcut keys you found in IntelliJ? 

## Exercise Two: Add a New Class to an Existing Project 

Using the `lab01` project you just created, create a new class called `MySecondProgram` in the same folder as `MyFirstProgram` class. Copy the following code to `MySecondProgram` class: 

```java
package ictgradschool.industry.introtojava.mysecondprogram; 
 
public class MySecondProgram { 
    public void start() { 
        System.out.println("Hello World"); 
    } 
} 
```
Notice that you now have a compilation error associated with the package. Try to resolve the error by using IntelliJ. 

### Questions: 
1. What happened to MySecondProgram class after you have fixed the error?
2. What are packages used for?

Modify MyFirstProgram class to the following: 
```java
public class MyFirstProgram { 
    public static void main(String[] args) { 
        MySecondProgram p = new MySecondProgram(); 
        p.start(); 
    } 
} 
```
You should have a compilation error associated with MySecondProgram. Try to resolve the error using IntelliJ. After you have fixed the error, you can run the program. 

### Questions: 
1. What does the keyword import do in Java?
2. How would you resolve the compilation error without using the import keyword? 

## Exercise Three: Evaluation of Expressions 

What output do you think would be produced by each of the following code fragments? (You can work on this exercise on paper) 

1. `System.out.println((int)2.9 * 4.5);`
2. `System.out.println(Math.max(5,60) % Math.min(12,7));`
3. `System.out.println(0.2 * 3 / 2 + 3 / 2 * 3.2);`

## Exercise Four: The Basics - Variables, Debugging, Math, and Casting

In this exercise, you'll practice the basics of declaring and using variables, debugging and `System.out.println()`, the `Math` class, and casting. If you are already comfortable with these, you can skip this exercise and move onto Exercise Five.

### Variables
In this exercise you will use some basic variables and display their data to the user.

Open the [VariablesMain](./src/ictgradschool/industry/introtojava/basics/VariablesMain.java) class. Run its `main()` method to ensure that it is working correctly and that you can see the output of the existing `println` statement in the console. You should see the text `The age is 0` in the console.

Now observe the code and look at the variables that are present. There is an `int` called `age`, an `int` called `monthsSinceBirthday` and an `int` called `daysOnEarth`. These variables will be used in the next steps along with some other variables we will create.

Complete these steps:

1. Add an age within the quote marks to the right hand side of the variable `age`

    - e.g.: `int age = 35;`
    - Run your code and check that you can see the age in the output; it should look something like this: `The age is 35`

2. Create a second `int` variable called `monthsSinceBirthday` and assign a number of months between 0-11 to it

    - e.g.: `int monthsSinceBirthday = 6;`

3. Create a `System.out...` statement that will output `monthsSinceBirthday` together with an appropriate mess; e.g., the output to the console could be: `Months since birthday: 6`

4. Now we will use the variables `age` and `monthsSinceBirthday` together to calculate the approximate days on earth of the user and store it in the variable `daysOnEarth`; follow these steps to complete this:

    - Make sure to add some values other than zero in for `age` and `monthsSinceBirthday`
    - Now for the variable `daysOnEarth` we can calculate the approximate days on earth with the formula: (age * 365) + (monthsSinceBirthday * 30)
    - To calculate this value and assign it to a variable we simply need to put this formula to the right-hand side of the `=` operator; for example:
        - `int daysOnEarth = <your formula here>;`
        - This will assign the result of the formula to the `daysOnEarth` variable
    - Now create a final `System.out...` statement that will use the variable you created to inform the user approximately how many days they have been on earth; for example: `You have been on earth for 11770 days.`

### Debugging and runtime bugs
This task uses the [DebugExercise](./src/ictgradschool/industry/introtojava/basics/DebugExercise.java) class.

By now you have probably seen what IntelliJ does when the code in the editor is invalid. As you edit your code, red lines and text will appear when the code is syntactically invalid.

Not all errors will be detected by the code editor before running - this class has an example of a _runtime_ bug in the code.

Try running this class before editing it to observe what happens when code with a bug is run.

This bug is caused by the code trying to divide a variable containing a reference to an integer by a variable that contains a reference to another integer that happens to be zero.

Make sure that you have run the code and observed what happens. Notice how you see a red `Exception` in the console but also the execution of the program stops completely and the `System.out...` that should have been output to the console after the error is not output at all. We call errors like this _runtime errors_ because they are errors that happen at runtime, and they can cause whole programs to crash.

For this exercise:

1. Make sure you have run the code and observed what a runtime error looks like.
2. Sometimes people may struggle to find the cause of runtime errors, look carefully at all the information available to you in the console and think about what information could help you find the source of the error.
3. Find the source of the runtime error in the code and fix it.
4. Rerun the code and check that it now runs ok without any errors.
5. This runtime error was caused by trying to divide by zero; however, there are many other sources of runtime errors. Try researching online to find out about what other sorts of things can cause these sorts of errors.

### Math.min(...) and Math.max(...)

The following question makes use of the skeleton code found in the [MathMethods](./src/ictgradschool/industry/introtojava/basics/MathMethods.java) class. You will use the `Math.min(...)` and the `Math.max(...)` methods to get the maximum and minimum of two scores and output them to the console.

There is some starter code and comments provided for you.

1. On the line with `double highestScore = 0;`, change the `0` to a method call to the `Math.max(...)` method using the `p1Score` and `p2Score` as the arguments.

    - This will return the highest of the two variables and assign the returned value to the `highestScore` variable.
    - When finished, run your code and check that the highestScore is output correctly to the console.

2. Repeat the steps using `Math.min(...)` to return the lowest score and store it in a variable called `lowestScore`, then print this value along with an appropriate message.

### Casting

The following question makes use of the skeleton code found in the [CastingExercise](./src/ictgradschool/industry/introtojava/casting/CastingExercise.java) class.

This exercise is a short exercise that is designed to practice casting. It involves modifying one line of code so that you can cast a `double` to an `int`.

When you cast a variable of a larger sized data type to a smaller sized data type, you will need to use parenthesise and the data type in front of the value.

For example, to cast 3.5 to an integer, it would look like this:

```java
int exampleInt = (int) 3.5;
```

The value stored in `exampleInt` would be 3 because the data type `int` is a whole number with no decimal places. When we cast from a double to an int, we simply discard all the information after the decimal place.

We can do this with variables too, for example:

```java
double exampleDouble = 3.5;
int exampleInt = (int) exampleDouble;
```

With the two lines above, the result will be the same as the earlier example; the value 3.5 is stored in a variable and then that variable is cast to an `int`.

To complete this exercise, simply complete the steps outlined in the **TODO** comments in the `CastingExercise` class.

## Exercise Five: Programming Practice

The following questions all make use of skeleton code found in the [SimpleMaths](./src/ictgradschool/industry/introtojava/simplemaths/SimpleMaths.java) class.

Before completing each method in the `SimpleMaths` class, carefully examine the class and identify the flow of the program. You also need to think about these questions:

- What are the arguments and their types for each method?
- How is the computation being done in each method?
- How is the output being displayed on the console after each method call?
- What is the return type for each method? 

1. Complete the method called `kilogramsToPounds()` making use of the following formula where: _p_ is the weight in pounds, and _k_ is the weight in kilograms. 

```math
p = k * 2.20462 
```

2. Complete the method called `convertCelsiusToFahrenheit()` making use of the following formula where: _f_ is degrees Fahrenheit, and _c_ is degrees Celsius. Hint: you’ll need to use the divide ( `/` ) operator.

```math
f = 32 + {9 \over 5}c
```

3. Complete the method called `getCompoundInterestValue()` making use of the following formula where: _A_ is the future value of the investment including interest, _P_ is the principal investment, _r_ is the annual interest rate (remember to convert to decimal by dividing by 100), and _t_ is the investment time in years. Hint: make use of `Math.pow()` method.  

```math
A = P(1+r)^t
```

4. Complete the method called `getMyBMI()` making use of the following formula where: BMI is your body-mass index expressed as an integer, _W_ is your weight in kilograms, and _H_ is your height in metres. 

```math
BMI = {W \over H^2}
```

5. Complete the method called `getSphereVolume()` making use of the following formula where: _V_ is the volume in cubic centimetres, _r_ is the radius in centimetres, and _π_ should use Java’s Math.PI constant variable. Hint: make use of `Math.pow()`. 

```math
V = {4 \over 3}\pi r^3
```

6. Complete the method called `getSphereVolumeInInteger()` making use of the formula from the previous question. The method returns an `int` value.


7. Complete the method called `getRoundedSphereVolume()` making use of the formula from the previous question. The method returns a double value rounded to two decimal places. Hint: make use of `Math.round()`.


8. Complete the method called `convertTotalDaysIntoWeeksAndDays()` the purpose of which should be self-explanatory. Hint: you will need to make use of the divide ( `/` ) and modulus ( `%` ) operators.


9. Complete the method called `findSmallerInteger()` the purpose of which should be self-explanatory. Do not use if statements. 

## Exercise Six: Sorting Numbers 

Complete the method `sortNumbersByAscending()` in [SortNumbers.java](./src/ictgradschool/industry/introtojava/sortnumbers/SortNumbers.java). The method takes four integers as arguments and then displays them sorted into ascending order. Later in the course you will learn efficient ways of doing this using built-in methods, but for now use only methods you have learned in the lectures. **Do not use if-statements.**

## (Optional) Exercise Seven: Calculate Elapsed Time

Complete the method `getTimeElapsed()` found in [ElapsedTime.java](./src/ictgradschool/industry/introtojava/elapsedtime/ElapsedTime.java). The method takes a start time and a finish time, each of which is broken down into hours and minutes and expressed as integers, and then displays the time difference between the two in minutes. You should assume a 12-hour period and that the start time is always earlier than the finish time; for example if the start time was 5 hours 30 minutes and the finish time was 5 hours 29 minutes, then 11 hours and 59 minutes must have passed. **Do not use if statements for this exercise.**

While challenging and optional, you are encouraged to give this exercise a go! Completing it will feel very rewarding!

## (Optional) Exercise Eight: Compiling and Running My First Java Program using Command Line

Using the MyFirstProgram.java that you created in Exercise One and based on the lecture, do the following:

- Compile `MyFirstProgram.java` using command line prompt
- Run `MyFirstProgram` using command line prompt
- Modify `MyFirstProgram` to display a different message
- Comment out the entire `main()` method, compile and run `MyFirstProgram` again

### Questions:

1. What is the command for compiling `MyFirstProgram.java`?

2. What message do you see when you try the following command line?
```
java MyFirstProgram
```
- What is the correct command for compiling and running `MyFirstProgram`?

- **Hint:** Look at how to compile and run a Java program in package from command line


3. What are the classes generated after compiling `MyFirstProgram.java`?


4. What messages do you see when you run `MyFirstProgram`?


5. After modifying `MyFirstProgram.java`, what do you have to do for the changes to take place, _i.e._ to display a different message?


6. What messages do you see when you run `MyFirstProgram` after commenting out the entire `main()` method? 

### Investigate the use of command-line arguments 

Read the [Command-Line Arguments](https://docs.oracle.com/javase/tutorial/essential/environment/cmdLineArgs.html) article from The Java Tutorials. Investigate what command-line arguments in Java are and how to pass arguments from the command line. Then, modify `MyFirstProgram` using the following code snippet so that the program now reads one command-line argument and displays it as part of the message on the console. 

```java
public class MyFirstProgram { 
	public void start(String name) { 
		System.out.println("Hello " + name); 
	} 
 
	public static void main(String[] args) { 
		MyFirstProgram p = new MyFirstProgram(); 
		p.start(args[0]); 
	} 
} 
```
### Questions:

1. What is a command-line argument?


2. How many arguments can you pass from the command line?


3. What is the command for displaying the following message on the console?
```
Hello Thomas
```

4. What is the command for displaying the following message on the console?
```
Hello Thomas and James 
```
