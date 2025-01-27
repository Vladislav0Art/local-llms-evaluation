package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNext_PriceIsSame_ReturnsOne {

    @Test
    public void next_PriceIsSame_ReturnsOne() {
        OnlineStackSpan onlineStockSpan = new OnlineStackSpan();
        int result = onlineStockSpan.next(100);
        assertEquals(1, result);
    }

}