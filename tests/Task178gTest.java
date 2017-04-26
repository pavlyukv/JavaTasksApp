import org.junit.Test;
import taskPack.Task178g;

import static org.junit.Assert.assertEquals;

/**
 * Created by inva on 4/26/2017.
 */
public class Task178gTest {
    Task178g task178g = new Task178g();

    @Test
    public void testZero(){
        task178g.setInput("1 1 1 1");
        task178g.countResult();
        assertEquals(task178g.getResult(), "0");
    }

    @Test
    public void testException(){
        task178g.setInput("onetwo");
        task178g.countResult();
        assertEquals(task178g.getResult(), "Please, enter natural number in Integer range.");
    }
}
