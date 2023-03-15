import java.util.Scanner;

public class zadanie2_6_1 {
    // 2. Пользователь вводит строку. Используя метод .contains(‘ ‘) пробел, определите, ввел пользователь одно слово, или больше
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a line (one or several words):");
        String str = scanner.nextLine();
        if (str.contains(" ")) {
            System.out.println("You've entered several words.");
        } else {
            System.out.println("You've entered one word.");
        }
    }
}