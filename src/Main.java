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
    public static void addToList(GeneralTask task)
    {
        allNames.add(task.getName());
        generalTaskList.add(task);
    }

    public static void main(String[] args)
    {
        //adding new task in program
        addToList(new Task86a());
        addToList(new Task86b());
        addToList(new Task87());
        addToList(new Task107());
        addToList(new Task108());
        addToList(new Task225());
        addToList(new Task243a());
        addToList(new Task243b());
        addToList(new Task323());
        addToList(new Task325());
        addToList(new Task329());
        addToList(new Task330());
        addToList(new Task559());
        addToList(new Task561());
        addToList(new Task562());
        addToList(new Task88a());
        addToList(new Task88b());
        addToList(new Task322());

        MainWindow mainWindow = new MainWindow();
    }
}
