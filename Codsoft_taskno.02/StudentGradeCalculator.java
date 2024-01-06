package com.Tasks;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println();
        System.out.println("    --------------------------------------------------------");
        System.out.println("                   Student Grade Calculator                 ");
        System.out.println("    --------------------------------------------------------");
        System.out.println("\nTake marks obtained (out of 100) in each subject..!");
        System.out.print("\nEnter total number of subjects : ");
        int noOfSubjects = scr.nextInt();

        int subjectMarks;
        int totalMarks = 0;

        for (int i = 1; i <= noOfSubjects; i++) {
            System.out.print(i + ". Enter Subject Marks : ");
            subjectMarks = scr.nextInt();
            totalMarks = totalMarks + subjectMarks;
        }

        System.out.println("\nTotal Marks        : " + totalMarks);
        float avgPercent = (float) totalMarks / noOfSubjects;
        System.out.println("Average Percentage : " + avgPercent);

        char grade =  grades(avgPercent);
        System.out.println("Grade              : " + grade);

        displayResults(totalMarks, avgPercent, grade);

    }

    public static char grades(double avgPercent){
        if(avgPercent >= 90){
            return 'A';
        }
        else if(avgPercent >= 80){
            return 'B';
        }
        else if(avgPercent >= 70) {
            return 'c';
        }
        else if(avgPercent >= 60) {
            return 'D';
        }
        else if(avgPercent >= 50) {
            return 'E';
        }
        if(avgPercent < 50) {
            return 'F';
        }
        return 0;
    }
    public static void displayResults(int totalMarks, double avgPercent, char grade){
        System.out.println();
        System.out.println("        -----------------------------------------------------");
        System.out.println("        |                    Display Result                 |");
        System.out.println("        |---------------------------------------------------|");
        System.out.println("        |   Total_Marks   |" + "  Average_Percent  |" + "    Grade    |");
        System.out.println("        |-----------------|-------------------|-------------|");
        System.out.println("        |       "+ totalMarks + "\t      |       " + String.format("%.2f", avgPercent) + "   \t  |\t\t " + grade + "      |");
        System.out.println("        -----------------------------------------------------");
    }
}
