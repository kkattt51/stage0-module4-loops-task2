package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int evenNumber = 2;
        while (evenNumber <= printTillInclusive) {
            System.out.println(evenNumber);
            evenNumber += 2;
        }
    }
}
