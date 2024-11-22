public class CalcPi {
	public static void main(String [] args) { 
		int num = Integer.parseInt(args[0]);
		double pai = 0.0;
		for(int i = 0 ; i < num ; i++)
		{
			double numAtI = Math.pow(-1 , 1) / (2.0 * i + 1);
			pai+= numAtI;
		}
		pai *= 4;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + pai);
	}
}
