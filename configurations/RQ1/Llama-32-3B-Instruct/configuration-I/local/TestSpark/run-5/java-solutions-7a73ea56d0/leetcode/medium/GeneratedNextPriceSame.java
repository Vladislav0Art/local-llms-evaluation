package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class GeneratedNextPriceSame {

    @Test
    public void nextPriceSame() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.list.add(10);
        onlineStockSpan.next(10);
        onlineStockSpan.next(5);
        assertThat((int) onlineStockSpan.next(10), is(2));
    }

}