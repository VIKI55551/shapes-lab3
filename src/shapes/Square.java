package shapes;

/**
 * Класс Square представляет квадрат, унаследованный от Rectangle.
 */
public class Square extends Rectangle {
    /**
     * Конструктор квадрата.
     * @param side длина стороны квадрата
     */
    public Square(double side) {
        super(side, side);
    }
}
