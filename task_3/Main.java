public class Main {
    public static void main(String[] args) {
        // Создаем массив на 8 строк
        SimpleStringArray myArray = new SimpleStringArray(8);

        System.out.println("=== Простой пример работы ===");

        // Добавляем простые строки
        myArray.add("привет");
        myArray.add("с++");
        myArray.add("код");
        myArray.add("на");
        myArray.add("Java");

        System.out.println("Добавили 5 строк:");
        myArray.showAll();
        System.out.println("Самая длинная: " + myArray.getLongest());
        System.out.println("Средняя длина: " + myArray.getAverage());
        System.out.println("Всего строк: " + myArray.getCount());

        System.out.println("\nДобавляем еще:");
        myArray.add("дом");
        myArray.add("java");
        myArray.add("солнце");

        System.out.println("\nПосле добавления 3х строк:");
        myArray.showAll();
        System.out.println("Самая длинная: " + myArray.getLongest());
        System.out.println("Средняя длина: " + myArray.getAverage());
        System.out.println("Всего строк: " + myArray.getCount());

        System.out.println("\n=== Еще пример ===");
        SimpleStringArray array2 = new SimpleStringArray(5);

        // Добавляем в другом порядке
        array2.add("кот");
        array2.add("собака");
        array2.add("птица");
        array2.add("слон");

        array2.showAll();
        System.out.println("Самая длинная: " + array2.getLongest());
        System.out.println("Средняя длина: " + array2.getAverage());

        System.out.println("\n=== Проверка ошибок ===");

        // Массив на 3 эл
        SimpleStringArray small = new SimpleStringArray(3);
        small.add("раз");
        small.add("два");
        small.add("три");
        small.add("четыре"); // Не влезет

        small.showAll();

        // Пустой массив
        SimpleStringArray empty = new SimpleStringArray(2);
        System.out.println("Пустой массив:");
        System.out.println("Самая длинная: " + empty.getLongest());
        System.out.println("Средняя длина: " + empty.getAverage());
    }
}
