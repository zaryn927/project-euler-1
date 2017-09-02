/**
 * 
 */

/**
 * @author Sky Link
 *
 */
public class ProjectEuler1 {
  
  private static int UPPER_LIMIT;
  
  public ProjectEuler1(int upperLimit) {
    UPPER_LIMIT = upperLimit;
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    new ProjectEuler1(1000);
    int sum = 0;
    for (int i = 0; i < UPPER_LIMIT; i++) {
      if ((i % 3 == 0) || (i % 5 == 0)) {
        sum += i;
      }
    }
    System.out.println(sum);
  }

}
