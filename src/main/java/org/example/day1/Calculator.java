package org.example.day1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, result;
        System.out.println("Enter the numbers");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        System.out.println("Enter operator");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                result = n1 + n2;
                System.out.println("result "+result);
                break;
            case '-':
                result = n1 - n2;
                System.out.println("result "+result);
                break;
            case '*':
                result = n1 * n2;
                System.out.println("result "+result);
                break;
            case '/':
                if (n2 != 0) {
                    result = n1 / n2;
                    System.out.println("result " + result);
                } else {
                    System.out.println("Invalid Number");
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
        sc.close();

    }


}
