package ar.edu.unlam.pb2.Disco;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiscoTest {
  
	@Test
	public void testDiscoNuevo() {
		Disco disco1 = new Disco(5.0, 3.2);
		assertNotNull(disco1);
		
	}
	
	@Test
	public void calculoPerimetroInterior() {
		Disco disco2 = new Disco(3.2, 5.0);
		Double valorEsperado = 20.09;
		Double valorObtenido = disco2.perimetroInterior(3.2);
		assertEquals(valorEsperado, valorObtenido,0.01);
	}
	
	@Test 
	public void calculoPerimetroExterior() {
		Disco disco2 = new Disco(3.2,5.0);
		Double Esperado = 31.4;
		Double valorObtenido = disco2.perimetroExterior(5.0);
		assertEquals(Esperado, valorObtenido,0.01);
		
	}
	
	@Test
	public void calculoSuperficieInterior() {
		
		Disco disco2 = new Disco(3.2, 5.0);
		Double esperado = 32.15;
		Double valorObtenido = disco2.superficieInterior(3.2);
		assertEquals(esperado, valorObtenido, 0.01);
		
	}
	
	@Test
	public void calculoSuperficieExterior() {
		
		Disco disco2 = new Disco(3.2, 5.0);
		Double esperado = 78.5;
		Double valorObtenido = disco2.superficieExterior(5.0);
		assertEquals(esperado, valorObtenido, 0.01);
		
	}
    
	@Test 
	public void calculoSuperficieTotal() {
		
		Disco disco2 = new Disco(3.2, 5.0);
		Double esperado = 110.65;
		Double valorObtenido = disco2.superficieTotal(3.2, 5.0);
		assertEquals(esperado, valorObtenido,0.01);
	}
	
	@Test
	public void cambioDeRadioInteriorConSet() {
		Disco disco2 = new Disco(3.2,5.0);
		Double esperado= 4.2;
		Double cambioRadio= disco2.setRadioInterior(4.2);
		assertEquals(esperado, cambioRadio, 0.01);
		
	}
	
	@Test
	public void cambioRadioInterior() {
		Disco disco2 = new Disco(3.2,5.0);
		assertEquals(4.2, disco2.cambiarRadioInterior(4.2),0.01);
	}
	
	
	@Test
	
	public void cambioDeRadioExteriorConSet() {
		Disco disco2= new Disco(3.2, 5.0);
		Double esperado = 6.0;
		Double cambioRadioexterior = disco2.setRadioExterior(6.0);
		assertEquals(esperado, cambioRadioexterior, 0.01);
	}
	
	@Test
	public void cambioRadioexterior() {
		Disco disco2 = new Disco(3.2,5.0);
		assertEquals( 6.0, disco2.cambiarRadioExterior(6.0),0.01);
	}
	
}
	
	
