package core;

public class P002_TypeCasting {
	public static void main(String[] args) {
		int a = 10, b = 3;
		double c = (double) a / (double) b;
		System.out.println(c);
		double d = 3;
		System.out.println(d);
		int i=(int)3.14;
		System.out.println(i);
		
		a++;//a = a+1
		System.out.println(a);
		int w = a++;
		System.out.println(w);
		System.out.println(a);
		
		
		int k = -10;
		k += 13;
		System.out.println(k);
	}
}
