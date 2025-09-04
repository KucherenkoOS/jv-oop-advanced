package core.basesyntax;

public class Rectangle implements Figure {
    private final double width;
    private final double height;
    private final Color color;


    public Rectangle(double width, double height, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }


    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String draw() {
        return "Figure: rectangle, area: "
                + getArea()
                + ", widht: "
                + width
                + ",height: "
                + height
                + ", color: "
                + color.name().toLowerCase();
    }
}
