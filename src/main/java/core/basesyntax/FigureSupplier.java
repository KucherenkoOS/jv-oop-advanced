package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private double getRandomDouble(double max) {
        return random.nextDouble() * max;
    }

    public Figure getRandomFigure() {
        final double MAX_DOUBLE = 20.5;
        int figureType = random.nextInt(5);
        switch (figureType) {
            case 0: return new Square(getRandomDouble(MAX_DOUBLE), colorSupplier.getRandomColor());
            case 1: return new Circle(getRandomDouble(MAX_DOUBLE), colorSupplier.getRandomColor());
            case 2: return new Rectangle(getRandomDouble(MAX_DOUBLE), getRandomDouble(MAX_DOUBLE), colorSupplier.getRandomColor());
            case 3: return new RightTriangle(getRandomDouble(MAX_DOUBLE), getRandomDouble(MAX_DOUBLE), colorSupplier.getRandomColor());
            case 4: return new IsoscelesTrapezoid(getRandomDouble(MAX_DOUBLE), getRandomDouble(MAX_DOUBLE), getRandomDouble(MAX_DOUBLE), colorSupplier.getRandomColor());
            default: return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }
}
