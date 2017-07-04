package a.b.c

import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class CalculatorSpec extends Specification{

	def "#a と #b を足すと #c になること。"(){
		expect:
		new Calculator().add(a, b) == c

		where:
		a|b|c
		1|2|3
		2|2|5
		3|3|6
	}
}
