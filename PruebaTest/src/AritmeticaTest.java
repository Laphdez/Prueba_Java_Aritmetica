import junit.framework.TestCase;

public class AritmeticaTest extends TestCase {

	public final void testSuma() {
		System.out.println("Sumando dos números");
		Aritmetica S = new Aritmetica();
		assertTrue(S.suma(2, 3) == 5);
		// TODO
	}

	public final void testResta() {
		System.out.println("Restando dos números");
		Aritmetica S = new Aritmetica();
		assertTrue(S.resta(2, 3) == -1);
		// TODO
	}

	public final void testMultiplicacion() {
		System.out.println("Multiplicando dos números");
		Aritmetica S = new Aritmetica();
		assertTrue(S.multiplicacion(2, 3) == 6);
		// TODO
	}

	public final void testDivision() {
		System.out.println("Dividiendo dos números");
		Aritmetica S = new Aritmetica();
		assertTrue(S.division(10, 2) == 5);
		// TODO
	}

}
