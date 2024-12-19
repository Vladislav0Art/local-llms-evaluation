package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedNextPrice_2Scenario_Test {

    @Test
    public void nextPrice_2Scenario_Test() {
        int price = 10;
        OnlineStockSpan.OnlineStockSpan result = new OnlineStockSpan();
        when(OnlineStockSpan.next(Mockito.anyInt())).thenReturn(0).thenReturn(price + 1);
        String actual = result.next(Mockito.anyInt());
        assertEquals(2, actual);
    }

}