package leetcode.medium;

public class GeneratedTestNext_Sorted {

    private static List<Integer> list = new ArrayList<>();

    @Before
    public void setup() {
        list.add(10);
    }

    @Test
    public void testNext_Sorted() {
        int price = 0;
        onlineStockSpan.next(price);
        assertEquals(1, list.size());
    }

}