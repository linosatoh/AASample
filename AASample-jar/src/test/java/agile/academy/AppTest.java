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

}
