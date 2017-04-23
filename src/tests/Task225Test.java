package tests;

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
    public static void setUp() throws Exception
    {
        // run one time before all tests
        task225 = new Task225();
    }

    @Before
    public void before() throws Exception
    {
        // run before each tests
        task225.setInput("");
        task225.setResult("");
    }

    @Test
    public void getResultNotNull() throws Exception
    {
        // check not null
        assertNotNull(task225.getResult());
    }

    @Test
    public void getResultEquals() throws Exception
    {
        // check equals
        task225.setInput("100");
        task225.countResult();
        assertEquals("2, 5, 10", task225.getResult());
    }

    @Test
    public void getResultTrue() throws Exception
    {
        // check if true
        task225.setInput("10000");
        task225.countResult();
        assertTrue("4, 20, 25, 50, 100".equals(task225.getResult()));
    }

    @After
    public void after() throws Exception
    {
        // run after each tests
        task225.setInput("");
        task225.setResult("");
    }

    @AfterClass
    public static void tearDwon() throws Exception
    {
        // run one time after all tests
        task225 = null;
    }
}
