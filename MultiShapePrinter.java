//  Enter number: 15
//  * * * * * * * * * * * * * * *    * * * * * * * * * * * * * * *    * * * * * * * * * * * * * * *                  *               
//  * *         * * *         * *    * * * * * *   *   * * * * * *    * * * * * * *   * * * * * * *                * * *             
//  *   *     *   *   *     *   *    * * * * *     *     * * * * *    * * * * * *       * * * * * *              * * * * *           
//  *     * *     *     * *     *    * * * *       *       * * * *    * * * * *           * * * * *            * * * * * * *         
//  *     * *     *     * *     *    * * *   *     *     *   * * *    * * * *               * * * *          * * * * * * * * *       
//  *   *     *   *   *     *   *    * *       *   *   *       * *    * * *                   * * *        * * * * * * * * * * *     
//  * *         * * *         * *    *           * * *           *    * *                       * *      * * * * * * * * * * * * *   
//  * * * * * * * * * * * * * * *    * * * * * * * * * * * * * * *    *                           *    * * * * * * * * * * * * * * * 
//  * *         * * *         * *    *           * * *           *    * *                       * *      * * * * * * * * * * * * *   
//  *   *     *   *   *     *   *    * *       *   *   *       * *    * * *                   * * *        * * * * * * * * * * *     
//  *     * *     *     * *     *    * * *   *     *     *   * * *    * * * *               * * * *          * * * * * * * * *       
//  *     * *     *     * *     *    * * * *       *       * * * *    * * * * *           * * * * *            * * * * * * *         
//  *   *     *   *   *     *   *    * * * * *     *     * * * * *    * * * * * *       * * * * * *              * * * * *           
//  * *         * * *         * *    * * * * * *   *   * * * * * *    * * * * * * *   * * * * * * *                * * *             
//  * * * * * * * * * * * * * * *    * * * * * * * * * * * * * * *    * * * * * * * * * * * * * * *                  *               

public class MultiShapePrinter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j || i+j==n-1 || i==n-1 || j==n-1 || i==0 || j==0 || i==n/2 || j==n/2 || i+j==n/2 || i==j-n/2 || j==i-n/2 || i+j==n-1+n/2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i==j || i+j==n-1 || i==n-1 || j==n-1 || i==0 || j==0 || i==n/2 || j==n/2 || i+j<n/2 || i<j-n/2 || j<i-n/2 || i+j>n-1+n/2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i==n-1 || j==n-1 || i==0 || j==0 || i+j<=n/2 || i<=j-n/2 || j<=i-n/2 || i+j>=n-1+n/2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i+j<n/2 || i<j-n/2 || j<i-n/2 || i+j>n-1+n/2) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
