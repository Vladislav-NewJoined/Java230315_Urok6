import java.util.Scanner;

public class zadanie3_6_1 {
    // 3. Пользователь вводит четыре числа. Найти наибольшее из них.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Please enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Please enter c: ");
        double c = scanner.nextDouble();
        System.out.print("Please enter d: ");
        double d = scanner.nextDouble();

        double[] decMax = {a, b, c, d};

        double maxx = decMax[0];

        for (int i = 0; i < decMax.length; i++) {
            if (maxx < decMax[i]) {
                maxx = decMax[i];
            }
        }
        System.out.println("The max number is: " + maxx);

    }
}