package JUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;
import PGPpackage.PGPs;

public class PGPTest {

		@Test
		public void test() 
		{
			PGPs s;
			PGPs ss;
			// test 1		
			s = new PGPs("������");
			ss = new PGPs("������");
			assertEquals("error", s.Sum, ss.Sum); 
		}
	}
