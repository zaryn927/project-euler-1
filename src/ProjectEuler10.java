import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Sky Link
 *
 */
public class ProjectEuler10 {
  
  private static final int UPPER_BOUND = 2_000_000;
  /**
   * @param args
   */
  public static void main(String[] args) {
    sieveOfEratosthenes(UPPER_BOUND);
  }
  
  private static void sieveOfEratosthenes(int upperBound) {
    ArrayList<Boolean> sieve = new ArrayList<>();
    for(int i = 2; i <= upperBound; i++) {
      sieve.add(true);
    }
    for(int i = 2; i <= Math.sqrt(upperBound); i++) {
      if(sieve.get(i) == true) {
        int coefficient = 0;
        for(int j = i*i + coefficient * i; j < upperBound - 1; j = i*i + coefficient * i) {
          sieve.set(j , false);
          coefficient++;
        }
      }
    }
    long sumOfPrimes = 0;
    for(int i = 2; i < upperBound - 1; i++) {
      if(sieve.get(i) == true) {
        System.out.println(i);
        sumOfPrimes += i;
      }
    }
    System.out.println(sumOfPrimes);
  }

}
