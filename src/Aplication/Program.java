package Aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		double[] vecto = new double[n];
		
		for(int i=0;i<n;i++) {
			vecto[i]=sc.nextDouble();
			
		}
		
		double sum =0;
		
		for (int i= 0; i<n;i=i+1) {
			sum= sum+vecto[i];
		}
		
		double avg = sum/n;
		System.out.printf("AVERAGE HEIGHT = %.2f",avg);
	}

}
