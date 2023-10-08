package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Empleado;

class EmpleadoTest {
	public enum TipoEmpleado{Vendedor, Encargado, Otro};
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each");
	}

	@Test
	void testCalculoNominarutaEncargado() {
		float expected = 2500 + 200 + 300;
		float actual = Empleado.calculoNominaruta(TipoEmpleado.Encargado, 1700.0,10.0);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominarutaVendedor() {
		float expected = 2000 + 200 + 300;
		float actual = Empleado.calculoNominaruta(TipoEmpleado.Vendedor, 1700.0,10.0);
		assertEquals(expected, actual);
	}

	@Test
	void testCalculoNominarutaOtro() {
		float expected = 0 + 200 + 300;
		float actual = Empleado.calculoNominaruta(TipoEmpleado.Otro, 1700.0,10.0);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominarutaVentasMesNegativas() {
		float expected = 2500 + 0 + 300;
		float actual = Empleado.calculoNominaruta(TipoEmpleado.Encargado, -1700.0,10.0);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominarutaVentasMesMenorMil() {
		float expected = 2500 + 0 + 300;
		float actual = Empleado.calculoNominaruta(TipoEmpleado.Encargado, 200.0,10.0);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominarutaVentasMesEntreMilyMilquinientos() {
		float expected = 2500 + 100 + 300;
		float actual = Empleado.calculoNominaruta(TipoEmpleado.Encargado, 1200.0,10.0);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominarutaVentasMesMayorMilquinientos() {
		float expected = 2500 + 200 + 300;
		float actual = Empleado.calculoNominaruta(TipoEmpleado.Encargado, 2300.0,10.0);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaNeta() {
		float expected = (float) (3000 * (1-0.18));
		float actual = Empleado.calculoNominaNeta(3000);
		assertEquals(expected, actual);
	}

}
