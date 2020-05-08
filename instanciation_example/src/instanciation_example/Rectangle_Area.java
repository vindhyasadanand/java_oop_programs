package instanciation_example;
class Rectangle
{
	private int length;
	private int width;
	void getdata(int x,int y)
	{
		this.length = x;
		this.width = y;
	}
	int rectArea()
	{
		return (length*width);
	}
	
}

public class Rectangle_Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect1 = new Rectangle();
		rect1.getdata(4, 5);
		int area1 =rect1.rectArea();
		System.out.println( "area =" + area1);
		

	}

}
