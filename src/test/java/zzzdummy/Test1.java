package zzzdummy;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class Test1 {
	
	@Test
  public void SampleHello()
  {
	  Reporter.log("This is sample Hello prg",true);
	  Reporter.log("This is second line ",true);
  }
}
