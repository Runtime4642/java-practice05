package prob6;

public class Rectangle extends Shape  {

	private double width;
	private double height;
	public Rectangle(double width,double height)
	{
		this.height=height;
		this.width=width;
	}
	@Override
	public void resize(double s) {
		// TODO Auto-generated method stub
		width = width*s;
		height = height *s;
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return height*width;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return (height+width)*2;
	}

}
