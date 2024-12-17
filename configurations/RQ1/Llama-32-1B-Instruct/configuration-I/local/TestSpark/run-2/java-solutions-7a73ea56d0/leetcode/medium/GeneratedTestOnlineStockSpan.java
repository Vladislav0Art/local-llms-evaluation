package leetcode.medium;

import org.junit.Test;

public class GeneratedTestOnlineStockSpan {

    @Test
    public void testOnlineStockSpan() {
        onlineStockSpan.list = new ArrayList<>();
        onlineStockSpan.list.add(new Integer[]{0, 2});
        onlineStockSpan.list.add(new Integer[]{3, 4});

        Object[] expectedSpans = {new Integer[]{5, 6}};
        assertEquals(onlineStockSpan.next(0), expectedSpans[0]);
        assertEquals(onlineStockSpan.next(1), expectedSpans[1]);

        Object[] actualSpans = onlineStockSpan.calculateSpans(new int[]{2, 4});
        assertArrayEquals(expectedSpans, actualSpans);
    }

}