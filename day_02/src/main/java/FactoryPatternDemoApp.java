public class FactoryPatternDemoApp {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape s1 = factory.getShape(ShapeType.RECTANGLE);
        Shape s2 = factory.getShape(ShapeType.CIRCLE);

        s1.draw();
        s2.draw();
    }
}
