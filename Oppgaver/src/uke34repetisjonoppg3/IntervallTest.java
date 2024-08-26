package uke34repetisjonoppg3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IntervallTest {

	private IntervallImpl<Integer> intervall;
	private IntervallImpl<Double> doubleIntervall;
    private IntervallImpl<Klokkeslett> klokkeslettIntervall;


	
	@BeforeEach
	void setUp() throws Exception {
		intervall = new IntervallImpl<>(10, 20);
		doubleIntervall = new IntervallImpl<>(15.0, 25.0);
		klokkeslettIntervall = new IntervallImpl<>(new Klokkeslett(10, 0), new Klokkeslett(12, 0));
	}

	@Test
	void testVerdiErIEtIntervall() {
		assertTrue(intervall.verdiErIEtIntervall(15));
		assertTrue(intervall.verdiErIEtIntervall(10));
		assertTrue(intervall.verdiErIEtIntervall(20));
		assertFalse(intervall.verdiErIEtIntervall(5));
		assertFalse(intervall.verdiErIEtIntervall(25));
		
		assertTrue(doubleIntervall.verdiErIEtIntervall(20.0));
		assertFalse(doubleIntervall.verdiErIEtIntervall(10.0));
		
		 assertTrue(klokkeslettIntervall.verdiErIEtIntervall(new Klokkeslett(10, 30)));
        assertTrue(klokkeslettIntervall.verdiErIEtIntervall(new Klokkeslett(10, 0)));
        assertTrue(klokkeslettIntervall.verdiErIEtIntervall(new Klokkeslett(12, 0)));
        assertFalse(klokkeslettIntervall.verdiErIEtIntervall(new Klokkeslett(9, 59)));
        assertFalse(klokkeslettIntervall.verdiErIEtIntervall(new Klokkeslett(12, 1)));
	}
	
	@Test
	void testOverlappendeIntervaller() {
		assertTrue(intervall.overlappendeIntervaller(15, 25));
		assertFalse(intervall.overlappendeIntervaller(21, 30));
		
		assertTrue(doubleIntervall.overlappendeIntervaller(20.0, 30.0));
		assertFalse(doubleIntervall.overlappendeIntervaller(10.0, 14.9));
		
		assertTrue(klokkeslettIntervall.overlappendeIntervaller(new Klokkeslett(11, 0), new Klokkeslett(13, 0)));
        assertTrue(klokkeslettIntervall.overlappendeIntervaller(new Klokkeslett(9, 0), new Klokkeslett(10, 30)));
        assertTrue(klokkeslettIntervall.overlappendeIntervaller(new Klokkeslett(10, 0), new Klokkeslett(12, 0)));
        assertFalse(klokkeslettIntervall.overlappendeIntervaller(new Klokkeslett(8, 0), new Klokkeslett(9, 0)));
        assertFalse(klokkeslettIntervall.overlappendeIntervaller(new Klokkeslett(12, 1), new Klokkeslett(13, 0)));
	}
	
	@Test
	void testMinsteVerdiIEtIntervall() {
		assertEquals(10, intervall.minsteVerdiIEtIntervall());
		
		assertEquals(15.0, doubleIntervall.minsteVerdiIEtIntervall());
		
        assertEquals(new Klokkeslett(10, 0), klokkeslettIntervall.minsteVerdiIEtIntervall());

	}

	@Test
	void testStorsteVerdiIEtIntervall() {
		assertEquals(20, intervall.storsteVerdiIEtIntervall());
		
		assertEquals(25.0, doubleIntervall.storsteVerdiIEtIntervall());
		
        assertEquals(new Klokkeslett(12, 0), klokkeslettIntervall.storsteVerdiIEtIntervall());


	}
	
	@Test
	void testUgyldigIntervall() {
		// Forventer at konstruktøren kaster en IllegalArgumentException for ugyldige intervaller
		assertThrows(IllegalArgumentException.class, () -> { 
			new IntervallImpl<>(20, 10);
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			new IntervallImpl<>(25.0, 15.0);
		});
		
		 assertThrows(IllegalArgumentException.class, () -> {
	        new IntervallImpl<>(new Klokkeslett(12, 0), new Klokkeslett(10, 0));
	    });
	}
}
