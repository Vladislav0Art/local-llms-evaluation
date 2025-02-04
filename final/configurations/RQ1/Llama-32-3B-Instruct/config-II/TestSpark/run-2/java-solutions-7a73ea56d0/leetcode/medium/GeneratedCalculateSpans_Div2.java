package leetcode.medium;

public class GeneratedCalculateSpans_Div2 {

    private OnlineStockSpan onlineStockSpan;

    @Test
    public void calculateSpans_Div2() {
        int[] prices = {5, 7, 6, 8};
        List<Integer> list = new ArrayList<>();
        onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.list = list;
        for (int i = 0; i < prices.length; i++) {
            onlineStockSpan.next(prices[i]);
        }
        int[] spans = onlineStockSpan.calculateSpans(prices);
        Assert.assertEquals(spans[0], 2);
        Assert.assertEquals(spans[1], 3);
        Assert.assertEquals(spans[2], 2);
        Assert.assertEquals(spans[3], 4);
    }

}