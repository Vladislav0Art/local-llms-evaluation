package ch.jalu.configme.configurationdata;

public class GeneratedTestGetAllCommentsEmptyMap {

    private CommentsConfiguration commentsConfiguration;
    private Map<String, List<String>> comments;

    @Before
    public void setup() {
        comments = new HashMap<>();
        commentsConfiguration = new CommentsConfiguration(comments);
    }

    public void testConstructor() {
        assert commentsConfiguration.comments.isEmpty();
    }

    public void testConstructorWithMap() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path", Arrays.asList("comment1", "comment2"));
        commentsConfiguration = new CommentsConfiguration(map);
        assertEquals(map, commentsConfiguration.comments);
    }

    @Test
    public void testGetAllCommentsEmptyMap() {
        Map<String, List<String>> map = new HashMap<>();
        assertEquals(Collections.emptyMap(), commentsConfiguration.getAllComments());
    }

}