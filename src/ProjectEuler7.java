/**
 * 
 */

/**
 * @author 
 *
 */
public class ProjectEuler7 {
  
  private static int primeCounter = 0;

  /**
   * @param args
   */
  public static void main(String[] args) {
    long target = 2;
    while(primeCounter < 10_001) {
      if (isPrime(target)) {
        primeCounter++;
        System.out.print(primeCounter + ": ");
        System.out.println(target);
      }
      target++;
    }
  }
  
  private static boolean isPrime(long number) {
    for (long i = 2; i < number; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }

}
