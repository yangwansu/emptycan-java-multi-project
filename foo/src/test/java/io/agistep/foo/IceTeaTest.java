package io.agistep.foo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IceTeaTest {

	@Test
	@DisplayName("아이스티는 졸라 맛있어")
	void getPrice() {
		assertEquals(2500, new IceTea().getPrice());
	}
}