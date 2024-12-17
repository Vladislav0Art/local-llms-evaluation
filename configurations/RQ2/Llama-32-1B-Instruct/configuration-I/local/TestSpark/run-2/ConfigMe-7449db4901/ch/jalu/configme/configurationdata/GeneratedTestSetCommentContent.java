package ch.jalu.configme.configurationdata;

public class GeneratedTestSetCommentContent {

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
    public void testSetCommentContent() {
        String content = "This is a sample comment with multiple lines.";
        commentsConfiguration.setComment("path4", content);
        List<String> lines = commentsConfiguration.getAllComments().get("path4");
        assertEquals(content, lines.get(0));
    }

}