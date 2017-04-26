import org.junit.*;
import taskPack.Task561;

import static org.junit.Assert.*;

/**
 * Created by Vasyl on 26.04.2017.
 */
public class Task561Test
{
    public Task561 task561;

    @Before
    public void beforeTest() throws Exception
    {
        task561 = new Task561();
    }

    @Test
    public void testCountResultEquals() throws Exception
    {
        task561.setInput("100");
        task561.countResult();
        assertEquals("1 5 6 25 76", task561.getResult());
    }

    @Test
    public void testCountResultNotNull() throws Exception
    {
        assertNotNull(task561.getResult());
    }
}
