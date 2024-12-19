package ch.jalu.configme.configurationdata;

public class GeneratedTestSetComment {

    private CommentsConfiguration commentsConfiguration;

    @Before
    public void setup() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("comment1\n", "comment2"));
        commentsConfiguration = new CommentsConfiguration(map);
    }

    @Test
    public void testSetComment() {
        commentsConfiguration.setComment("path1", "comment3");
        assertEquals(Arrays.asList("comment3\n"), commentsConfiguration.getAllComments().get("path1"));
    }

}