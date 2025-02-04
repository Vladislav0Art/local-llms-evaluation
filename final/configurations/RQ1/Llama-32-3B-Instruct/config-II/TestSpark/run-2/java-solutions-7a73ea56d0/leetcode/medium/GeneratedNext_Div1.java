package leetcode.medium;

public class GeneratedNext_Div1 {

    private OnlineStockSpan onlineStockSpan;

    @Test
    public void next_Div1() {
        List<Integer> list = new ArrayList<>();
        onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.list = list;
        for (int i = 0; i < 100; i++) {
            onlineStockSpan.next(i);
        }
        Assert.assertEquals(100, list.size());
    }

}