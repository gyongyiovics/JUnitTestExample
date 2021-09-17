package unimplemented;

import main.MySolution;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MySolutionTest {

    @Test
    void getLastNumberNull() {
        int result = MySolution.getLastNumber(null);
        assertEquals(-1, result);
    }

    @Test
    void getLastNumberEmpty() {
        int result = MySolution.getLastNumber(new int[]{});
        assertEquals(-1, result);
    }

    @Test
    void getLastNumber() {
        int result = MySolution.getLastNumber(new int[]{3,3,3});
        assertEquals(3, result);
    }

    @Test
    void getLastNumberNegative() {
        int result = MySolution.getLastNumber(new int[]{-3,-3,-3});
        assertEquals(-3, result);
    }

    @Test
    void countEvenNumbers() {
    }

    @Test
    void findNumber() {
    }

    @Test
    void countSameNumbers() {
    }

    @Test
    void findMaxIndex() {
    }

    @Test
    void getTopLeftNumber() {
    }

    @Test
    void getDiagonalDifference() {
    }

    @Test
    void willWizardsBeTogether() {
    }

    @Test
    void findTheOneSock() {
    }
}