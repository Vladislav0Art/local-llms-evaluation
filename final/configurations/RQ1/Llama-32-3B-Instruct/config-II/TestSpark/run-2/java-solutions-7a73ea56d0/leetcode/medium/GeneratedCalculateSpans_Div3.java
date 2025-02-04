package leetcode.medium;

public class GeneratedCalculateSpans_Div3 {

    private OnlineStockSpan onlineStockSpan;

    @Test
    public void calculateSpans_Div3() {
        int[] prices = {10, 30, 60, 20};
        List<Integer> list = new ArrayList<>();
        onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.list = list;
        for (int i = 0; i < prices.length; i++) {
            onlineStockSpan.next(prices[i]);
        }
        int[] spans = onlineStockSpan.calculateSpans(prices);
        Assert.assertEquals(spans[0], 1);
        Assert.assertEquals(spans[1], 2);
        Assert.assertEquals(spans[2], 3);
        Assert.assertEquals(spans[3], 4);
    }

}