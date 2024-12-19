package ch.jalu.configme.configurationdata;

public class GeneratedTestGetAllCommentsNoPath {

    private CommentsConfiguration commentsConfiguration;

    @Before
    public void setup() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("comment1\n", "comment2"));
        commentsConfiguration = new CommentsConfiguration(map);
    }

    @Test
    public void testGetAllCommentsNoPath() {
        Map<String, List<String>> map = new HashMap<>();
        commentsConfiguration = new CommentsConfiguration(map);
        assertEquals(Collections.emptyList(), commentsConfiguration.getAllComments());
    }

}