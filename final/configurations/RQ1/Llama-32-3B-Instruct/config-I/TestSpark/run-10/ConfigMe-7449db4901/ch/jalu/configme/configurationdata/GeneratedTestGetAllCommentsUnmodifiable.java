package ch.jalu.configme.configurationdata;

public class GeneratedTestGetAllCommentsUnmodifiable {

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
    public void testGetAllCommentsUnmodifiable() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path", Arrays.asList("comment1", "comment2"));
        commentsConfiguration.setComment("path", "comment1", "comment2");

        @SuppressWarnings("unchecked")
        Map<String, @UnmodifiableView List<String>> unmodifiableMap = (Map<String, @UnmodifiableView List<String>>) commentsConfiguration.getAllComments();
        assertEquals(map, unmodifiableMap);
    }

}