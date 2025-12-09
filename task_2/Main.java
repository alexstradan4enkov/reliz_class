public class Main {
    public static void main(String[] args) {
        // Пример с корректными фигурами
        try {
            Rectangle rect = new Rectangle(5, 10);
            System.out.println("Прямоугольник:");
            System.out.println("Площадь: " + rect.getArea());
            System.out.println("Периметр: " + rect.getPerimeter());

            System.out.println();

            Circle circle = new Circle(7);
            System.out.println("Круг:");
            System.out.println("Площадь: " + circle.getArea());
            System.out.println("Периметр: " + circle.getPerimeter());

            System.out.println();

            Triangle triangle = new Triangle(3, 4, 5);
            System.out.println("Треугольник:");
            System.out.println("Площадь: " + triangle.getArea());
            System.out.println("Периметр: " + triangle.getPerimeter());

        } catch (RuntimeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Примеры с ошибками
        System.out.println("\n--- Примеры с ошибками ---");

        try {
            new Rectangle(-5, 10);
        } catch (RuntimeException e) {
            System.out.println("Rectangle error: " + e.getMessage());
        }

        try {
            new Circle(0);
        } catch (RuntimeException e) {
            System.out.println("Circle error: " + e.getMessage());
        }

        try {
            new Triangle(1, 1, 3); // Неправильный треугольник
        } catch (RuntimeException e) {
            System.out.println("Triangle error: " + e.getMessage());
        }
    }
}
