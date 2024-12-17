package leetcode.medium;

public class GeneratedTest {

    @Test
    public void testNext_SinglePrice() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.setPrice(1);
        int[] result = onlineStockSpan.next(1);
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void testNext_MultiplePrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.setPrice(5);
        onlineStockSpan.setPrice(10);
        int[] result = onlineStockSpan.next(new int[]{3, 2});
        assertThat(result).isEqualTo(new int[]{1, 2});

        onlineStockSpan.setPrice(8);
        onlineStockSpan.setPrice(4);
        result = onlineStockSpan.next(new int[]{6, 7});
        assertThat(result).isEqualTo(new int[]{5});
    }

    @Test
    public void testCalculateSpans_SingleIndex() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.setPrices(new int[]{1, 2, 3, 4, 5});

        int[] result = onlineStockSpan.calculateSpans(2);
        assertThat(result).isEqualTo(new int[]{2, 3, 4, 5, 6});
    }

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