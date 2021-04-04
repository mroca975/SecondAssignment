/**
 * 
 */
package es.smartcoding.secondassignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Usuario
 *
 */
public class AppImplTest {

	private static App app;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		app = new AppImpl();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		app = null;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link es.smartcoding.secondassignment.AppImpl#sum(int, int)}.
	 * @throws Exception 
	 */
	@Test
	public final void testSum() throws Exception {
		assertEquals(2, app.sum(1, 1));
	}
	
	@Test
	public final void testSum1() throws Exception {
		assertEquals(3, app.sum(1, 2));
	}	
	

}
