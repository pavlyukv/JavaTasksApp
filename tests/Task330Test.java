import org.junit.*;
import taskPack.Task330;

import static org.junit.Assert.*;

/**
 * Created by inva on 4/26/2017.
 */
public class Task330Test {
    public Task330 task330 = new Task330();
    @Test
    public void testInput(){
        task330.setInput("555");
        task330.countResult();
        assertEquals(task330.getResult(), "6 28 496");
    }

    @Test
    public void testException(){
        task330.setInput("onetwo");
        task330.countResult();
        assertEquals(task330.getResult(), "Wrong Input!");
    }

}