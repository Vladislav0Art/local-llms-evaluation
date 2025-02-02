package leetcode.medium;

public class GeneratedTestNext_NaN {

    private static List<Integer> list = new ArrayList<>();

    @Before
    public void setup() {
        list.add(10);
    }

    @Test
    public void testNext_NaN() {
        double price = Double.NaN;
        onlineStockSpan.next(price);
        assertOnlineStockSpanIsNaN(list, price);
    }

}