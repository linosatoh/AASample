package agile.academy;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void testAdd() {
		assertThat(App.add(2, 3), is(5));
	}

	@Test
	public void testSubtract() {
		assertThat(App.subtract(20, 3), is(17));
	}

	@Test
	public void testMultiply() {
		assertThat(App.multiply(3, 5), is(15));
	}

	@Test
	public void testDivide() {
		assertThat(App.divide(16, 2), is(8));
	}

}
