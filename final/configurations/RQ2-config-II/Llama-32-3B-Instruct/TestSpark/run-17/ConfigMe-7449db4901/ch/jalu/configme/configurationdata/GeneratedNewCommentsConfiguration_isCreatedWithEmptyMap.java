package ch.jalu.configme.configurationdata;

public class GeneratedNewCommentsConfiguration_isCreatedWithEmptyMap {

    private static final String PATH = "/path/to/comment";
    private static final String NEWLINE = "\n";

    @Test
    public void newCommentsConfiguration_isCreatedWithEmptyMap() {
        // Given:
        CommentsConfiguration commentsConfig = new CommentsConfiguration();

        // When:
        Map<String, List<String>> comments = commentsConfig.getAllComments();

        // Then:
        assertTrue(comments.isEmpty());
    }

}