package ch.jalu.configme.configurationdata;

public class GeneratedTestSetCommentNoContent {

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
    public void testSetCommentNoContent() {
        String content = "";
        commentsConfiguration.setComment("path5", content);
        assertTrue(commentsConfiguration.getAllComments().containsKey("path5"));
    }

}