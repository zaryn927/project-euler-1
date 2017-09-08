/**
 * 
 */

/**
 * @author Sky Link
 *
 */
public class ProjectEuler4 {
  
  private static int largestPalindrome = 0;

  /**
   * @param args
   */
  public static void main(String[] args) {
    int product = 0;
    for (int i = 0; i < 1000; i++) {
      for (int j  = 0; j < 1000; j++) {
        product = i * j;
        if (isPalindrome(product) && product > largestPalindrome) {
          largestPalindrome = product;
        }
      }
    }
    System.out.println(largestPalindrome);
  }
  
  private static boolean isPalindrome(Integer number) {
    String original = number.toString();
    StringBuilder builder = new StringBuilder(original);   
    String reverse = builder.reverse().toString();
    return original.equals(reverse) ? true : false;
  }

}
