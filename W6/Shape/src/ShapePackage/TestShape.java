package ShapePackage;

public class TestShape {
	public static void main(String[] args) {
		Shape shape = new Shape("white", false);
		System.out.println(shape.toString());
		System.out.println();
		
		Circle circle = new Circle(2.5, "green", true);
		System.out.println(circle.toString() + ", perimeter " + circle.getPerimeter() + ", area = " + circle.getArea());
		System.out.println();
		
		Rectangle rectangle = new Rectangle(5.0, 7.0, "yellow", true);
		System.out.println(rectangle.toString() + ", perimeter " + rectangle.getPerimeter() + ", area = " + rectangle.getArea());
		System.out.println();
		
		Square square = new Square(4.0, "pink", true);
		System.out.println(square.toString() + ", perimeter " + square.getPerimeter() + ", area = " + square.getArea());
	}
}
