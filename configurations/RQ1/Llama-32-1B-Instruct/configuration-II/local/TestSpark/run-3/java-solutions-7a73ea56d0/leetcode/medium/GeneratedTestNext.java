package leetcode.medium;

public class GeneratedTestNext {

    @Test
    public void testNext() {
        OnlineStockSpan sut = new OnlineStockSpan();
        int price = 5;
        int expected = 2;
        int actual = sut.next(price);
        assertEquals(expected, actual);
    }

}