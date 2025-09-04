package core.basesyntax;

public class RightTriangle implements Figure {
    private final double firstLeg;
    private final double secondLeg;
    private final Color color;

    public RightTriangle(double firstLeg, double secondLeg, Color color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }


    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public String draw() {
        return "Figure: right triangle, area: "
                + getArea()
                + ", first leg: "
                + firstLeg
                + ",second leg: "
                + secondLeg
                + ", color: "
                + color.name().toLowerCase();
    }
}
