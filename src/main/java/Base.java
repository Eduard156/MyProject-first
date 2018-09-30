/**
 * Калькулятор
*@author Эдуард Прищепюк
 */

import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // добавление возможности ввода дробных и целых чисел
        System.out.println("Введите первое дробное число:");
        double i = scanner.nextDouble();

        System.out.println("Введите второе дробное число");
        double y = scanner.nextDouble();

        // добавление возможности просмотра результатов по четырем операциям
        System.out.println("Операция сложения");
        System.out.printf("= %.4f\n", i + y);

        System.out.println("Операция вычитания");
        System.out.printf("= %.4f\n", i - y);

        System.out.println("Операция умножения");
        System.out.printf("= %.4f\n", i * y);

        System.out.println("Операция деления");
        System.out.printf("= %.4f\n", i / y);
    }
}