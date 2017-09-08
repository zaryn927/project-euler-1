/**
 * 
 */

/**
 * @author Sky Link
 *
 */
public class ProjectEuler3 {
  
  private static long target = 600_851_475_143L;
  private static final long TARG_ROOT = (long) Math.ceil(Math.sqrt(target));
  /**
   * @param args
   */
  public static void main(String[] args) {
    for (long i = 2; i < TARG_ROOT; i++) {
      if (target % i == 0) {
        target /= i;
        if ( target == 1 || target == i) {
          System.out.println(i);
        }
      }
    }

  }
  

}
