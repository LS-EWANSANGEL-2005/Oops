package oops;

public class ParameterAdd {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println(add(a,b));
        System.out.println(sub(a,b));
        System.out.println(mul(a,b));
        System.out.println(div(a,b));
	}
    public static int add(int c,int d) {
    	return c+d;
    }
    public static int sub(int c,int d) {
    	return c-d;
    }
    public static int mul(int c,int d) {
    	return c*d; 	
    }
    public static int div(int c,int d) {
    	return c/d;
    } 
}
