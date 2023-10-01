package io.agistep.foo;

import io.agistep.values.Price;

public interface Tea {
	static TeaBuilder builder() {
		return new TeaBuilder();
	}

	Price getPrice();
}
