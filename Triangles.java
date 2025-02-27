// Enter number: 7
//       *              * * * * * * * 
//      * *              * * * * * *
//     * * *              * * * * *
//    * * * *              * * * *
//   * * * * *              * * *
//  * * * * * *              * *
// * * * * * * *              *

// Note:This will not print side by side

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<n-i;j++) {
				System.out.print("* ");
			}
		System.out.println();
		}
	}
}
