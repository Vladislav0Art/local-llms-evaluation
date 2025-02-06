package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedNext_ThrowsException WhenPriceIsNegative {

    @Test
    public void next_ThrowsException

    WhenPriceIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> new OnlineStockSpan().next(-10));
    }

}