package leetcode.medium;

import org.junit.Test;

public class GeneratedTest {

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

    @Test
    public void testOnlineStockSpanZero() {
        onlineStockSpan.list = new ArrayList<>();
        onlineStockSpan.list.add(new Integer[]{0, 1});

        Object[] expectedSpans = {new Integer[]{2}};
        assertEquals(onlineStockSpan.next(0), expectedSpans[0]);
        assertEquals(onlineStockSpan.next(1), expectedSpans[1]);

        Object[] actualSpans = onlineStockSpan.calculateSpans(new int[]{1, 3});
        assertArrayEquals(expectedSpans, actualSpans);
    }

    @Test
    public void testOnlineStockSpanOne() {
        onlineStockSpan.list = new ArrayList<>();
        onlineStockSpan.list.add(new Integer[]{0, 2});

        Object[] expectedSpans = {new Integer[]{1, 3}};
        assertEquals(onlineStockSpan.next(0), expectedSpans[0]);
        assertEquals(onlineStockSpan.next(1), expectedSpans[1]);

        Object[] actualSpans = onlineStockSpan.calculateSpans(new int[]{2, 4});
        assertArrayEquals(expectedSpans, actualSpans);
    }

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

    @Test
    public void testOnlineStockSpanThree() {
        onlineStockSpan.list = new ArrayList<>();
        onlineStockSpan.list.add(new Integer[]{0, 2});

        Object[] expectedSpans = {new Integer[]{4}};
        assertEquals(onlineStockSpan.next(0), expectedSpans[0]);
        assertEquals(onlineStockSpan.next(1), expectedSpans[1]);

        Object[] actualSpans = onlineStockSpan.calculateSpans(new int[]{2, 4});
        assertArrayEquals(expectedSpans, actualSpans);
    }

}