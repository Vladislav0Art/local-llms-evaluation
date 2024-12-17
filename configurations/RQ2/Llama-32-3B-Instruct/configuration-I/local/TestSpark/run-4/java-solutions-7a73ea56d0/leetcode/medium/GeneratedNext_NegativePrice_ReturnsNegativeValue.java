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
public class GeneratedNext_NegativePrice_ReturnsNegativeValue {

    @Mock
    private StockSpan stockSpan;

    private OnlineStockSpan onlineStockSpan;

    @Before
    public void setup() {
        onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    public void next_NegativePrice_ReturnsNegativeValue() {
        onlineStockSpan.next(-5);
        when(stockSpan.next(anyInt())).thenReturn(-6);
        assertEquals(-6, onlineStockSpan.next(-5));
    }

}