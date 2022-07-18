package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int number = 0;
        int fact = 1;
        while (number <= printToInclusive) {
            if (number == 0) {
                System.out.println(fact);
            } else {
                System.out.println(fact *= number);
            }
            number++;
        }
    }
}
