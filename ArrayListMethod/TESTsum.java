package ArrayListMethod;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TESTsum {

  @Test
  void test() {
    ArrayList<Double> list = new ArrayList<Double>();
    Scanner userIn = new Scanner(System.in);
    double sumExpected = 0;
    double next;
    
    System.out.println("Please enter 5 numbers: ");
    for(int i = 0; i < 5; i++) {
      next = userIn.nextDouble();
      list.add(next);
      sumExpected += next;
      
    }
    double sumActual = ArrayListMethod.sum(list);
    System.out.println("Expected: " + sumExpected);
    System.out.println("Actual: " + sumActual);
    
    Assert.assertTrue(sumActual == sumExpected);
        
  }

}
