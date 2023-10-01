package io.agistep.bar;

import io.agistep.values.Price;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BarTest {

	@Test
	@DisplayName("김치볶음을 먹어보자")
	void name() {
		KimchiRice sut = new KimchiRice();

		assertThat(sut.getPrice()).isEqualTo(Price.of(5000));
	}
}
