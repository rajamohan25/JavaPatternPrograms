// Enter number: 7
// *             * * * * * * *                *    * * * * * * * 
// * *             * * * * * *              * *    * * * * * *   
// * * *             * * * * *            * * *    * * * * *     
// * * * *             * * * *          * * * *    * * * *       
// * * * * *             * * *        * * * * *    * * *         
// * * * * * *             * *      * * * * * *    * *           
// * * * * * * *             *    * * * * * * *    *             

import java.util.Scanner;

public class MirroredTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i>=j) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			for(int j=0;j<n;j++) {
				if(i<=j) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i+j>=n-1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i+j<=n-1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
