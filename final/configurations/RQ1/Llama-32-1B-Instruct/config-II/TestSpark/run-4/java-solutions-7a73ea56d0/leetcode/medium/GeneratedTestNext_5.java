package leetcode.medium;

public class GeneratedTestNext_5 {

    @Test
    public void testNext_5() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = 4;
        List<Integer> list = new ArrayList<>();
        onlineStockSpan.list = list;

        expected = 2;
        result = onlineStockSpan.next(price);

        assertEquals(expected, result);
    }

}