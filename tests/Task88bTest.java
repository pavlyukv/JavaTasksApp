import org.junit.*;
import taskPack.Task88b;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by Kolja on 26.04.2017.
 */
public class Task88bTest {

 private static Task88b task88b;

    @BeforeClass
    public static void setUp() throws Exception // run one time before all tests
    {
        task88b = new Task88b();
    }

    @Before
    public void beforeTest() throws Exception // run before each tests
    {
        task88b.setInput("");
        task88b.setResult("");
    }

    @Test
    public void testGetResultNotNull() throws Exception
    {
        assertNotNull(task88b.getResult()); // check not null
    }

    @Test
    public void testGetResultEquals() throws Exception
    {
        task88b.setInput("3245");
        task88b.countResult();
        assertEquals("5423", task88b.getResult()); // check equals
    }

    @Test
    public void testGetResultTrue() throws Exception
    {
        task88b.setInput("8889");
        task88b.countResult();
        assertTrue("9888".equals(task88b.getResult())); // check if true
    }

    @After
    public void afterTest() throws Exception // run after each tests
    {
        task88b.setInput("");
        task88b.setResult("");
    }

    @AfterClass
    public static void closeTest() throws Exception // run one time after all tests
    {
        task88b = null;
    }

}
