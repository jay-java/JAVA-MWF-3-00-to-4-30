package core;

import java.util.Scanner;

class ABC{
	public void call() {
		System.out.println("call function in abc class");
	}
}
public class P003_UserInput {
	public static void main(String[] args) {
		System.out.println("main function");
		ABC obj = new ABC();
		obj.call();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println(a);
		System.out.println("enter double value : ");
		double d = sc.nextDouble();
		System.out.println(d);
		System.out.println("enter name : ");
		String name = sc.next();
		System.out.println("name : "+name);
	}
}
