package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNext_SamePriceTwiceTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_SamePriceTwiceTest() {
        int result1 = onlineStockSpan.next(5);
        int result2 = onlineStockSpan.next(6);
        assertNotEquals(result1, result2);
    }

}