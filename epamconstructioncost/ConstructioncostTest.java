package epamconstructioncost;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConstructioncostTest {

	@Test
	void test() {
		Constructioncost c=new Constructioncost();
		assertEquals(240000, c.calculatecost("standard", 200, false));
		assertEquals(540000, c.calculatecost("highstandard", 300, false));
		assertEquals(375000, c.calculatecost("abovestandard", 250, false));
		assertEquals(1250000, c.calculatecost("highstandard", 500, true));
		
	}

}
