package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedNext_InvalidPrice_ThrowsNoException {

    @Test
    public void next_InvalidPrice_ThrowsNoException() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        for (Object price : Arrays.asList(0, -100)) {
            if (price instanceof Integer) {
                onlineStockSpan.next((int) price);
            }
        }
    }

}