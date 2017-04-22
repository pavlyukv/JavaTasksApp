import taskPack.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kolja on 21.04.2017.
 */
public class Main
{
    //All tasks list
    public static List<GeneralTask> generalTaskList = new ArrayList<>();

    //list with tasks names (for dropdown menu)
    public static List<String> allNames = new ArrayList<>();

    //method for adding new task, use it only !!
    public static void addToList(GeneralTask task, String name)
    {
        task.setName(name);
        allNames.add(name);
        generalTaskList.add(task);
    }

    public static void main(String[] args)
    {
        //adding new task in program
        addToList(new Task86a(), "86a");
        addToList(new Task86b(), "86b");
        addToList(new Task225(), "225");
        addToList(new Task323(), "323");
        addToList(new Task559(), "559");
        addToList(new Task87(), "87");

        MainWindow mainWindow = new MainWindow();
    }
}
