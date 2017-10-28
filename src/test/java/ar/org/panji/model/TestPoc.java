package ar.org.panji.model;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPoc {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Assert.assertEquals("01", String.format("%02d", 1));
		Assert.assertEquals("02", String.format("%02d", 2));
	}

}
