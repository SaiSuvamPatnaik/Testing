package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddstring {

	@Test
	void test() {
		jUnitTesting junit = new jUnitTesting();
		String result1 = junit.addStrings("SaiSuvam","Patnaik");
		assertEquals ("SaiSuvamPatnaik",result1);
	}

}
