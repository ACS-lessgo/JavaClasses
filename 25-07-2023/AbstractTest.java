
public class AbstractTest
{
	public static void main(String[] args) {
		Rectangle r1=new Rectangle(10.5f, 11.3f);
		r1.calcArea();
		r1.calcPerimeter();
	}
}

abstract class GeometricShapes 
{
	abstract void calcArea();
	abstract void calcPerimeter();
}

class Rectangle extends GeometricShapes
{
	
	private float length;
	private float breadth;
	float area;
	float perimeter;
	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	
	void calcArea()
	{
		area=length*breadth;
		System.out.println("Area is: "+area);
	}
	
	void calcPerimeter()
	{
		perimeter = 2*(length*breadth);
		System.out.println("Perimeter is: "+perimeter);
	}
}

