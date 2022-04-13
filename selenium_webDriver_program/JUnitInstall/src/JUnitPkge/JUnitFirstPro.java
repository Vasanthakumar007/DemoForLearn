package JUnitPkge;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitFirstPro {
@Before	
	public void bef() {
	    System.out.println("in before");
   }
@Test
   public void srt() {
	   System.out.println("checking 1");
   }
@Test
   public void scd() {
	   System.out.println("checking 2");
   }
@Test
public void td() {
	   System.out.println("checking 3");
}
@After
	public void aft() {
	   System.out.println("in after");
    }
   
}


