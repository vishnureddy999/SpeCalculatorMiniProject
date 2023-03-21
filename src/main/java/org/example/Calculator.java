package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Calculator {
    private static  final  Logger logger =  LogManager.getLogger(Calculator.class);
    public double BaseExpo(double base, double exponent) {
         logger.info("[POWER - " + base + " RAISED TO] " + exponent);
        double res=Math.pow(base, exponent);
        logger.info("[RESULT - POWER] - " + res);
        System.out.println(base + "^" + exponent + " is " + res);
        return res;
    }

    public int Factorial(int factInput) {
         logger.info("[FACTORIAL] - " + factInput);
        int factorial = 1;
        for (int i = 2; i <= factInput; i++) {
            factorial *= i;
        }
        logger.info("[RESULT - FACTORIAL] - " + factorial);
        System.out.println(factInput + "! is " + factorial);
        return factorial;
    }

    public double SquareRoot(double sqrtInput) {
         logger.info("[SQ ROOT] - " + sqrtInput);
        double res=Math.sqrt(sqrtInput);
        logger.info("[RESULT - SQ ROOT] - " + res);
        System.out.println("Square root of " + sqrtInput + " is " + res);
        return res;
    }

    public double NaturalLog(double lnInput) {
         logger.info("[NATURAL LOG] - " + lnInput);
        double res=Math.log(lnInput);
        logger.info("[RESULT - NATURAL LOG] - " + res);
        System.out.println("Natural logarithm of " + lnInput + " is " + Math.log(lnInput));
        return res;
    }


}
