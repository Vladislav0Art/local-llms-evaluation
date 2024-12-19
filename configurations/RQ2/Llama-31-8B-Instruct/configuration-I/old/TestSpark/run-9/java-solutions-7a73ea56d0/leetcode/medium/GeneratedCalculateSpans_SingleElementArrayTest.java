package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_SingleElementArrayTest {

    private OnlineStockSpan onlineStockSpan;

    @Test
    public void calculateSpans_SingleElementArrayTest() {
        onlineStockSpan = new OnlineStockSpan();
        assertArrayEquals(new int[]{1}, onlineStockSpan.calculateSpans(new int[]{10}));
    }

}