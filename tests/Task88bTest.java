import org.junit.*;
import taskPack.Task88b;

import static org.junit.Assert.*;

/**
 * Created by Volodymyr on 26.04.2017.
 */
public class Task88bTest {
    private static Task88b task88b;

    @BeforeClass
    public static void setUp() throws Exception {
        task88b = new Task88b();
    }

    @Before
    public void beforeTest() throws Exception {
        task88b.setInput("");
        task88b.setResult("");
    }

    @Test
    public void testGetResultEquals() throws Exception {
        task88b.setInput("123");
        task88b.countResult();
        assertEquals("321", task88b.getResult());
    }

    @Test
    public void testGetResultTrue() throws Exception {
        task88b.setInput("1234");
        task88b.countResult();
        assertTrue("4321".equals(task88b.getResult()));
    }

    @After
    public void afterTest() throws Exception {
        task88b.setInput("");
        task88b.setResult("");
    }

    @AfterClass
    public static void tearDown() throws Exception {
        task88b = null;
    }
}