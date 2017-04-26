import org.junit.*;
import taskPack.Task178d;

import static org.junit.Assert.*;

/**
 * Created by User on 26.04.2017.
 */
public class Task178dTest { public static Task178d task178d;
    @BeforeClass
    public static void beforeClass(){
        task178d=new Task178d();
    }
    @Before
    public void beforeTest(){
        task178d.setInput("");
        task178d.setResult("");
    }

    @Test
    public void countResultTestEquals() throws Exception {
        task178d.setInput("4 4 5 2 5 66 34 23 12");
        task178d.countResult();
        Assert.assertEquals("1",task178d.getResult());


    }
    @Test
    public void countResultTestTrue() throws Exception {
        task178d.setInput("4 72 32 12 544 34 23 44 344 ");
        task178d.countResult();
        Assert.assertTrue("2".equals(task178d.getResult()));


    }
    @Test
    public void countResultTestNotNull() throws Exception {

        Assert.assertNotNull(task178d.getResult());

    }


    @After
    public void afterTest() throws Exception {
        task178d.setInput("");
        task178d.setResult("");
    }

    @AfterClass
    public static void tearDown() throws Exception {
        task178d = null;
    }

}