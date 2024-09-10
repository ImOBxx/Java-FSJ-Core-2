
public class HRATADA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float bs = 18000;
		float ta, hra, ts;
		hra = (float) (0.45 * bs);
		ta = (float) (0.40 * bs);
		ts = hra + ta + bs;
		System.out.println("Total Salary: " + ts);
		

	}

}
