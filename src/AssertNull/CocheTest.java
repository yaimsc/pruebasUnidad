package AssertNull;

import static org.junit.Assert.*;

import org.junit.Test;

public class CocheTest {

	@Test
	public void test() {
		Coche coche = new Coche(); 
		assertNull(coche.crearAñadir());
	}

}
