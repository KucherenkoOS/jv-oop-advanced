package core.basesyntax;

public class Circle implements Figure {
    private final double radius;
    private final Color color;

    public Circle(double radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return "Figure: circle, area: "
                + getArea()
                + ", radius: "
                + radius
                + ", color: "
                + color.name().toLowerCase();
    }
}
