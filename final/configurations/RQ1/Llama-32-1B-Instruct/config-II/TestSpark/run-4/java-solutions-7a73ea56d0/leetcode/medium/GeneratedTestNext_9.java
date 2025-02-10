package leetcode.medium;

public class GeneratedTestNext_9 {

    @Test
    public void testNext_9() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = 4;
        List<Integer> list = new ArrayList<>();
        onlineStockSpan.list = list;

        expected = 1;
        result = onlineStockSpan.next(price);

        assertEquals(expected, result);
    }

}