package _02_gotta_catchem_all;

public class ExceptionMethods {
	public double divide(double x, double y){
		if(y == 0.0) {
			throw new IllegalArgumentException();
		}
		return x/y;
	}
	public String reverseString(String a){
		String reverse = "";
		if(a == "") {
			throw new IllegalStateException();
		}
		for (int i = a.length()-1; i > -1; i--) {
			reverse += a.charAt(i);
		}
		//System.out.println(reverse);
		return reverse;
		
	}
}
