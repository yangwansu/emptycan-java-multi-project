package io.agistep.foo;

import io.agistep.values.Price;

class HotTea implements Tea {
	@Override
	public Price getPrice() {
		return Price.of(2000);
	}
}
