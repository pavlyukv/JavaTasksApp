import org.junit.*;
import taskPack.Task243a;

import static org.junit.Assert.*;

/**
 * Created by Soltys on 26.04.2017.
 */
public class Task243aTest {
    private static Task243a task243a;

    @BeforeClass
    public static void setUp() throws Exception // run one time before all tests
    {
        task243a = new Task243a();
    }

    @Before
    public void beforeTest() throws Exception // run before each tests
    {
        task243a.setInput("");
        task243a.setResult("");
    }

    @Test
    public void testGetExceptionResult() throws Exception
    {
        task243a.setInput("0");
        task243a.countResult();
        String result = "0 неможливо представити у вигляді суми квадратів двох натуральних чисел";
        assertEquals(result, task243a.getResult());
    }

    @Test
    public void testGetResultEquals() throws Exception
    {
        task243a.setInput("194");
        task243a.countResult();
        assertEquals("194=5^2 +13^2", task243a.getResult());
    }

    @After
    public void afterTest() throws Exception // run after each tests
    {
        task243a.setInput("");
        task243a.setResult("");
    }

    @AfterClass
    public static void tearDwon() throws Exception // run one time after all tests
    {
        task243a = null;
    }
}