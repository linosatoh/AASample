package agile.academy;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import agile.academy.App;

public class AppTest {

	@Test
	public void testAdd() {
		assertThat(App.add(2, 3), is(5));
	}

	@Test
	public void testSub() {
		assertThat(App.sub(20, 3), is(17));
	}

	@Test
	public void testMul() {
		assertThat(App.mul(3, 5), is(15));
	}

	@Test
	public void testDiv() {
		assertThat(App.div(16, 2), is(8));
	}

}
