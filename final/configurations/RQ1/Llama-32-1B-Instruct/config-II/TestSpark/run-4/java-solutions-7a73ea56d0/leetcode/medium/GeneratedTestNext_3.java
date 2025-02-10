package leetcode.medium;

public class GeneratedTestNext_3 {

    @Test
    public void testNext_3() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = 5;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        onlineStockSpan.list = list;

        expected = 9;
        result = onlineStockSpan.next(price);

        assertEquals(expected, result);
    }

}