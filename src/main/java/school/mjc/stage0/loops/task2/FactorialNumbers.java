package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 0;
        int factorial = 1;

        while(i <= printToInclusive) {
            i++;
            System.out.println(factorial);
            factorial = factorial * i;
        }
    }
}
