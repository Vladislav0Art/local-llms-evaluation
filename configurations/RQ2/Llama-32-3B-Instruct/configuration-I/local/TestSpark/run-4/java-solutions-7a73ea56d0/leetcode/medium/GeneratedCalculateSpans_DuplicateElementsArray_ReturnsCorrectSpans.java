package leetcode.medium;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runner.JUnit4ClassRunner.class)
public class GeneratedCalculateSpans_DuplicateElementsArray_ReturnsCorrectSpans {

    @Mock
    private StockSpan stockSpan;

    private OnlineStockSpan onlineStockSpan;

    @Before
    public void setup() {
        onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    public void calculateSpans_DuplicateElementsArray_ReturnsCorrectSpans() {
        int[] prices = {10, 10, 5};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertNotNull(result);
        assertTrue(result.length == 3);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(0, result[2]);
    }

}