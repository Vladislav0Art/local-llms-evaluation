package ch.jalu.configme.configurationdata;

public class GeneratedSetComment_setsSingleNewlineAsEmptyLineWithoutCommentMarker {

    private static final String PATH = "/path/to/comment";
    private static final String NEWLINE = "\n";

    @Test
    public void setComment_setsSingleNewlineAsEmptyLineWithoutCommentMarker() {
        // Given:
        String path = PATH;
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String[] commentLines = {NEWLINE};
        commentsConfig.setComment(path, NEWLINE);

        // When:
        Map<String, List<String>> updatedComments = commentsConfig.getAllComments();

        // Then:
        assertEquals(0, updatedComments.get(path).size());
    }

}