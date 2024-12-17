package ch.jalu.configme.configurationdata;

public class GeneratedTestSetCommentPath {

    private CommentsConfiguration commentsConfiguration;

    @Before
    public void setup() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList());
        comments.put("path2", Arrays.asList());

        commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path1", "line1\nline2");
        commentsConfiguration.setComment("path2", "");
    }

    @Test
    public void testSetCommentPath() {
        commentsConfiguration.setComment("path3", "line3\nline4");
        assertTrue(commentsConfiguration.getAllComments().containsKey("path3"));
    }

}