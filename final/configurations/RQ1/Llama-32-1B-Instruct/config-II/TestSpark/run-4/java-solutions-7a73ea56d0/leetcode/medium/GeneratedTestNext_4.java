package leetcode.medium;

public class GeneratedTestNext_4 {

    @Test
    public void testNext_4() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = 1;
        List<Integer> list = new ArrayList<>();
        onlineStockSpan.list = list;

        expected = 0;
        result = onlineStockSpan.next(price);

        assertEquals(expected, result);
    }

}