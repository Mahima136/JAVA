

import java.util.Scanner;

public class Factorial{
	public static void main(String[] args) {
		Scanner kbd=new Scanner(System.in);
		int n=kbd.nextInt();
		int step=0;
		while(n>0) {
			n/=10;
			step++;
		}
	}

}

