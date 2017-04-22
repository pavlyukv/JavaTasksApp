package taskPack;

import java.util.InputMismatchException;

/**
 * Created by User on 22.04.2017.
 */
public class Task107 extends GeneralTask{ {
    name = "107";
    description = "Задано ціле число m>1. Вивести найбільше ціле k, при якому 4^k<m.";
}
    @Override
    public void countResult() {
        try
        {
        String str = this.getInput();
        int m = Integer.parseInt(str);
        if(m<1 || m>Integer.MAX_VALUE)
            throw new IllegalArgumentException();
        int counter = 0;
        for (int i = 0; i < m; i++) {
            if ((int) Math.pow(4, i) < m) {
                counter = i;
            }
        }
        this.setResult(String.valueOf(counter));
        }
        catch (IllegalArgumentException | InputMismatchException e)
        {
            setResult("Wrong input!");

    }
}}
