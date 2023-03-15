import java.util.Scanner;

public class zadanie1_6_1 {
    // 1. Пользователь вводит дробное число. Если оно больше пи, вывести “pimore”
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter a fractional number (with comma): ");
        Double num = scanner.nextDouble();
        Double pi = Math.PI;
        if (num > pi) {
            System.out.println("pimore");
        }
    }
}

