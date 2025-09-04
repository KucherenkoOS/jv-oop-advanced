package core.basesyntax;


public class Main {
    public static void main(String[] args) {
        int numberOfFigures = 6;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[numberOfFigures];
        for (int i = 0; i < numberOfFigures / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = numberOfFigures / 2; i < numberOfFigures; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            System.out.println(figure.draw());
        }
    }
}
