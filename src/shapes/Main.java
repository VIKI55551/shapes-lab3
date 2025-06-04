package shapes;

import java.util.Scanner;

/**
 * Класс Main содержит точку входа и демонстрирует работу с фигурами.
 */
public class Main {
    /**
     * Главный метод программы.
     * Считывает параметры фигур с консоли и выводит площадь.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите радиус круга:");
        double r = scanner.nextDouble();
        Figure circle = new Circle(r);
        System.out.println("Площадь круга: " + circle.getArea());

        System.out.println("Введите ширину и высоту прямоугольника:");
        double w = scanner.nextDouble();
        double h = scanner.nextDouble();
        Figure rectangle = new Rectangle(w, h);
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());

        System.out.println("Введите длину стороны квадрата:");
        double s = scanner.nextDouble();
        Figure square = new Square(s);
        System.out.println("Площадь квадрата: " + square.getArea());

        scanner.close();
    }
}
