package prob6;

public class RectTriangle extends Shape implements Resizeable {
	private double width;
	private double height;

	public RectTriangle(double width,double height)
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
		return height*width/2;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return height+width+(Math.sqrt(height*height+width*width));
	}

}
