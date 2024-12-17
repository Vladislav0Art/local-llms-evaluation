package leetcode.medium;

public class GeneratedTest_next_test {

    @Test
    public void test_next_test() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = 7;
        int result = onlineStockSpan.next(price);
        assertEquals(1, result);

        price = 10;
        result = onlineStockSpan.next(price);
        assertEquals(2, result);
    }

}