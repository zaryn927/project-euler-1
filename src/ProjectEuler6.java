/**
 * 
 */

/**
 * @author Sky Link
 *
 */
public class ProjectEuler6 {

  /**
   * @param args
   */
  public static void main(String[] args) {
    int squaresSummed = sumOfSquares(100);
    int sumSquared = squareOfSum(100);
    System.out.println(sumSquared - squaresSummed);
  }
  
  private static int sumOfSquares(int upperBound) {
    int sum = 0;
    for(int i = 1; i <= upperBound; i++) {
      sum += Math.pow(i, 2);
    }
//    System.out.println(sum);
    return sum;
  }
  
  private static int squareOfSum(int upperBound) {
    int sum = 0;
    for(int i = 1; i <= upperBound; i++) {
      sum += i;
    }
    sum = (int) Math.pow(sum, 2);
//    System.out.println(sum);
    return sum;
  }

}
