//*************************************************************************
//Week 12 - Practice Assignment
//Fibonacci.java
//Date: 04/26/2023
//Author: David Taylor
//Class: CIT 149–19Z1–78178
//Instructor: Krishna Nandanoor
//Purpose: Develop a driver main method to call the Fibonacci(n) method with asking the user for the nth Fibonacci
//number and calculate the nth Fibonacci number using arrays.
//*************************************************************************


import java.util.Scanner;
public class Main {
    public static void Fibonacci(int n) {

        int [] numArray = new int[n + 1];

        numArray[0] = 0;
        numArray[1] = 1;
        for (int i = 0; i + 2 <= n; i++) {

            numArray[i +2] = numArray[i] + numArray[i+1];
        }

        System.out.println(numArray[n]);
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Hello world!");

        //get number from user
        System.out.print("What Fibonacci number do you want to find?: ");
        int num = scan.nextInt();

        Fibonacci(num);
    }
}