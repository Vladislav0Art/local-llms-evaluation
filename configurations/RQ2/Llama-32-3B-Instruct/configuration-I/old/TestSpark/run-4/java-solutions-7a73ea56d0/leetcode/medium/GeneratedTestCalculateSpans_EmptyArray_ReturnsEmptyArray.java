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
public class GeneratedTestCalculateSpans_EmptyArray_ReturnsEmptyArray {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Mock
    private StockSpan stockSpan;

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCalculateSpans_EmptyArray_ReturnsEmptyArray() {
        setup();
        int[] result = onlineStockSpan.calculateSpans(new int[0]);
        assertNotNull(result);
        assertTrue(result.length == 0);
    }

}