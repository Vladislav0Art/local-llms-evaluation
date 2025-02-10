package leetcode.medium;

public class GeneratedTestNext_6 {

    @Test
    public void testNext_6() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = 4;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        onlineStockSpan.list = list;

        expected = 0;
        result = onlineStockSpan.next(price);

        assertEquals(expected, result);
    }

}