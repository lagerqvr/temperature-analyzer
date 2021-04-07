package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("----------------------------------");
        System.out.println("\nTEMPERATURE ANALYZER v1.1");
        Scanner scan = new Scanner(System.in);

        System.out.print("\nHow many values do you want to input?: ");
        int antal = scan.nextInt();
        int[] values = new int[antal];

        for(int i = 0; i < values.length; i++) {

            boolean invalidInput = true;
            while(invalidInput) {
                System.out.println("\nPlease input a temperature value " + (i + 1) + ": ");
                int temp = scan.nextInt();

                if(temp > -273 && temp < 100) {
                    values[i] = temp;
                    invalidInput = false;
                }
            }

        }

        boolean stop = false;
        while(!avsluta ) {
            System.out.println("\nIn order to continue, choose one of the options below: ");
            System.out.println("1. Show highest temperature value ");
            System.out.println("2. Show lowest temperature value ");
            System.out.println("3. Show mean temperature ");
            System.out.println("4. Show median temperature ");
            System.out.println("5. Show standard deviation ");
            System.out.println("6. Quit program ");
            int val = scan.nextInt();

            if(val == 1) {

                System.out.println("\nMaximum temperature is: " + Statistics.Max(values)); {
                }

            }
            else if (val == 2) {

                System.out.println("\nMinimum temperature is: " + Statistics.Min(values));
            }
            else if (val == 3) {

                System.out.println("\nMean temperature is: " + Statistics.Average(values));
            }
            else if (val == 4) {

                System.out.println("\nMedian temperature is: " + Statistics.Median(values));

            }
            else if (val == 5) {

                System.out.println("\nStandard deviation is: " + Statistics.Stdev(values));

            }
            else if (val == 6) {
                System.out.println("\nHave a nice day!");
                System.out.println("Quitting program...");
                stop = true;
            }
            else
                System.out.println("Choose a viable menu option");





        }
    }
}



