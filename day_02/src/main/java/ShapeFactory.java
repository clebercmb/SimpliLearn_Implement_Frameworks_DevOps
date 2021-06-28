public class ShapeFactory {

    public Shape getShape(ShapeType shapeType) {
        if(shapeType == ShapeType.RECTANGLE){
            return new Rectangle();
        } else if (shapeType == ShapeType.CIRCLE) {
            return new Circle();
        } else  {
            return null;
        }
    }
}
