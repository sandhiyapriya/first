package testngpac;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TEST4 {
  @Test
  public void enter() {
	  SoftAssert sa=new SoftAssert();
	  System.out.println("1st check");
	  sa.assertEquals("a", "a");
	  System.out.println("2nd check");
	  sa.assertEquals("5", "5");
	  System.out.println("3rd check");
	  sa.assertEquals("hello","hello","same" );
	  sa.assertAll();
  }
  
  
}
