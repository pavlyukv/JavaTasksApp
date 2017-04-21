package taskPack;

/**
 * Created by Kolja on 21.04.2017.
 */

//my task example
public class Task86a extends GeneralTask
{
    //overriding general method (main task)
    @Override
    public void countResult()
    {
        //my task
        int res = String.valueOf(this.getInput()).length();

        //setting result
        this.setResult(String.valueOf(res));
    }
}
