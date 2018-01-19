package AssertTrue;

import static org.junit.Assert.*;

import org.junit.Test;

public class ImparTest {

	@Test
	public void test() {
		Impar i = new Impar();  
		assertTrue(i.impar(7));
	}

	

}
