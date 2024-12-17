package leetcode.medium;

public class GeneratedTestCalculateSpans_MultipleIndices {

    @Test
    public void testCalculateSpans_MultipleIndices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.setPrices(new int[]{1, 2, 3, 4, 5});

        int[] result = onlineStockSpan.calculateSpans(0);
        assertThat(result).isEqualTo(new int[]{1});

        int index = 3;
        onlineStockSpan.setPrice(index + 1);
        onlineStockSpan.setPrice(index - 1);
        result = onlineStockSpan.calculateSpans(2);
        assertThat(result).isEqualTo(new int[]{4, 5});
    }

}