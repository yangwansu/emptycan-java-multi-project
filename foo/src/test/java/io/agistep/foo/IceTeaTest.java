package io.agistep.foo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IceTeaTest {

	@Test
	@DisplayName("아이스티는 졸라 맛있어 근데 비싸")
	void getPrice() {
		Tea sut = Tea.builder()
				.ice().build();
		assertEquals(2500, sut.getPrice());

		Tea sut2 = Tea.builder().build();
		assertEquals(2000, sut2.getPrice());
	}
}