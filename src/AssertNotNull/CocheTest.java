package AssertNotNull;

import static org.junit.Assert.*;

import org.junit.Test;

public class CocheTest {

	@Test
	public void test() {
		Coche coche = new Coche(); 
		assertNotNull(coche.crearAñadir());
	}

}
