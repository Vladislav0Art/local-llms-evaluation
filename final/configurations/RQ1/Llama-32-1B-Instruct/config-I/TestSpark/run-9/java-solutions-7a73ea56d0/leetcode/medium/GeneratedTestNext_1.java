package leetcode.medium;

public class GeneratedTestNext_1 {

    private static List<Integer> list = new ArrayList<>();

    @Before
    public void setup() {
        list.add(10);
    }

    @Test
    public void testNext_1() {
        int price = 10;
        onlineStockSpan.next(price);
        assertEquals(1, list.size());
    }

}