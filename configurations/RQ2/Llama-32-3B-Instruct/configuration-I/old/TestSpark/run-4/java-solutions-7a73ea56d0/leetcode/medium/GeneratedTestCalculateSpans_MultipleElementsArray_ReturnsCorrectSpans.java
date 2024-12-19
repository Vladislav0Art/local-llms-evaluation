package leetcode.medium;

import org.junit.Test;
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
public class GeneratedTestCalculateSpans_MultipleElementsArray_ReturnsCorrectSpans {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Mock
    private StockSpan stockSpan;

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCalculateSpans_MultipleElementsArray_ReturnsCorrectSpans() {
        setup();
        when(stockSpan.calculateSpans(anyInt[][])).thenReturn(new int[][]{{2}, {1}, {0}});
        int[] prices = {10, 7, 5};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertNotNull(result);
        assertTrue(result.length == 3);
        assertEquals(2, result[0]);
        assertEquals(1, result[1]);
        assertEquals(0, result[2]);
    }

}