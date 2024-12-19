package ch.jalu.configme.configurationdata;

public class GeneratedTestGetAllComments {

    private CommentsConfiguration commentsConfiguration;

    @Before
    public void setup() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("comment1\n", "comment2"));
        commentsConfiguration = new CommentsConfiguration(map);
    }

    @Test
    public void testGetAllComments() {
        commentsConfiguration = new CommentsConfiguration(new HashMap<>());
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("comment1"));
        commentsConfiguration.setComment("path1", Collections.singletonList("comment2"));
        assertEquals(Arrays.asList("comment2"), commentsConfiguration.getAllComments().get("path1"));
    }

}