package es.upm.grise.profundizacion2019.ex3;

import org.junit.Before;
import org.junit.Test;

public class smokeTest {
	MyClass my;
	
	@Before
	public void setUp() {
		my = new MyClass();
	}

	@Test
	public void smoleTest() {
		long SECONDS = 60;
		my.nextTime(SECONDS);
	}
}
