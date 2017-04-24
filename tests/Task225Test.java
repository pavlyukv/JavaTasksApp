import taskPack.Task225;
import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by Vasyl on 23.04.2017.
 */
public class Task225Test
{
    private static Task225 task225;

    @BeforeClass
    public static void setUp() throws Exception // run one time before all tests
    {
        task225 = new Task225();
    }

    @Before
    public void beforeTest() throws Exception // run before each tests
    {
        task225.setInput("");
        task225.setResult("");
    }

    @Test
    public void testGetResultNotNull() throws Exception
    {
        assertNotNull(task225.getResult()); // check not null
    }

    @Test
    public void testGetResultEquals() throws Exception
    {
        task225.setInput("100");
        task225.countResult();
        assertEquals("2, 5, 10", task225.getResult()); // check equals
    }

    @Test
    public void testGetResultTrue() throws Exception
    {
        task225.setInput("10000");
        task225.countResult();
        assertTrue("4, 20, 25, 50, 100".equals(task225.getResult())); // check if true
    }

    @After
    public void afterTest() throws Exception // run after each tests
    {
        task225.setInput("");
        task225.setResult("");
    }

    @AfterClass
    public static void tearDwon() throws Exception // run one time after all tests
    {
        task225 = null;
    }
}
