package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedNext_negativeNumberIs0_test {

    @Test
    public void next_negativeNumberIs0_test() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(-5);
        assertEquals(0, result);
    }

}