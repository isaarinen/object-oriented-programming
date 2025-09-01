public class ShapeCalculator {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5, "Red");
        shapes[1] = new Rectangle(4, 6, "Blue");
        shapes[2] = new Triangle(3, 7, "Green");

        for (Shape shape : shapes) {
            System.out.println(
                    shape.getName() + " area: " + shape.calculateArea() +
                            ", color: " + shape.getColor()
            );
        }
    }
}