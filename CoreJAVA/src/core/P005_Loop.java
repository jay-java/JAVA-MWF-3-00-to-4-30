package core;

public class P005_Loop {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("i = " + i);
		}
		int j = 1;
		while (j <= 5) {
			System.out.println(" j = " + j);
			j++;
		}
		int k =1;
		do {
			System.out.println("k = "+k);
			k++;
		}
		while(k<=5);
	}
}
