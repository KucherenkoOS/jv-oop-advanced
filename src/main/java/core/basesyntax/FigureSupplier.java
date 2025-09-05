package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final int switchCaseInt = 5;
    private final double maxDouble = 20.5;
    private final double defaultDouble = 10;
    private final Color defaultColor = Color.WHITE;

    private double getRandomDouble(double max) {
        return random.nextDouble() * max;
    }

    public Figure getRandomFigure() {
        int figureType = random.nextInt(switchCaseInt);
        switch (figureType) {
            case 0:
                return new Square(
                        getRandomDouble(maxDouble),
                        colorSupplier.getRandomColor()
                );
            case 1:
                return new Circle(
                        getRandomDouble(maxDouble),
                        colorSupplier.getRandomColor()
                );
            case 2:
                return new Rectangle(
                        getRandomDouble(maxDouble),
                        getRandomDouble(maxDouble),
                        colorSupplier.getRandomColor()
                );
            case 3:
                return new RightTriangle(
                        getRandomDouble(maxDouble),
                        getRandomDouble(maxDouble),
                        colorSupplier.getRandomColor()
                );
            case 4:
                return new IsoscelesTrapezoid(
                        getRandomDouble(maxDouble),
                        getRandomDouble(maxDouble),
                        getRandomDouble(maxDouble),
                        colorSupplier.getRandomColor()
                );
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(defaultDouble, defaultColor);
    }
}
