import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] currencies = {"USD", "EUR", "JPY", "RUB"};

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите номер валюты, которую хотите купить:");
        int index1 = scanner1.nextInt(); // Даём пользователю ввести индекс и считываем его ввод

        if (index1 < 0) {
            // Если индекс меньше 0, сообщаем пользователю об ошибке
            System.out.println("Неверное значение номера валюты! Выберите число от 0 до 3.");
        } else if (index1 >= currencies.length) {
            // Индекс должен быть строго меньше длины массива
            System.out.println("Неверное значение номера валюты! Выберите число от 0 до 3.");
        } else {
            // Всё хорошо, выводим запрошенную пользователем валюту
            System.out.println("Вы купили валюту: " + currencies[index1]);
        }


        double[] expenses1 = new double[7]; // Объявили массив трат за неделю (7 дней)

        double expense1 = 50; // В первый день потрачено 50 рублей

        // Заполнили массив, используя цикл for
        for (int i = 0; i < expenses1.length; i++) {
            expenses1[i] = expense1;
            expense1 = expense1 + 100;
        }
        System.out.println("Ошибок нет. Все расходы успешно занесены в приложение и точка!");


        // Объявили массив трат за неделю (7 дней)
        double[] expenses = new double[7];

        double expense = 50; // В первый день потрачено 50 рублей

        // Заполнили массив, используя цикл for
        for (int i = 0; i < expenses.length; i++) {
            expenses[i] = expense;
            expense = expense + 100;
        }
        System.out.println("Расходы за неделю успешно занесены в приложение!");
        Scanner scanner = new Scanner(System.in);
        while (true) { // Добавили бесконечный цикл — теперь не страшно ошибаться много раз
            System.out.println("Расходы за какой день вы хотите проверить. Выберите значение от 0 (пн) до 6 (вс).");

            // Считайте ввод пользователя из консоли и сохраните в переменной index
            int index = scanner.nextInt();

            // Проверьте, не допущена ли ошибка
            if (index < 0){
                System.out.println ("Выбрано неверное значение! Минимальное значение - 0");
            }
            // Если значение меньше нуля,
            // напечатайте "Выбрано неверное значение! Минимальное значение - 0"
            else if (index >= expenses.length) {
                System.out.println ("Выбрано неверное значение! Максимальное значение - " + (expenses.length - 1));
            }
            // Если выбрано значение больше длины массива или равное ей,
            // напечатайте "Выбрано неверное значение! Максимальное значение - " + ...

            // Если пользователь ввёл корректный индекс,
            // то программа должна вывести значение нужного элемента и завершить работу (прервать цикл)
            else {
                System.out.println("Потрачено " + expenses[index] + " рублей");
                break;
            }
        }
    }

}