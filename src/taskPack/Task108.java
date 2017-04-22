package taskPack;

public class Task108 extends GeneralTask {

    {
        name = "108";
        description = "Дано натуральне число n. Отримати найменше число виду 2^r, більше за n";
    }

    @Override
    public void countResult() {
        long number = Long.parseLong(this.getInput());
        long twoInDegree = 1;

        while(true) {
            if(number >= twoInDegree)
                twoInDegree *= 2;
            else
                break;
        }
        setResult(Long.toString(twoInDegree));
    }
}