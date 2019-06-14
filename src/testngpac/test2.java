package testngpac;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class test2 {
  @Test(dataProvider = "signin")
  public void f(String n, String s) {
	  System.out.println("username:"+n+"\npassword\t"+s);
  }

  @DataProvider
  public Object[][] signin() {
    return new Object[][] {
      new Object[] { "priya", "sandy" },
      new Object[] { "nivas", "nivi" },
    };
  }
}
