package core.basesyntax;

public class Square implements Figure {
    private final double side;
    private final Color color;

    public Square(double side, Color color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: square, area: "
                + getArea()
                + ", side: "
                + side
                + ", color: "
                + color.name().toLowerCase();
    }
}
