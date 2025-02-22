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

public class GeneratedNextTest {

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

}