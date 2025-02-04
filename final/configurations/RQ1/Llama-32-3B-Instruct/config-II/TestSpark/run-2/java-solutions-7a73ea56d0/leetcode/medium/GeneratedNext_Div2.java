package leetcode.medium;

public class GeneratedNext_Div2 {

    private OnlineStockSpan onlineStockSpan;

    @Test
    public void next_Div2() {
        List<Integer> list = new ArrayList<>();
        onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.list = list;
        for (int i = 0; i < 20; i++) {
            onlineStockSpan.next(i);
        }
        Assert.assertEquals(20, list.size());
    }

}