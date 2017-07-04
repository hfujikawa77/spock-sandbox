package a.b.c;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class CalculatorTest {
	@DataPoints
	public static Fixture[] fixtures = {
			new Fixture(1, 2, 3),
			new Fixture(2, 2, 5),
			new Fixture(3, 3, 6),
	};

	static class Fixture{
		Fixture(int a, int b, int c) {
			super();
			this.a = a;
			this.b = b;
			this.c = c;
		}
		int a;
		int b;
		int c;
	}

	@Theory
	public void testAdd(Fixture f) {
		assertThat(new Calculator().add(f.a, f.b), is(f.c));
	}
}
