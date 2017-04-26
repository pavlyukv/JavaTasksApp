import org.junit.*;
import static org.junit.Assert.*;
import taskPack.Task562;
/**
 * Created by Kolja on 26.04.2017.
 */
public class Task562Test {

    private static Task562 task562;

    @BeforeClass
    public static void initializing(){
        task562 = new Task562();
    }

    @Before
    public void before(){
        task562.setInput("");
        task562.setResult("");
    }

    @Test
    public void testTrue1(){
        task562.setInput("");
        task562.countResult();
        assertTrue(task562.getResult().equalsIgnoreCase("153, 370, 371, 407, 1634, 8208, 9474"));
    }

   @After
    public void afterTeest(){
       task562.setInput("");
       task562.setResult("");
   }

   @AfterClass
    public static void closeTest(){
        task562 = null;
   }



}
