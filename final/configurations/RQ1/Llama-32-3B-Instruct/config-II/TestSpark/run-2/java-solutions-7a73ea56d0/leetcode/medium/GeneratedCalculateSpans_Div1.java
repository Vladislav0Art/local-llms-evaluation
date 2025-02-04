package leetcode.medium;

public class GeneratedCalculateSpans_Div1 {

    private OnlineStockSpan onlineStockSpan;

    @Test
    public void calculateSpans_Div1() {
        int[] prices = {1, 2, 3, 4, 5};
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
        Assert.assertEquals(spans[4], 5);
    }

}