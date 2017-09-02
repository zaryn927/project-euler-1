import java.math.BigInteger;
import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Sky Link
 *
 */
public class ProjectEuler2 {
  
  private static ArrayList<Integer> list = new ArrayList<>();

  /**
   * @param args
   */
  public static void main(String[] args) {
    list.add(0);
    list.add(1);
    int result = 0;
    int index = 0;
    int sum = 0;
    while(result < 4_000_000) {
      result = list.get(index) + list.get(++index);
      list.add(result);
      if (result % 2 == 0) {
        sum += result;
      }
    }
    System.out.println(sum);
  }

}
