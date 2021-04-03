package com.pazzo;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner= new Scanner(System.in);
        int choice;
        System.out.println("Choices:\n 1.ReverseString \n 2.Palindrome \n 3.Random number Between");
        choice = scanner.nextInt();

        switch(choice){
            case 1:
                Scanner scanner1 = new Scanner(System.in);
                String input;
                String revString;
                System.out.println("Please enter a word to be reversed:");
                input = scanner1.nextLine();
                revString = reverseString(input);
                System.out.println("When\t" + input + "\tis reversed it becomes\t" + revString);
                break;

            case 2:
                Scanner scanner2 = new Scanner(System.in);
                String text = "";
                boolean output;
                System.out.println("Please enter a word to check if is palindrome:");
                text=scanner2.nextLine();
//                output=isPalindrome(text);
//                System.out.println(output);
                break;

            case 3:
                Scanner scanner3 = new Scanner(System.in);
                int min;
                int max;
                int result;
                System.out.println("Please enter 2 different numbers:");
                min=scanner3.nextInt();
                max=scanner3.nextInt();
//                result=randBetween(min,max);
//                System.out.println(result);
                break;

            case 4:
                System.exit(1);
                break;

            default:
                System.out.println("Wrong input");
                break;
        }
    }

    public static String reverseString(String sentence){
        char character[]=sentence.toCharArray();
        String reverse="";

        for(int i=character.length-1;i>=0;i--){
            reverse += character[i];
        }
        return reverse;
    }


}

