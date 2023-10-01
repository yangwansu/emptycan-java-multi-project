package io.agistep.foo;

public class TeaBuilder {

	private boolean ice = false;

	TeaBuilder() {

	}

	public TeaBuilder ice() {
		this.ice = true;
		return this;
	}

	public Tea build() {
		if(this.ice) {
			return new IceTea();
		}

		return new HotTea();
	}
}
