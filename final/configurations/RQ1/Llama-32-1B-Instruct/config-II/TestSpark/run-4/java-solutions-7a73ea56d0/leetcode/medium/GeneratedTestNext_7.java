package leetcode.medium;

public class GeneratedTestNext_7 {

    @Test
    public void testNext_7() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = 4;
        List<Integer> list = new ArrayList<>();
        onlineStockSpan.list = list;

        expected = 0;
        result = onlineStockSpan.next(price);

        assertEquals(expected, result);
    }

}