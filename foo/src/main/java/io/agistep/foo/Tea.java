package io.agistep.foo;

public interface Tea {
	static TeaBuilder builder() {
		return new TeaBuilder();
	}

	int getPrice();
}
