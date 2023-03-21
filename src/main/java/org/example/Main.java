package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select operation:");
        System.out.println("1. Square root");
        System.out.println("2. Factorial");
        System.out.println("3. Natural logarithm");
        System.out.println("4. Power function");
        int choice = scanner.nextInt();
    Calculator calculator = new Calculator();
        if(choice==1){
            System.out.println("Enter number:");
            double squareInput = scanner.nextDouble();
            calculator.SquareRoot(squareInput);

        }
        if(choice==2){

            System.out.println("Enter number:");
            int factInput = scanner.nextInt();
            calculator.Factorial(factInput);

        }
        if(choice==3){
            System.out.println("Enter number:");
            double lnInput = scanner.nextDouble();
            calculator.NaturalLog(lnInput);

        }
        if(choice ==4){
            System.out.println("Enter base:");
            double base = scanner.nextDouble();
            System.out.println("Enter exponent:");
            double exponent = scanner.nextDouble();
            calculator.BaseExpo(base,exponent);

        }

        scanner.close();
    }
}

