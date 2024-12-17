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
public class GeneratedTestNext_ExistingPrice_ReturnsNextValue {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Mock
    private StockSpan stockSpan;

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testNext_ExistingPrice_ReturnsNextValue() {
        when(stockSpan.next(anyInt())).thenReturn(11);
        assertEquals(11, onlineStockSpan.next(10));
    }

}