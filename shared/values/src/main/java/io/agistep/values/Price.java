package io.agistep.values;

import lombok.Value;
import lombok.experimental.Accessors;

import static org.valid4j.Validation.validate;

@Value(staticConstructor = "of")
@Accessors(fluent = true)
public class Price {
	long value;

	private Price(long value) {
		validate(value > 0, IllegalArgumentException.class);
		this.value = value;
	}
}
