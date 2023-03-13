package org.example;

public class Calculator {
    public double BaseExpo(double base, double exponent) {
        double res=Math.pow(base, exponent);
        System.out.println(base + "^" + exponent + " is " + res);
        return res;
    }

    public int Factorial(int factInput) {
        int factorial = 1;
        for (int i = 2; i <= factInput; i++) {
            factorial *= i;
        }
        System.out.println(factInput + "! is " + factorial);
        return factorial;
    }

    public double SquareRoot(double sqrtInput) {
        double res=Math.sqrt(sqrtInput);
        System.out.println("Square root of " + sqrtInput + " is " + res);
        return res;
    }

    public double NaturalLog(double lnInput) {
        double res=Math.log(lnInput);
        System.out.println("Natural logarithm of " + lnInput + " is " + Math.log(lnInput));
        return res;
    }


}
