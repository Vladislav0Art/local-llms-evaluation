package ch.jalu.configme.configurationdata;

public class GeneratedNewCommentsConfiguration_isCreatedWithExistingMap {

    private static final String PATH = "/path/to/comment";
    private static final String NEWLINE = "\n";

    @Test
    public void newCommentsConfiguration_isCreatedWithExistingMap() {
        // Given:
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put(PATH, Arrays.asList("existing", "comment"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(existingComments);

        // When:
        Map<String, List<String>> comments = commentsConfig.getAllComments();

        // Then:
        assertEquals(existingComments, comments);
    }

}