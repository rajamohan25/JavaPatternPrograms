// Sample Output
// Enter n value for n x n pattern: 7
// * * * * * * * 
// * * * * * * * 
// * * * * * * * 
// * * * * * * * 
// * * * * * * * 
// * * * * * * * 
// * * * * * * * 

import java.util.Scanner;

public class SimpleStarPattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n value for n x n pattern: ");
		int num = sc.nextInt();
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(true)
					System.out.print("* ");
			}
			System.out.println();
		}
	}
}
