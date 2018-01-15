package AssertFalse;

import static org.junit.Assert.*;

import org.junit.Test;

public class ImparTest {

	@Test
	public void test() {
		Impar i = new Impar(); 
		assertFalse(i.impar(5));
	}

}
