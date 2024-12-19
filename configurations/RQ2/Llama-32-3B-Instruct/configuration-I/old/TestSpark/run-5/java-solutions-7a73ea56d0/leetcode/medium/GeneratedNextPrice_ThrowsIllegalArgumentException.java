package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNextPrice_ThrowsIllegalArgumentException {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
    @Mock
    private int[] prices;

    public void setUp() {
        when(prices[0]).thenReturn(100);
        when(prices[1]).thenReturn(200);
        when(prices[2]).thenReturn(300);
    }

    // Test next method with valid price

    @Test
    public void nextPrice_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> onlineStockSpan.next(-100));
    }

}