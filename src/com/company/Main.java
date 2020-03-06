package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// a program for displaying a line of text
        System.out.println("Uganda Marty University");//statement to display ("umu")
        System.out.println("Amaku Simon");//statement to display my name
        System.out.print("Good Samaritan Amaku");
        System.out.println("Amaku Pharmily");
        String myName = "AMAKU";
        System.out.println(myName);
        int myAge = 21;
        System.out.println(myAge);
      long classNo = 1900502881;
        System.out.println(classNo);
        int a = 5;
        System.out.println(a);

       //code for type casting
        double myDouble = 9.78;
        int myInt = (int) myDouble;
        System.out.println(myDouble);
        System.out.println(myInt);
        //code to add
         int sum;
         int x = 7;
         int y = 3;
         sum = x+y;
         System.out.println(sum);
         //code to multiply
         int product;
         int b = 10;
         int c = 5;
         product = b*c;
         System.out.println(product);
         //code for division
        float division;
        float l = 18;
        float s = 10;
        division = l/s;
        System.out.println(division);
        // code for increament
        int z = 10;
        z += 5;
        System.out.println(z);
        //code for string length
        String txt = "Savior";
        System.out.println("length is " + txt.length());
        //code for concatenation
        String firstname = "Amaku";
        String lastname = "Saimon";
        System.out.println("firstname is " + firstname);
        System.out.println("lastname is " + lastname );
        System.out.println(firstname + lastname);
        System.out.println(firstname + "" + lastname);
        //code
        // code for java math class max and min value
        int f= 5;
        int g= 71;
        System.out.println(Math.max(f,g));
        System.out.println(Math.min(f,g));
        //code for square root
        System.out.println(Math.sqrt(4));

      //create scanner object(capture input from keyboard)
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Username ");
        String userName = input.nextLine(); //Read username
        System.out.println("Username is: " + userName); //Output
        System.out.println("Enter Password ");
        String userPassword = input.nextLine(); //Read userpassword
        System.out.println("Userpassword is " + userPassword);//Output

        // capturing integers
        Scanner m = new Scanner(System.in);
        System.out.println("Enter an integer ");
        int integer = m.nextInt();
        System.out.println("Integer is " + integer);

        // capturing double data types
        Scanner t = new Scanner(System.in);
        System.out.println("Enter a number");
        double number = t.nextDouble();
        System.out.println("Number is " + number);
    }
}
