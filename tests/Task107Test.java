import org.junit.*;
import taskPack.Task107;

import static org.junit.Assert.*;

/**
 * Created by Vasyl on 26.04.2017.
 */
public class Task107Test
{
    public Task107 task107;

    @Before
    public void beforeTest() throws Exception
    {
        task107 = new Task107();
    }

        @Test
    public void countResult() throws Exception
    {
        task107.setInput("1000");
        task107.countResult();
        assertEquals("Wrong result", "4", task107.getResult());
    }

}