import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean request = true;

        try {
            while (request) {
                request = false;
                System.out.println("Введите первое число");
                int a = sc.nextInt();
                System.out.println("Введите второе число");
                int b = sc.nextInt();

                System.out.println("Выберите вариант: +, -, /, *");
                switch (sc.next()) {
                    case "+":
                        System.out.println("Сложение");
                        System.out.println(a + b);
                        break;
                    case "-":
                        System.out.println("Вычитание");
                        System.out.println(a - b);
                        break;
                    case "/":
                        System.out.println("Деление");
                        System.out.println(a / b);
                        break;
                    case "*":
                        System.out.println("Умножение");
                        System.out.println(a * b);
                        break;
                    default:
                        System.out.println("Выберите только: +, -, /, * ");

                }
                System.out.println("Продолжаем?");
                String choose = sc.next();
                if (choose.equalsIgnoreCase("y")) {
                    request = true;
                } else if (choose.equalsIgnoreCase("n")) {
                    System.out.println("Покеда");
                    break;
                }
            }

        } catch (InputMismatchException ar) {
            System.out.println("Ошибка ввода, проверьте ввод");
        }
    }
}