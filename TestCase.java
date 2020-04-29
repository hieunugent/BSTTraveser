import org.junit.Test;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.*;

public class TestCase{
  static BSTTraveser.BST test1;
  //static BSTTraveser.BST test2;
  static{
    test1 = new BSTTraveser.BST(5);
    // test1.insert(4).insert(6).insert(8);
  }

  @Test
  public void Testcase1(){
    List<Integer> expected = new ArrayList<Integer>(Arrays.asList(5));
    List<Integer> actual = new ArrayList<Integer>();
    System.out.println("expected  : "  + expected );
    System.out.println("actual : " + actual);
  //  assertTrue(true);
    actual = BSTTraveser.inOrderTraveser(this.test1, actual);
    System.out.println("actual : " + actual);
      assertTrue(this.compare(expected,actual));
  }
  private boolean compare(List<Integer> arr1, List<Integer> arr2){
      if (arr1.size() != arr2.size()){
        return false;
      }
      for (int i = 0 ; i < arr1.size(); i++){
        if(!arr1.get(i).equals(arr2.get(i))){
          return false;
        }
      }
      return true;
    }

}
