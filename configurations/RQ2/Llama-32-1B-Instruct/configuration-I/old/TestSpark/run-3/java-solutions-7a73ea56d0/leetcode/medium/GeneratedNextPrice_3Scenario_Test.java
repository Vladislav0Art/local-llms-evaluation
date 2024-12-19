package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedNextPrice_3Scenario_Test {

    @Test
    public void nextPrice_3Scenario_Test() {
        int price = 1;
        OnlineStockSpan.OnlineStockSpan result = new OnlineStockSpan();
        when(OnlineStockSpan.next(Mockito.anyInt())).thenReturn(0).thenReturn(price + 1);
        String actual = result.next(Mockito.anyInt());
        assertEquals(2, actual);
    }

}