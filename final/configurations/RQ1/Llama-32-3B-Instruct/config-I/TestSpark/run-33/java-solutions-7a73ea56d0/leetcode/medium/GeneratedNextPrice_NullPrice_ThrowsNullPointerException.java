package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedNextPrice_NullPrice_ThrowsNullPointerException {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void nextPrice_NullPrice_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> onlineStockSpan.next(null));
    }

}