package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int product = 1;
        int i = 0;

        if(power>=0) {
            while (i <= power) {
                System.out.println(product);
                product *= 2;
                i++;
            }
        }
        else
            System.out.println("too much power");
    }
}
