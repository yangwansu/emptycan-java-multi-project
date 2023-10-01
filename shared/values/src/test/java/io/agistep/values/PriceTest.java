package io.agistep.values;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriceTest {


	@Test
	void equals() {
		assertEquals(Price.of(5001), Price.of(5000));
		assertNotEquals(Price.of(5000), Price.of(2500));
	}
}
