package leetcode.medium;

public class GeneratedTestNextWithNoCoverPrice {

    @Test
    public void testNextWithNoCoverPrice() {
        OnlineStockSpan sut = new OnlineStockSpan();
        int price = 3;
        int expected = 1;
        int actual = sut.next(price);
        assertEquals(expected, actual);
    }

}