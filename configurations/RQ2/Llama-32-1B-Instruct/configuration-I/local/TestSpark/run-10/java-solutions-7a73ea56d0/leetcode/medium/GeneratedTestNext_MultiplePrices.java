package leetcode.medium;

public class GeneratedTestNext_MultiplePrices {

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

}