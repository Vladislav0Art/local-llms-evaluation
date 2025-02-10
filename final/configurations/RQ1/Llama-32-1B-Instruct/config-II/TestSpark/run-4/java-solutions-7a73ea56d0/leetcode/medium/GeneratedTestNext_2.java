package leetcode.medium;

public class GeneratedTestNext_2 {

    @Test
    public void testNext_2() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = 3;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        onlineStockSpan.list = list;

        expected = 1;
        result = onlineStockSpan.next(price);

        assertEquals(expected, result);
    }

}