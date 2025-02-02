package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedNext_PriceDecreaseTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_PriceDecreaseTest() {
        onlineStockSpan.next(10);
        assertEquals(1, (int) onlineStockSpan.next(5));
    }

}