/**
 * 
 */

/**
 * @author Sky Link
 *
 */
public class ProjectEuler5 {
  
  private static final int RANGE_END = 20;

  /**
   * @param args
   */
  public static void main(String[] args) {
    boolean found = false;
    long numOfInterest = 20;
    while(!found) {
      int sum = 0;
      for(int i = 1; i <= RANGE_END; i++) {
        sum += (numOfInterest % i);
      }
      if(sum == 0) {
        found = true;
        System.out.println(numOfInterest);
      }else {
        numOfInterest += 20;
      }
    }
  }

}
