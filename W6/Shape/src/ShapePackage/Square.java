package ShapePackage;

public class Square extends Rectangle {
	public Square(){
		super();
	}
	
	public Square(double side){
		super(side, side);
	}
	
	public Square(double side, String color, boolean filled){
		super(side, side, color, filled);
	}
	
	@Override
	public void setWidth(double side) {
		super.setWidth(side);
		setLength(side);
	}
	@Override
	public void setLength(double side) {
		super.setLength(side);
		setWidth(side);
	}
	@Override
	public double getArea() {

			return super.getLength() * super.getWidth();
	}
	@Override
	public double getPerimeter() {
		return 4 * super.getLength();
	}
	@Override
	public String toString() {
		return "A Square with side = " + super.getLength() 
				+ ", which is subclass of " + super.toString();
	}
}
