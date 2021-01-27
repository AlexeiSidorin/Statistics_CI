import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    StatisticsService service = new StatisticsService();

    @Test
    void findMax() {
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }

    @Test
    void findNewMax() {
        long[] incomesInBillions = {12, 5, 34, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 34;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }

    @Test
    void findMaxIndex() {
        long[] incomesInBillions = {12, 5, 34, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 1;
        long actual = service.findMaxIndex(incomesInBillions);
        assertEquals(expected, actual);

    }
}