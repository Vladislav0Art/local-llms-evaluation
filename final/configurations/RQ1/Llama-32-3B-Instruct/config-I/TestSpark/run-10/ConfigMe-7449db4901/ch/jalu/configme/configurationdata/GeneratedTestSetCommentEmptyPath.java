package ch.jalu.configme.configurationdata;

public class GeneratedTestSetCommentEmptyPath {

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
    public void testSetCommentEmptyPath() {
        String path = "";
        String commentLine1 = "comment1";
        String commentLine2 = "comment2";

        try {
            commentsConfiguration.setComment(path, commentLine1, commentLine2);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

}