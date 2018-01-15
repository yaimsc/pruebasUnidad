package AssertTrue;

import static org.junit.Assert.*;

import org.junit.Test;

public class ParTest {

	@Test
	public void test() {
		Par i = new Par(); 
		assertTrue(i.par(8));
	}

	

}
