package shapes;

/**
 * Класс Circle представляет круг с заданным радиусом.
 */
public class Circle extends Figure {
    private double radius;

    /**
     * Конструктор для круга.
     * @param radius радиус круга
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Вычисляет площадь круга.
     * @return площадь круга
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
