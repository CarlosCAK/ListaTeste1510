import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Random;


public class ArraySorterTest {

    static ArraySorter sorter;

    @BeforeAll
    public static void setUp() {
        sorter = new ArraySorter();
    }
    @Test
    public void testSort() {
        Random rand = new Random();
        int[] array = new int [10000];

        for (int i = 0; i < 10000; i++) {
            array[i] = rand.nextInt(10000);
        }
        long startTime = System.nanoTime();

        sorter.sortArray(array);

        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("Tempo de execução: "+ duration);

    }
    @AfterAll
    public static void tearDown() {
        sorter = null;
    }
}
