package shapes;

/**
 * Класс Rectangle представляет прямоугольник с заданной шириной и высотой.
 */
public class Rectangle extends Figure {
    private double width;
    private double height;

    /**
     * Конструктор для прямоугольника.
     * @param width ширина прямоугольника
     * @param height высота прямоугольника
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Вычисляет площадь прямоугольника.
     * @return площадь прямоугольника
     */
    @Override
    public double getArea() {
        return width * height;
    }
}
