package leetcode.medium;

public class GeneratedNext_Div3 {

    private OnlineStockSpan onlineStockSpan;

    @Test
    public void next_Div3() {
        List<Integer> list = new ArrayList<>();
        onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.list = list;
        for (int i = 0; i < 1000; i++) {
            onlineStockSpan.next(i);
        }
        Assert.assertEquals(1000, list.size());
    }

}