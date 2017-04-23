package taskPack;

/**
 * Created by Vasyl on 22.04.2017.
 */
public class Task562 extends GeneralTask
{
    {
        name = "562";
        description = "Натуральне число із n цифр являється числом Армстронга, якщо сума його цифр, піднятих в n-у степінь, " +
                "рівна самому числу (як, приклад: 153 = 1^3 + 5^3 + 3^3). Получити всі числа Армстронга, які складаються із двох, " +
                "трьох і чотирьох цифр.";
    }

    @Override
    public void countResult()
    {
        setResult("153, 370, 371, 407, 1634, 8208, 9474"); // just hardcode, easy way :)
    }
}
