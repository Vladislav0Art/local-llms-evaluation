package leetcode.medium;

import org.junit.Test;

public class GeneratedTestOnlineStockSpanTwo {

    @Test
    public void testOnlineStockSpanTwo() {
        onlineStockSpan.list = new ArrayList<>();
        onlineStockSpan.list.add(new Integer[]{0, 1});

        Object[] expectedSpans = {new Integer[]{2}};
        assertEquals(onlineStockSpan.next(0), expectedSpans[0]);
        assertEquals(onlineStockSpan.next(1), expectedSpans[1]);

        Object[] actualSpans = onlineStockSpan.calculateSpans(new int[]{1, 3});
        assertArrayEquals(expectedSpans, actualSpans);
    }

}