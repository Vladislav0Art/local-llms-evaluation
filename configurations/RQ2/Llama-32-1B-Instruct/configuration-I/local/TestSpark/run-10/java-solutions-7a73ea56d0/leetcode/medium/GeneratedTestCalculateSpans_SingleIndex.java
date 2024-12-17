package leetcode.medium;

public class GeneratedTestCalculateSpans_SingleIndex {

    @Test
    public void testCalculateSpans_SingleIndex() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.setPrices(new int[]{1, 2, 3, 4, 5});

        int[] result = onlineStockSpan.calculateSpans(2);
        assertThat(result).isEqualTo(new int[]{2, 3, 4, 5, 6});
    }

}