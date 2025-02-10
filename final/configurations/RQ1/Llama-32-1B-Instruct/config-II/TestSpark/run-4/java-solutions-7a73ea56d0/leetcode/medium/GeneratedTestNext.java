package leetcode.medium;

public class GeneratedTestNext {

    @Test
    public void testNext() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = 1;
        int expected = 0;

        List<Integer> list = new ArrayList<>();
        onlineStockSpan.list = list;
        int result = onlineStockSpan.next(price);
        assertEquals(expected, result);
    }

}