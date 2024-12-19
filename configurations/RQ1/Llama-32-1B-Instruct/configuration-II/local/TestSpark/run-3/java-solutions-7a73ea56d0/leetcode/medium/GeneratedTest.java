package leetcode.medium;

public class GeneratedTest {

    @Test
    public void testNext() {
        OnlineStockSpan sut = new OnlineStockSpan();
        int price = 5;
        int expected = 2;
        int actual = sut.next(price);
        assertEquals(expected, actual);
    }

    @Test
    public void testNextWithNoCoverPrice() {
        OnlineStockSpan sut = new OnlineStockSpan();
        int price = 3;
        int expected = 1;
        int actual = sut.next(price);
        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateSpans() {
        OnlineStockSpan sut = new OnlineStockSpan();
        int[] prices = {10, 5};
        int expected = new int[]{2, 1};
        int[] actual = sut.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testCalculateSpansWithTwoElements() {
        OnlineStockSpan sut = new OnlineStockSpan();
        int[] prices = {10, 20, 30};
        int expected = new int[]{3, 2, 1};
        int[] actual = sut.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testCalculateSpansWithOneElement() {
        OnlineStockSpan sut = new OnlineStockSpan();
        int[] prices = {10};
        int expected = 0;
        int[] actual = sut.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testCalculateSpansWithTwoElementsAndPrice() {
        OnlineStockSpan sut = new OnlineStockSpan();
        int[] prices = {10, 20};
        int expected = new int[]{2, 1};
        int[] actual = sut.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testCalculateSpansWithTwoElementsAndPriceZero() {
        OnlineStockSpan sut = new OnlineStockSpan();
        int[] prices = {10, 0};
        int expected = new int[]{2, 1};
        int[] actual = sut.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

}