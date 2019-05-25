import java.util.Scanner;

public class Main {

    // -Read 10 numbers from the console entered by the user and print the sum of those numbers.
    // -Create a Scanner like we did in the previous video.
    // -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
    // -If hasNextInt() returns false, print the message ÅgInvalid NumberÅh. Continue reading until you have read 10 numbers.
    // -Use the nextInt() method to get the number and add it to the sum.
    // -Before the user enters each number, print the message ÅgEnter number #x:Åh where x represents the count, i.e. 1, 2, 3, 4, etc.
    // -For example, the first message printed to the user would be ÅgEnter number #1:Åh, the next ÅgEnter number #2: Åh, and so on.
    //
    // Hint:
    // -Use a while loop.
    // -Use a counter variable for counting valid numbers.
    // -Close the scanner after you donÅft need it anymore.
    // -Create a project with the name ReadingUserInputChallenge.

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

       // while(true){
        while(counter < 10){
            int order = counter + 1;
            System.out.println("Enter number # " + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int number = scanner.nextInt();
                counter++;
                sum += number;
                //if(counter == 10){
                //    break;
                //}
            }else{
                System.out.println("Invalid number");
            }
            scanner.nextLine(); // handle end of line (enter key)
        }
        System.out.println("sum = " + sum);
        scanner.close();

    }

}