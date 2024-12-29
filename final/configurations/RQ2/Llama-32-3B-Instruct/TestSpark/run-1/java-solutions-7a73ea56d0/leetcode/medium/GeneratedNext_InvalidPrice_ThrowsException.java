package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedNext_InvalidPrice_ThrowsException {

    @Test
    public void next_InvalidPrice_ThrowsException() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        for (Object price : Arrays.asList(Double.NaN, -100)) {
            if (price instanceof Integer) {
                onlineStockSpan.next((int) price);
            }
        }
    }

}