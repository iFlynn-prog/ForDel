import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean request = true;
        int a = 0, b = 0;

        while (request) {
            request = false;

            try {
                System.out.println("Введите первое число");
                a = Integer.parseInt(sc.next());
            } catch (NumberFormatException num) {
                System.out.println("Введите только числовое значение");
                break;
            }

            try {
                System.out.println("Введите второе число");
                b = Integer.parseInt(sc.next());
            } catch (NumberFormatException num) {
                System.out.println("Введите только числовое значение");
                break;
            }

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
                    //TODO ТОже самое что и в прошлом ТУДУ
                    request = true;
            }

            System.out.println("Продолжаем? Выберите Y/N");

            try {
                String choose = sc.next();

                if (choose.equalsIgnoreCase("y")) {
                    request = true;
                } else if (choose.equalsIgnoreCase("n")) {
                    System.out.println("Программа завершена");
                    break;
                } else {
                    System.out.println("Не выбрано действие Y/N");
                    //TODO Заменить выражение для повторного опроса,
                    // а не для перезапуска всего цикла программы
                    request = true;
                }

            } catch (InputMismatchException ar) {
                System.out.println("Ошибка ввода, проверьте ввод");
            }
        }
    }
}
