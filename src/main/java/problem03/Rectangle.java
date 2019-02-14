package problem03;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
//		System.out.println("");
		this.width = width;
		this.height = height;
	}

	@Override
	public void resize(double rate) {
		width = width*rate;
		height = height*rate;
	}

	@Override
	public double getArea() {
		return width*height;
	}

	@Override
	public double getPerimeter() {
		return 2*(width+height);
	}
}