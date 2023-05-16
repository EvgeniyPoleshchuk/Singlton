import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка :");
        int arraySize = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений :");
        int max = scanner.nextInt();
        logger.log(" Создаём и наполняем список");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arraySize; i++) {
            list.add(random.nextInt(0, max));
        }
        System.out.print("Вот случайный список: ");
        list.forEach(value -> System.out.print(value + " "));
        System.out.println();
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра: ");
        int maxNum = scanner.nextInt();
        logger.log("Запускаю фильтрацию");
        Filter filter = new Filter(maxNum);
        List<Integer> a = filter.filterOut(list);
        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список: ");
        a.forEach(value -> System.out.print(value + " "));
        System.out.println();
        logger.log("Завершаем программу");


    }
}
