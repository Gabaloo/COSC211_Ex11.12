
package ArrayListMethod;

import java.util.ArrayList;

public class ArrayListMethod {
  //Sum all double elements of an array list
  public static double sum(ArrayList<Double> list) {
    double sum = 0;
    for (int i = 0; i < list.size(); i++) {
      sum += list.get(i);
    }
    
    return sum;
  }
}
