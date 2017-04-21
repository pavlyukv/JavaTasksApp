package taskPack;

public abstract class GeneralTask
{
    protected static String name = "";
    protected static String description = "";
    private String input;
    private String result;

    public abstract void countResult();

    public static String getName()
    {
        return name;
    }

    public static void setName(String name)
    {
        name = name;
    }

    public static String getDescription()
    {
        return description;
    }

    public String getInput()
    {
        return input;
    }

    public void setInput(String input)
    {
        this.input = input;
    }

    public String getResult()
    {
        return result;
    }

    public void setResult(String result)
    {
        this.result = result;
    }
}
