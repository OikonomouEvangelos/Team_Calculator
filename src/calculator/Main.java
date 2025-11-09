package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Team Calculator started!");

        Scanner scanner=new Scanner(System.in);
        double num1,num2,result=0;
        char operator;


        System.out.print("Enter the first number: ");
        num1=scanner.nextDouble();


        System.out.print("Enter the second number: ");
        num2=scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, ^, log)");
        operator=scanner.next().charAt(0);
        scanner.close();

       switch (operator) {

           case '+':
               result = num1 + num2;
               break;
           case '*':
               result = num1 * num2;
               break;


       }
        System.out.println(result);

    }
}