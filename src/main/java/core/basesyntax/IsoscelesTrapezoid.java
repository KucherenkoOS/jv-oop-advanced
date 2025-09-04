package core.basesyntax;

public class IsoscelesTrapezoid implements Figure {
    private final double base1;
    private final double base2;
    private final double height;
    private final Color color;


    public IsoscelesTrapezoid(double base1, double base2, double height, Color color) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
        this.color = color;
    }


    @Override
    public double getArea() {
        return ((base1 + base2) / 2) * height;
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, area: "
                + getArea()
                + ", base one: "
                + base1
                + ",base two: "
                + base2
                + ", height: "
                + height
                + ", color: "
                + color.name().toLowerCase();
    }
}
