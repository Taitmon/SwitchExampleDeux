package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int count = 0;
        System.out.println("Please enter a number.");

        while (true)
        {

            if (count >= 1)
            {
                System.out.println("Please enter a number again.");
            }
            java.util.Scanner userInput = new java.util.Scanner(System.in);

            int dayOfWeek = userInput.nextInt();


            switch (dayOfWeek)
            {
                case 1:
                    System.out.println("Sunday.");
                    break;
                case 2:
                    System.out.println("Monday, ugh...");
                    break;

                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday, Humpdaaaaaay!");
                    break;

                case 5:
                    System.out.println("Thursday");
                    break;

                case 6:
                    System.out.println("Friday, Whoop Whoop!");
                    break;

                case 7:
                    System.out.println("Saturday, time to rest.");
                    break;

                default:
                    System.out.println("Invalid value: X");

                    count++;
            }
        }
    }
}
