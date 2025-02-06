package ch.jalu.configme.configurationdata;

public class GeneratedSetComment_overwritesExistingCommentForPath {

    private static final String PATH = "/path/to/comment";
    private static final String NEWLINE = "\n";

    @Test
    public void setComment_overwritesExistingCommentForPath() {
        // Given:
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration(comments);
        String[] commentLines = {"new", "comment"};
        commentsConfig.setComment(PATH, NEWLINE, commentLines);

        // When:
        Map<String, List<String>> updatedComments = commentsConfig.getAllComments();

        // Then:
        assertEquals(Arrays.asList(commentLines), updatedComments.get(PATH));
    }

}