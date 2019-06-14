package testngpac;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test3 {
	String expected="hello baby";
  @Test
  public void login() {
	  Assert.assertEquals("Hello baby", expected);
  }
  

  
}
