package leetcode.medium;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    private OnlineStockSpan stockSpan;

    @Before
    public void setUp() throws Exception {
        stockSpan = Mockito.mock(OnlineStockSpan.class);
    }

    @After
    public void tearDown() throws Exception {
        stockSpan = null;
    }

    @Test
    public void nextTest() {
        int price = 5;
        int expected = 3;
        int actual = stockSpan.next(price);
        assertEquals(expected, actual);
    }

    @Test
    public void calculateSpansTest() {
        int[] prices = new int[]{5, 6, 7, 8, 9};
        int[] expected = new int[]{1, 2, 3, 4, 5};
        int[] actual = stockSpan.calculateSpans(prices);
        assertEquals(expected, actual);
    }

}