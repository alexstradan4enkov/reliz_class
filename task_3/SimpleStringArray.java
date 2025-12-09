public class SimpleStringArray {
    private String[] strings;
    private int count;

    public SimpleStringArray(int maxSize) {
        strings = new String[maxSize];
        count = 0;
    }

    // Добавляем строку в правильное место по длине
    public void add(String newString) {
        if (newString == null) {
            System.out.println("Нельзя добавить null");
            return;
        }

        if (count >= strings.length) {
            System.out.println("Массив полон! Не добавили: " + newString);
            return;
        }

        // Находим куда вставить
        int insertIndex = 0;
        while (insertIndex < count && strings[insertIndex].length() < newString.length()) {
            insertIndex++;
        }

        // Сдвигаем элементы
        for (int i = count; i > insertIndex; i--) {
            strings[i] = strings[i - 1];
        }

        // Вставляем новую строку
        strings[insertIndex] = newString;
        count++;
    }

    // Самая длинная строка
    public String getLongest() {
        if (count == 0) {
            return "Массив пустой";
        }
        return strings[count - 1]; // Последняя самая длинная
    }

    // Средняя длина
    public double getAverage() {
        if (count == 0) {
            return 0;
        }

        int total = 0;
        for (int i = 0; i < count; i++) {
            total += strings[i].length();
        }

        return (double) total / count;
    }

    // Показать все строки
    public void showAll() {
        System.out.print("Строки в порядке длины: ");
        for (int i = 0; i < count; i++) {
            System.out.print(strings[i]);
            if (i < count - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    // Сколько строк сейчас
    public int getCount() {
        return count;
    }
}
