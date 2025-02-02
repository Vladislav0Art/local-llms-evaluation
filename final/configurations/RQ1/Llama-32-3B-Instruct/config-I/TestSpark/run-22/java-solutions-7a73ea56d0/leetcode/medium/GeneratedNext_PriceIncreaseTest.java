package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedNext_PriceIncreaseTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_PriceIncreaseTest() {
        onlineStockSpan.next(30);
        assertEquals(1, (int) onlineStockSpan.next(3));
    }

}