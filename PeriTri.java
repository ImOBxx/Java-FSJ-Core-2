

class Triangle
{

	
	private double a1;
	private double a2;
	private double a3;
	
	
	public Triangle()
	{
		this.a1 = 3;
		this.a2 = 4;
		this.a3 = 5;
		
	}
	
	double peri()
	{
		return a1 + a2 + a3;
	}
	
	double area()
	{
		 double s = (a1 + a2 + a3) / 2.0; // Semi-perimeter
	        return Math.sqrt(s * (s - a1) * (s - a2) * (s - a3));
	}
}



public class PeriTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t = new Triangle();
		int perim = (int) t.peri();
		double area = t.area();
		 System.out.println("Perimeter of the triangle: " + perim);
	        System.out.println("Area of the triangle: " + area);
		

	}

}
