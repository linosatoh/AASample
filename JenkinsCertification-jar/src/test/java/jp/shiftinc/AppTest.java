package jp.shiftinc;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void testAdd() {
		assertThat(App.add(2, 3), is(5));
	}

}
