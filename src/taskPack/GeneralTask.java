package taskPack;

public abstract class GeneralTask
{
    protected String name = "";
    protected String description = "";
    private String input;
    private String result;

    public abstract void countResult();

    public String getName()
    {
        return name;
    }

    public static void setName(String name)
    {
        name = name;
    }

    public String getDescription()
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
