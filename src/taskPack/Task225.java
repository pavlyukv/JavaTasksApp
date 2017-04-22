package taskPack;

/**
 * Created by Vasyl on 21.04.2017.
 */
public class Task225 extends GeneralTask
{
    {
        name = "225";
        description = "Дано натуральне число n. Получити всі такі натуральні q, що n ділиться на q^2 і не ділиться на q^3.";
    }

    @Override
    public void countResult()
    {
        try
        {
            long n = Long.parseLong(getInput());
            if (n <= 0 || n > 10000000000000000L)
                throw new IllegalArgumentException();
            StringBuilder sb = new StringBuilder();
            for (long q = 1, q2 = 1, q3 = 1; q2 <= n && q3 > 0; q++, q2 = q * q, q3 = q2 * q)
                if ((1.0 * n / q2) == (n / q2) && (1.0 * n / q3) != (n / q3))
                    sb.append(q).append(" ");
            setResult(sb.toString());
        }
        catch (IllegalArgumentException e)
        {
            setResult("Wrong input! Must be: integer in range from 1 to 10^15.");
        }
    }
}
