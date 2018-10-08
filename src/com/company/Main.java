package com.company;

import java.util.Scanner;

/**
 * @author Jack Lahey
 *
 * Assignment
 * Write a program that uses a whle loop to prompt the user to enter any number of exam scores
 * And the resulting program will print ou tthe grade A, B, C, D or F
 * You can convert a string to an integer as follows
 *  String input = "99";
 *  int score = Integer.parseInt(input);
 *
 *  Example
 *      Enter an exam score: 89
 *
 *      Good job.  Your grade is B.
 *      Do you want to enter another score (Y/N)?
 *
 */
public class Main {

    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);
        char chInputChar = ' ';
        String sGrade = "";
        int iInputNumber = 0;

        boolean bContinue = false;

        //ask for input and validate to ensure that it is a positive number
        do {
            System.out.println("Please enter an exam score: ");
            while (!scan.hasNextInt()) {
                System.out.println("That's not a number!");
                scan.nextLine(); //catch the enter key
            }//end while (!scan.hasNextInt())

            //get the exam score
            iInputNumber = scan.nextInt();
            scan.nextLine(); //catch the enter key

            //evaluate the score
            if ((97 <= iInputNumber) && (iInputNumber <= 100))
            {
                sGrade = "Good job.  Your grade is A+";

            }else if ((iInputNumber >= 94) && (iInputNumber <= 96))
            {
                sGrade = "Good job.  Your grade is A";

            }else if ((iInputNumber >= 90) && (iInputNumber <= 93)) {
                sGrade = "Good job.  Your grade is A-";

            }else if ((iInputNumber >= 87) && (iInputNumber <= 89))
            {
                sGrade = "Good job.  Your grade is B+";

            }else if ((iInputNumber >= 84) && (iInputNumber <= 86))
            {
                sGrade = "Good job.  Your grade is B";

            }else if ((iInputNumber >= 80) && (iInputNumber <= 83) ){

                sGrade = "Good job.  Your grade is B-";

            }else if ((iInputNumber >= 77) && (iInputNumber <= 79))
            {
                sGrade = "Good job.  Your grade is C+";

            }else if ((iInputNumber >= 74) && (iInputNumber <= 76))
            {
                sGrade = "Good job.  Your grade is C";

            }else if ((iInputNumber >= 70) && (iInputNumber <= 73)) {

                sGrade = "Good job.  Your grade is C-";

            }else if ((iInputNumber >= 67) && (iInputNumber <= 69)) {

                sGrade = "You Passed.  Your grade is D+";

            }else if ((iInputNumber >= 64) && (iInputNumber <= 66)) {

                sGrade = "You Passed.  Your grade is D";

            }else if ((iInputNumber >= 60) && (iInputNumber <= 63)) {

                sGrade = "You Passed.  Your grade is D-";

            }else if (iInputNumber <= 59) {

            sGrade = "You Failed.  Your grade is F";
        }

            //display the grade
            System.out.println(sGrade);

            do {
                System.out.println("Do you want to enter another score (Y/N)?");
                chInputChar  = Character.toLowerCase(scan.next().charAt(0));
                scan.nextLine();
                if ((chInputChar == 'y') )
                    bContinue = true;
                else if ((chInputChar == 'n'))
                    bContinue = false;

            }while ( !(chInputChar == 'y') && !(chInputChar == 'n') );


        } while (bContinue);








    }
}
