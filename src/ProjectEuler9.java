/**
 * 
 */

/**
 * @author Sky Link
 *
 */
public class ProjectEuler9 {

  /**
   * @param args
   */
  public static void main(String[] args) {
    findTriplet(1000);
  }
  
  private static void findTriplet(int sumOfSides) {
    for (int a = 1; 3 * a <= sumOfSides; a++) {
      for (int b = a + 1; a + 2 * b <= sumOfSides; b++) {
        int c = sumOfSides - a - b;
        if (a * a + b * b == c * c) {
          System.out.printf("[%d, %d, %d]%n", a, b, c);
          System.out.println("Product of triplet: " + (a*b*c));
        }
      }
    }
  }

}
