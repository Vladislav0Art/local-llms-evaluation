package leetcode.medium;

public class GeneratedTestNext_MultipleValues_10 {

    private static List<Integer> list = new ArrayList<>();

    @Before
    public void setup() {
        list.add(10);
    }

    @Test
    public void testNext_MultipleValues_10() {
        onlineStockSpan.calculateSpans(new int[]{9, 8, 7, 6});
        assertEquals(2, list.size());
    }

}