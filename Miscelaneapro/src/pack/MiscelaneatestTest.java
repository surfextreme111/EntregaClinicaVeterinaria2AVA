package pack;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MiscelaneatestTest {
	

	private Miscelaneatest instance;
	private int expResult;
	private int result;
	private double c,z,w;
	private int a,b,f,g,h,i;
	private int[]arr= {8,9,1,10,3,13};
	private String uno,dos,resultado,resultespe;
	private boolean boole1,boole2,boole3;

	@BeforeEach
	public void setUp(){
	instance = new Miscelaneatest();
	}
	
	@Test
	void testSuma() {

		 int a = 33;
		 int b = 40;
		 expResult=73;
		 result=instance.suma(a, b);
		 assertEquals(expResult,result,"iwales");
		
	}

	@Test
	void testGeneraAleatorioEntre() {
		fail("Not yet implemented");
	}

	@Test
	void testConcatena() {
		fail("Not yet implemented");
	}

	@Test
	void testGetMayor() {
		fail("Not yet implemented");
	}

	@Test
	void testGetMaximo() {
		fail("Not yet implemented");
	}

	@Test
	void testGetElemento() {
		fail("Not yet implemented");
	}

	@Test
	void testFactorial() {
		fail("Not yet implemented");
	}

	@Test
	void testEsPrimo() {
		fail("Not yet implemented");
	}

	@Test
	void testAreaCirculo() {
		fail("Not yet implemented");
	}

	@Test
	void testAreaTriangulo() {
		fail("Not yet implemented");
	}

	@Test
	void testAreaCuadrado() {
		fail("Not yet implemented");
	}

	@Test
	void testDecimalABinario() {
		fail("Not yet implemented");
	}

}
